package tasks;

import interations.SeleccionarEnListasJavaScript;
import models.setdata.vinculacionpn.InformacionPagoDividendoData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.*;
import userinterfaces.*;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static userinterfaces.GeneralesPage.*;
import static userinterfaces.GeneralesPage.LBL_CARGANDO;
import static userinterfaces.InformacionPagoDeDividendosPage.*;
import static userinterfaces.InformacionRelacionesBancariasPage.RBTN_SIDESEAAGREGARUNACUENTABANCARIA;

public class IngresarInformacionPago implements Task
{
    private InformacionPagoDividendoData informacionPagoDividendoData;

    public IngresarInformacionPago(InformacionPagoDividendoData informacionPagoDividendoData) {
        this.informacionPagoDividendoData = informacionPagoDividendoData;
    }

    public static IngresarInformacionPago dividendos(InformacionPagoDividendoData informacionPagoDividendoData)
    {
        return Tasks.instrumented(IngresarInformacionPago.class,informacionPagoDividendoData);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
            WaitUntil.the(LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(120).seconds(),
            WaitUntil.the(CBBX_PAGODIVIDENDOS, isClickable()).forNoMoreThan(120).seconds(),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_PAGODIVIDENDOS,"Cartera"),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_ANOMBREDEQUIENESTALACUENTA,"Cliente"),
            Enter.theValue(informacionPagoDividendoData.getCodigoOyd()).into(TXT_CODIGOOYD),
            Click.on(BTN_CONTINUAR)
        );
    }
}


       
