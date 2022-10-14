package tasks.vinculacionpnsoloscb;

import models.setdata.vinculacionpn.InformacionFinancieraData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotCurrentlyVisible;
import static userinterfaces.GeneralesPage.BTN_CONTINUAR;
import static userinterfaces.GeneralesPage.LBL_CARGANDO;
import static userinterfaces.InformacionFinancieraPage.*;

public class IngresarInformacionFinancieraSoloEntidadSCB implements Task
{
    private InformacionFinancieraData informacionFinancieraData;

    public IngresarInformacionFinancieraSoloEntidadSCB(InformacionFinancieraData informacionFinancieraData) {
        this.informacionFinancieraData = informacionFinancieraData;
    }

    public static IngresarInformacionFinancieraSoloEntidadSCB delClienteYOOrdenante(InformacionFinancieraData informacionFinancieraData)
    {
        return Tasks.instrumented(IngresarInformacionFinancieraSoloEntidadSCB.class,informacionFinancieraData);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
            WaitUntil.the(LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(120).seconds(),
            WaitUntil.the(LBL_CARGARINFORMACIONFINANCIERA, isClickable()).forNoMoreThan(60).seconds(),
            Click.on(LBL_CARGARINFORMACIONFINANCIERA),
            WaitUntil.the(BTN_AGREGARINFORMACIONFINANCIERACLIENTE, isClickable()).forNoMoreThan(60).seconds(),
            Click.on(BTN_AGREGARINFORMACIONFINANCIERACLIENTE),
            Enter.theValue(informacionFinancieraData.getIngresoMensual()).into(TXT_INGRESOMENSUAL),
            Enter.theValue(informacionFinancieraData.getOtrosIngresos()).into(TXT_OTROSINGRESOS),
            Enter.theValue(informacionFinancieraData.getDetalleOtrosIngresos()).into(TXT_DETALLEOTROSINGRESOS),
            Enter.theValue(informacionFinancieraData.getEgresoMensual()).into(TXT_EGRESOMENSUAL),
            Enter.theValue(informacionFinancieraData.getActivo()).into(TXT_ACTIVO),
            Enter.theValue(informacionFinancieraData.getPasivo()).into(TXT_PASIVO),
            Click.on(BTN_CONTINUAR),
            Click.on(BTN_AGREGARINFORMACIONFINANCIERAORDENANTE),
            Enter.theValue(informacionFinancieraData.getIngresoMensualOrdenante()).into(TXT_INGRESOMENSUAL),
            Enter.theValue(informacionFinancieraData.getOtrosIngresosOrdenante()).into(TXT_OTROSINGRESOS),
            Enter.theValue(informacionFinancieraData.getDetalleOtrosIngresosOrdenante()).into(TXT_DETALLEOTROSINGRESOS),
            Enter.theValue(informacionFinancieraData.getEgresoMensualOrdenante()).into(TXT_EGRESOMENSUAL),
            Enter.theValue(informacionFinancieraData.getActivoOrdenante()).into(TXT_ACTIVO),
            Enter.theValue(informacionFinancieraData.getPasivoOrdenante()).into(TXT_PASIVO),
            Click.on(BTN_CONTINUAR),
            WaitUntil.the(BTN_CONTINUAR, isClickable()).forNoMoreThan(60).seconds(),
            Click.on(BTN_CONTINUAR));
    }
}


       
