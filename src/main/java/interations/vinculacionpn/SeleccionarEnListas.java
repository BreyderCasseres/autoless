package interations;

import static userinterfaces.InformacionInicialClientePage.OPTION_SELECT;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class SeleccionarEnListas implements Interaction {

    private final Target inputTarget;
    private final String option;

    public SeleccionarEnListas(Target inputTarget, String option) {
        this.inputTarget = inputTarget;
        this.option = option;
    }

    @Step("{0} select in the list the option '#option'")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(inputTarget),
                Click.on(OPTION_SELECT.of(option))
        );
    }

    public static SeleccionarEnListas laOpcion(Target inputTarget, String option) {
        return Tasks.instrumented(SeleccionarEnListas.class, inputTarget, option);
    }
}
