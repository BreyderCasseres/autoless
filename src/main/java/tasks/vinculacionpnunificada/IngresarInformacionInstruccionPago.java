package tasks;

import interations.SeleccionarEnListasJavaScript;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.*;
import userinterfaces.*;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static userinterfaces.GeneralesPage.*;
import static userinterfaces.GeneralesPage.LBL_CARGANDO;
import static userinterfaces.InformacionInstruccionPagoRendimientosPage.*;
import static userinterfaces.InformacionPagoDeDividendosPage.CBBX_PAGODIVIDENDOS;

public class IngresarInformacionInstruccionPago implements Task
{
    private final String detalle;
    
    public IngresarInformacionInstruccionPago(String detalle)
    {
        this.detalle = detalle;
    }

    public static IngresarInformacionInstruccionPago rendimientos(String detalle)
    {
        return Tasks.instrumented(IngresarInformacionInstruccionPago.class,detalle);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
            WaitUntil.the(LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(120).seconds(),
            WaitUntil.the(CBBX_INSTRUCCIONPAGORENDIMIENTO, isClickable()).forNoMoreThan(60).seconds(),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_INSTRUCCIONPAGORENDIMIENTO,"Cuenta Bancaria otras entidades"),
            Enter.theValue(detalle).into(TXT_DETALLE),
            Click.on(BTN_CONTINUAR));
    }
}


       
