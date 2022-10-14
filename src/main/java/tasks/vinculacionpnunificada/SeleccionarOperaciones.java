package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.*;
import userinterfaces.*;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static userinterfaces.GeneralesPage.*;
import static userinterfaces.GeneralesPage.LBL_CARGANDO;
import static userinterfaces.InformacionInstruccionPagoRendimientosPage.CBBX_INSTRUCCIONPAGORENDIMIENTO;
import static userinterfaces.InformacionOperacionesInternacionalesPage.*;

public class SeleccionarOperaciones implements Task
{

    public static SeleccionarOperaciones internacionales()
    {
        return Tasks.instrumented(SeleccionarOperaciones.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
            WaitUntil.the(LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(120).seconds(),
            WaitUntil.the(RBTN_SIREALIZAOPERACIONESENMONEDAEXTRANJERA, isClickable()).forNoMoreThan(60).seconds(),
            JavaScriptClick.on(RBTN_SIREALIZAOPERACIONESENMONEDAEXTRANJERA),
            JavaScriptClick.on(CHBX_CUENTASBANCARIAS),
            JavaScriptClick.on(CHBX_ENDEUDAMIENTOEXTERNO),
            JavaScriptClick.on(CHBX_EXPORTACION),
            JavaScriptClick.on(CHBX_IMPORTACION),
            JavaScriptClick.on(CHBX_INVERSIONESINTERNACIONALES),
            JavaScriptClick.on(CHBX_MERCADONOREGULADO),
            Click.on(BTN_CONTINUAR));
    }
}


       
