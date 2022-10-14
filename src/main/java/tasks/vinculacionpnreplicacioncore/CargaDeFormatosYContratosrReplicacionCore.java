package tasks.vinculacionpnreplicacioncore;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.questions.Enabled;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import userinterfaces.vinculacionpn.EstadoReplicacionCorePage;

import java.nio.file.Path;
import java.nio.file.Paths;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static userinterfaces.CargaDeFormatosYContratosPage.LBL_OPCIONCONTRATOS;
import static userinterfaces.CargaDeFormatosYContratosPage.LINK_CARGARCONTRATOS;
import static userinterfaces.GeneralesPage.BTN_CONTINUAR;
import static utils.ConstantesGenerales.getCANTIDADCONTRATOS;

public class CargaDeFormatosYContratosrReplicacionCore implements Task
{

    public CargaDeFormatosYContratosrReplicacionCore()
    {
    }

    public static CargaDeFormatosYContratosrReplicacionCore delCliente()
    {
        return Tasks.instrumented(CargaDeFormatosYContratosrReplicacionCore.class);
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
                Click.on(BTN_CONTINUAR),
                Click.on(EstadoReplicacionCorePage.LBL_ESTADOREPLICACIONCORE)
        );

    }
}


       
