package tasks.vinculacionpnsolobanco;

import interations.SeleccionarEnListasJavaScript;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static userinterfaces.GeneralesPage.BTN_CONTINUAR;
import static userinterfaces.GeneralesPage.LBL_CARGANDO;
import static userinterfaces.SeleccionDeProductosPage.*;

public class SeleccionarProductosSoloEntidadBanco implements Task
{

    public static SeleccionarProductosSoloEntidadBanco porEntidad()
    {
        return Tasks.instrumented(SeleccionarProductosSoloEntidadBanco.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
            WaitUntil.the(LBL_CARGANDO, isCurrentlyVisible()).forNoMoreThan(180).seconds(),
            WaitUntil.the(LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(180).seconds(),
            WaitUntil.the(CHBX_CDT, isCurrentlyVisible()).forNoMoreThan(120).seconds(),
            WaitUntil.the(CHBX_CDT, isClickable()).forNoMoreThan(120).seconds(),
            JavaScriptClick.on(CHBX_CDT),
            JavaScriptClick.on(CHBX_CREDITOCOMERCIAL),
            JavaScriptClick.on(CHBX_CREDITOLOMBARDO),
            JavaScriptClick.on(CHBX_CUENTACORRIENTE),
            JavaScriptClick.on(RBTN_CUENTACORRIENTESIAPLICASOBREGIRO),
            JavaScriptClick.on(CHBX_DERIVADOSNOESTANDARIZADOSBANCO),
            JavaScriptClick.on(CHBX_DIVISASBANCO),
            JavaScriptClick.on(CHBX_GARANTIASBANCARIAS),
            JavaScriptClick.on(CHBX_OPERACIONESDELIQUIDEZ),
            JavaScriptClick.on(RBTN_NOCUENTACONEXCEPCIONDEFIRMACODEUDOROPAGARE),
            JavaScriptClick.on(CHBX_RENTAFIJABANCO),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_SEGMENTODELCLIENTE,"Mesa Digital"),
            Click.on(BTN_CONTINUAR),
            WaitUntil.the(BTN_ACEPTARVINCULARPRODUCTOS, isClickable()).forNoMoreThan(120).seconds(),
            Click.on(BTN_ACEPTARVINCULARPRODUCTOS));
    }
}


       
