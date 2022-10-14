package questions.vinculacionpn;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.questions.Enabled;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.TextValue;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static utils.ConstantesGenerales.setCANTIDADCONTRATOS;

public class ValidarReplicacionExitosa implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        int a = 1;
        Target TR_ESTADOREPLICACION = Target.the("Tr estado replicacion").located(By.xpath("(//tbody/tr//div[contains(text(),'Exitoso')])["+a+"]"));
        while(actor.asksFor(Enabled.of(TR_ESTADOREPLICACION)) == true)
        {
            a++;
            TR_ESTADOREPLICACION = Target.the("Tr estado replicacion").located(By.xpath("(//tbody/tr//div[contains(text(),'Exitoso')])["+a+"]"));
        }

        return (a == 5);
    }
}
