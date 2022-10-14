package tasks.vinculacionpnsinparticipantes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.questions.Enabled;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import java.nio.file.Path;
import java.nio.file.Paths;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotCurrentlyVisible;
import static userinterfaces.GeneralesPage.BTN_CONTINUAR;
import static userinterfaces.GeneralesPage.LBL_CARGANDO;
import static userinterfaces.InformacionFamiliarPage.*;
import static userinterfaces.InformacionTercerosAsociadosAlCreditoPage.RBTN_NODESEAAGREGARTERCEROASOCIADO;
import static userinterfaces.ListadoDeDocumentosPage.RBTN_NODESEAAGREGARORDENANTE;
import static userinterfaces.ListadoDeDocumentosPage.RBTN_SIDESEAAGREGARORDENANTE;

public class CargarDocumentosSinAgregarOrdenante implements Task
{

    public static CargarDocumentosSinAgregarOrdenante requeridos()
    {
        return Tasks.instrumented(CargarDocumentosSinAgregarOrdenante.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
            WaitUntil.the(LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(60).seconds(),
            WaitUntil.the(RBTN_SIDESEAAGREGARORDENANTE, isClickable()).forNoMoreThan(60).seconds(),
            JavaScriptClick.on(RBTN_NODESEAAGREGARORDENANTE)
        );
        Target LINK_ADJUNTARPDFINPUT = Target.the("Adjuntar pdf").located(By.xpath("(//input[@id='fileExplorer'])[1]"));
        while(actor.asksFor(Enabled.of(LINK_ADJUNTARPDFINPUT)) == true)
        {
            Path fileToUpload = Paths.get("src/test/resources/documentos/DOCUMENTOS LESS PN/Cedula Natalia Carmona.pdf");
            actor.attemptsTo(
                    Upload.theFile(fileToUpload).to(LINK_ADJUNTARPDFINPUT)
            );
            LINK_ADJUNTARPDFINPUT = Target.the("Adjuntar pdf").located(By.xpath("(//input[@id='fileExplorer'])[1]"));
        }
        actor.attemptsTo(
            WaitUntil.the(BTN_CONTINUAR, isClickable()).forNoMoreThan(120).seconds(),
            JavaScriptClick.on(BTN_CONTINUAR),
            WaitUntil.the(LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(120).seconds(),
            WaitUntil.the(LBL_CARGARVINCULOSFAMILIARES, isClickable()).forNoMoreThan(120).seconds(),
            Click.on(LBL_CARGARVINCULOSFAMILIARES),
            WaitUntil.the(LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(120).seconds(),
            WaitUntil.the(RBTN_NOTIENEVINCULOFAMILIAR, isClickable()).forNoMoreThan(60).seconds(),
            JavaScriptClick.on(RBTN_NOTIENEVINCULOFAMILIAR),
            WaitUntil.the(BTN_CONTINUAR, isClickable()).forNoMoreThan(120).seconds(),
            JavaScriptClick.on(BTN_CONTINUAR),
            WaitUntil.the(RBTN_NODESEAAGREGARTERCEROASOCIADO, isClickable()).forNoMoreThan(120).seconds(),
            JavaScriptClick.on(RBTN_NODESEAAGREGARTERCEROASOCIADO),
            JavaScriptClick.on(BTN_CONTINUAR)
        );
    }
}


       
