package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotCurrentlyVisible;
import static userinterfaces.GeneralesPage.BTN_CONTINUAR;
import static userinterfaces.GeneralesPage.LBL_CARGANDO;
import static userinterfaces.InformacionPerfilDeRiesgoPage.*;

public class SeleccionarPreguntasPerfil implements Task
{
        
    public SeleccionarPreguntasPerfil()
    {
    }

    public static SeleccionarPreguntasPerfil deRiesgo()
    {
        return Tasks.instrumented(SeleccionarPreguntasPerfil.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
            WaitUntil.the(LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(120).seconds(),
            WaitUntil.the(RBTN_PREGUNTAAOPCIONUNO, isClickable()).forNoMoreThan(60).seconds(),
            JavaScriptClick.on(RBTN_PREGUNTAAOPCIONUNO),
            JavaScriptClick.on(RBTN_PREGUNTABOPCIONDOS),
            JavaScriptClick.on(RBTN_PREGUNTACOPCIONTRES),
            JavaScriptClick.on(RBTN_PREGUNTADOPCIONUNO),
            JavaScriptClick.on(RBTN_PREGUNTAEOPCIONDOS),
            JavaScriptClick.on(RBTN_PREGUNTAFOPCIONTRES),
            JavaScriptClick.on(RBTN_PREGUNTAGOPCIONUNO),
            JavaScriptClick.on(RBTN_PREGUNTAHOPCIONDOS),
            Click.on(BTN_CONTINUAR));
    }
}


       
