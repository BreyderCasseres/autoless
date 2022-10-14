package tasks.vinculacionpnsoloscb;

import interations.SeleccionarEnListasJavaScript;
import models.setdata.vinculacionpn.InformacionBancariaData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static userinterfaces.GeneralesPage.BTN_CONTINUAR;
import static userinterfaces.GeneralesPage.LBL_CARGANDO;
import static userinterfaces.InformacionRelacionesBancariasPage.*;

public class IngresarRelacionesBancariasSoloSCB implements Task
{
    private InformacionBancariaData informacionBancariaData;

    public IngresarRelacionesBancariasSoloSCB(InformacionBancariaData informacionBancariaData) {
        this.informacionBancariaData = informacionBancariaData;
    }

    public static IngresarRelacionesBancariasSoloSCB delClienteOTercero(InformacionBancariaData informacionBancariaData)
    {
        return Tasks.instrumented(IngresarRelacionesBancariasSoloSCB.class,informacionBancariaData);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
            WaitUntil.the(LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(120).seconds(),
            WaitUntil.the(RBTN_SIDESEAAGREGARUNACUENTABANCARIA, isClickable()).forNoMoreThan(60).seconds(),
            JavaScriptClick.on(RBTN_SIDESEAAGREGARUNACUENTABANCARIA),
            WaitUntil.the(LINK_AGREGARCUENTA, isCurrentlyVisible()).forNoMoreThan(60).seconds(),
            WaitUntil.the(LINK_AGREGARCUENTA, isClickable()).forNoMoreThan(60).seconds(),
            Click.on(LINK_AGREGARCUENTA),
            WaitUntil.the(CBBX_ANOMBREDEQUIENESTALACUENTA, isClickable()).forNoMoreThan(120).seconds(),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_ANOMBREDEQUIENESTALACUENTA, " Tercero "),
            Enter.theValue(informacionBancariaData.getNombrePersonalizado()).into(TXT_NOMBREPERSONALIZADO),
            Enter.theValue(informacionBancariaData.getNombreTitular()).into(TXT_NOMBRETITULAR),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_TIPOIDENTIFICACIONTITULAR,"Cédula"),
            Enter.theValue(informacionBancariaData.getNumeroIdentificacion()).into(TXT_NUMEROIDENTIFICACIONTITULAR),
            JavaScriptClick.on(RBTN_CUENTALOCAL),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_ENTIDADFINANCIERA,"Banco Btg Pactual Colombia S.A."),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_TIPODECUENTA,"Ahorros"),
            Enter.theValue(informacionBancariaData.getNumeroDeCuenta()).into(TXT_NUMERODECUENTA),
            Click.on(BTN_CONTINUAR),
            WaitUntil.the(LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(60).seconds(),
            WaitUntil.the(BTN_CONTINUAR, isClickable()).forNoMoreThan(60).seconds(),
            Click.on(BTN_CONTINUAR));
    }
}


       
