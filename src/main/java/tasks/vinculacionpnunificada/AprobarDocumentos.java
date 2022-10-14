package tasks;

import interations.SeleccionarEnListasJavaScript;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.questions.Enabled;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.*;
import org.openqa.selenium.By;
import userinterfaces.*;
import userinterfaces.GeneralesPage;

import java.nio.file.Path;
import java.nio.file.Paths;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static userinterfaces.GeneralesPage.LBL_CARGANDO;
import static userinterfaces.ListadoDeDocumentosPage.RBTN_SIDESEAAGREGARORDENANTE;
import static userinterfaces.RevisionDeDocumentosPage.*;

public class AprobarDocumentos implements Task
{

    public static AprobarDocumentos adjuntados()
    {
        return Tasks.instrumented(AprobarDocumentos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
                WaitUntil.the(LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(120).seconds(),
                WaitUntil.the(SLIDE_TIPOAPROBADO, isClickable()).forNoMoreThan(60).seconds()
        );

        Target SLIDE_TIPOAPROBADO = Target.the("Tipo aprobado").located(By.xpath("(//input[@aria-checked='false'])[1]"));
        while(actor.asksFor(Enabled.of(SLIDE_TIPOAPROBADO)) == true)
        {
            actor.attemptsTo(
                    JavaScriptClick.on(SLIDE_TIPOAPROBADO)
            );
            SLIDE_TIPOAPROBADO = Target.the("Tipo aprobado").located(By.xpath("(//input[@aria-checked='false'])[1]"));
        }
        actor.wasAbleTo(
            Click.on(GeneralesPage.BTN_CONTINUAR),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_INFORMACIONDELCLIENTEESCORRECTA,"Sí"),
            //Click.on(CBBX_INFORMACIONDELCLIENTEESCORRECTA),
            //SelectFromOptions.byVisibleText("Sí").from(CHBX_OPCIONINFORMACIONCLIENTEESCORRECTA),
            Click.on(BTN_ACEPTARREVISIONDEDOCUMENTOS));
    }
}


       
