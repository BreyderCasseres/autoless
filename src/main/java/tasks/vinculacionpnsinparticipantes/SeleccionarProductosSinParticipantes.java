package tasks.vinculacionpnsinparticipantes;

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

public class SeleccionarProductosSinParticipantes implements Task
{

    public static SeleccionarProductosSinParticipantes porEntidad()
    {
        return Tasks.instrumented(SeleccionarProductosSinParticipantes.class);
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
            JavaScriptClick.on(CHBX_OPERACIONESDELIQUIDEZ),
            JavaScriptClick.on(RBTN_NOCUENTACONEXCEPCIONDEFIRMACODEUDOROPAGARE),
            JavaScriptClick.on(CHBX_RENTAFIJABANCO),
            JavaScriptClick.on(CHBX_APTS),
            JavaScriptClick.on(CHBX_ACCIONES),
            JavaScriptClick.on(CHBX_DERIVADOSESTANDARIZADOSSCB),
            JavaScriptClick.on(RBTN_NOCUENTACONEXCEPCIONDEFIRMACODEUDOROPAGAREDE),
            JavaScriptClick.on(CHBX_DERIVADOSNOESTANDARIZADOSSCB),
            JavaScriptClick.on(RBTN_NOCUENTACONEXCEPCIONDEFIRMACODEUDOROPAGAREDNE),
            JavaScriptClick.on(CHBX_DIVISASSCB),
            JavaScriptClick.on(CHBX_FONDODEINVERSIONCOLECTIVA),
            JavaScriptClick.on(CHBX_FONDODEINVERSIONCOLECTIVALISTADOENBOLSA),
            JavaScriptClick.on(CHBX_ACTIVOS),
            JavaScriptClick.on(RBTN_NOCUENTACONEXCEPCIONDEFIRMACODEUDOROPAGAREACTIVOS),
            JavaScriptClick.on(CHBX_PASIVOS),
            JavaScriptClick.on(RBTN_NOCUENTACONEXCEPCIONDEFIRMACODEUDOROPAGAREPASIVOS),
            JavaScriptClick.on(CHBX_SIMULTANEAS),
            JavaScriptClick.on(RBTN_NOCUENTACONEXCEPCIONDEFIRMACODEUDOROPAGARESIMULTANEAS),
            JavaScriptClick.on(CHBX_ACCIONESORIGINADORAS),
            JavaScriptClick.on(RBTN_NOCUENTACONEXCEPCIONDEFIRMACODEUDOROPAGAREAO),
            JavaScriptClick.on(CHBX_ACCIONESRECEPTORAS),
            JavaScriptClick.on(RBTN_NOCUENTACONEXCEPCIONDEFIRMACODEUDOROPAGAREAR),
            JavaScriptClick.on(CHBX_RENTAFIJASCB),
            JavaScriptClick.on(CHBX_SERVICIODEPAGOBTG),
            JavaScriptClick.on(CHBX_FONDOVOLUNTARIODEPENSIONES),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_SEGMENTODELCLIENTE,"Mesa Digital"),
            Click.on(BTN_CONTINUAR),
            WaitUntil.the(BTN_ACEPTARVINCULARPRODUCTOS, isClickable()).forNoMoreThan(120).seconds(),
            Click.on(BTN_ACEPTARVINCULARPRODUCTOS));
    }
}


       
