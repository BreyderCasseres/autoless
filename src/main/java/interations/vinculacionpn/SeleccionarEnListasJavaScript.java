package interations;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
import static userinterfaces.InformacionInicialClientePage.OPTION_SELECT;

public class SeleccionarEnListasJavaScript implements Task {

    private final Target inputTarget;
    private final String option;

    public SeleccionarEnListasJavaScript(Target inputTarget, String option) {
        this.inputTarget = inputTarget;
        this.option = option;
    }

    @Step("{0} select in the list the option '#option'")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(inputTarget, isCurrentlyVisible()).forNoMoreThan(60).seconds(),
                WaitUntil.the(inputTarget, isClickable()).forNoMoreThan(60).seconds(),
                JavaScriptClick.on(inputTarget),
                Click.on(OPTION_SELECT.of(option))
        );
    }

    public static SeleccionarEnListasJavaScript laOpcion(Target inputTarget, String option) {
        return Tasks.instrumented(SeleccionarEnListasJavaScript.class, inputTarget, option);
    }
}
