package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.questions.Enabled;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.*;
import org.openqa.selenium.By;
import java.nio.file.Path;
import java.nio.file.Paths;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static userinterfaces.GeneralesPage.*;
import static userinterfaces.ListadoDeDocumentosPage.*;

public class CargarDocumentos implements Task
{

    public static CargarDocumentos requeridos()
    {
        return Tasks.instrumented(CargarDocumentos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
            WaitUntil.the(LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(60).seconds(),
            WaitUntil.the(RBTN_SIDESEAAGREGARORDENANTE, isClickable()).forNoMoreThan(60).seconds(),
            JavaScriptClick.on(RBTN_SIDESEAAGREGARORDENANTE)
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
            JavaScriptClick.on(BTN_CONTINUAR)
        );
    }
}


       
