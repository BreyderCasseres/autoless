package tasks.vinculacionpnsinparticipantes;

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

public class IngresarRelacionesBancariasSolo implements Task
{
    private InformacionBancariaData informacionBancariaData;

    public IngresarRelacionesBancariasSolo(InformacionBancariaData informacionBancariaData) {
        this.informacionBancariaData = informacionBancariaData;
    }

    public static IngresarRelacionesBancariasSolo delCliente(InformacionBancariaData informacionBancariaData)
    {
        return Tasks.instrumented(IngresarRelacionesBancariasSolo.class,informacionBancariaData);
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
            SeleccionarEnListasJavaScript.laOpcion(CBBX_ANOMBREDEQUIENESTALACUENTA, " Cliente "),
            Enter.theValue(informacionBancariaData.getNombrePersonalizado()).into(TXT_NOMBREPERSONALIZADO),
            JavaScriptClick.on(RBTN_CUENTALOCAL),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_ENTIDADFINANCIERA,"Banco Btg Pactual Colombia S.A."),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_TIPODECUENTA,"Ahorros"),
            Enter.theValue(informacionBancariaData.getNumeroDeCuenta()).into(TXT_NUMERODECUENTA),
            JavaScriptClick.on(CHBX_ENTIDADBANCO),
            JavaScriptClick.on(CHBX_ENTIDADSOCIEDADCOMISIONISTADEBOLSA),
            JavaScriptClick.on(CHBX_ENTIDADSOCIEDADFIDUCIARIA),
            Click.on(BTN_CONTINUAR),
            WaitUntil.the(LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(60).seconds(),
            WaitUntil.the(BTN_CONTINUAR, isClickable()).forNoMoreThan(60).seconds(),
            Click.on(BTN_CONTINUAR));
    }
}


       
