package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.questions.Enabled;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.*;
import org.openqa.selenium.By;
import userinterfaces.*;

import java.nio.file.Path;
import java.nio.file.Paths;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static userinterfaces.CargaDeFormatosYContratosPage.*;
import static userinterfaces.CargaDeFormatosYContratosPage.LINK_CARGARCONTRATOS;
import static userinterfaces.GeneralesPage.*;
import static utils.ConstantesGenerales.*;

public class CargaDeFormatosYContratos implements Task
{
        
    public CargaDeFormatosYContratos()
    {
    }

    public static CargaDeFormatosYContratos delCliente()
    {
        return Tasks.instrumented(CargaDeFormatosYContratos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {

        int i=1;
        Target LINK_CARGARFORMATO = Target.the("Cargar formato").located(By.xpath("(//input[@accept='application/pdf'])["+i+"]"));
        while(actor.asksFor(Enabled.of(LINK_CARGARFORMATO)) == true)
        {
            Path fileToUpload = Paths.get("src/test/resources/documentos/DOCUMENTOS LESS PN/Cedula Natalia Carmona.pdf");
            actor.attemptsTo(
                    Upload.theFile(fileToUpload).to(LINK_CARGARFORMATO)
            );
            i++;
            LINK_CARGARFORMATO = Target.the("Adjuntar pdf").located(By.xpath("(//input[@accept='application/pdf'])["+i+"]"));
        }
        actor.wasAbleTo(
            WaitUntil.the(LBL_OPCIONCONTRATOS, isClickable()).forNoMoreThan(60).seconds(),
            Click.on(LBL_OPCIONCONTRATOS)
        );

        int e=1;
        while(e<getCANTIDADCONTRATOS())
        {
            Path fileToUpload = Paths.get("src/test/resources/documentos/DOCUMENTOS LESS PN/Contrato"+e+".pdf");
            actor.attemptsTo(
                    Upload.theFile(fileToUpload).to(LINK_CARGARCONTRATOS)
            );
            e++;
        }

        int f=1;
        Target CBBX_INPUTCONTRATOS = Target.the("Lista desplegable de contratos").located(By.xpath("(//div[@class='mat-form-field-flex'])["+f+"]"));
        Target CHBX_OPCIONCONTRATOS = Target.the("Opción contratos").located(By.xpath("(//span[@class='mat-option-text'])["+f+"]"));
        while(actor.asksFor(Enabled.of(CBBX_INPUTCONTRATOS)) == true)
        {
            actor.attemptsTo(
                    WaitUntil.the(CBBX_INPUTCONTRATOS, isClickable()).forNoMoreThan(120).seconds(),
                    Scroll.to(CBBX_INPUTCONTRATOS),
                    JavaScriptClick.on(CBBX_INPUTCONTRATOS),
                    WaitUntil.the(CHBX_OPCIONCONTRATOS, isClickable()).forNoMoreThan(120).seconds(),
                    JavaScriptClick.on(CHBX_OPCIONCONTRATOS)
            );
            f++;
            CBBX_INPUTCONTRATOS = Target.the("Lista desplegable de contratos").located(By.xpath("(//div[@class='mat-form-field-flex'])["+f+"]"));
            CHBX_OPCIONCONTRATOS = Target.the("Opción contratos").located(By.xpath("(//span[@class='mat-option-text'])["+f+"]"));
        }

        actor.attemptsTo(
                Click.on(BTN_CONTINUAR)
        );

    }
}


       
