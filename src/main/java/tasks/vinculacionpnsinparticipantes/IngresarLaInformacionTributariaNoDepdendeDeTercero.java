package tasks.vinculacionpnsinparticipantes;

import interations.SeleccionarEnListas;
import models.setdata.vinculacionpn.InformacionBasicaClienteData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.GeneralesPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotCurrentlyVisible;
import static userinterfaces.GeneralesPage.*;
import static userinterfaces.InformacionTributariaPage.*;

public class IngresarLaInformacionTributariaNoDepdendeDeTercero implements Task
{
    private InformacionBasicaClienteData informacionTributariaData;

    public IngresarLaInformacionTributariaNoDepdendeDeTercero(InformacionBasicaClienteData informacionTributariaData) {
        this.informacionTributariaData = informacionTributariaData;
    }

    public static IngresarLaInformacionTributariaNoDepdendeDeTercero delCliente(InformacionBasicaClienteData informacionTributariaData)

    {
        return Tasks.instrumented(IngresarLaInformacionTributariaNoDepdendeDeTercero.class,informacionTributariaData);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
            Click.on(RBTN_CLIENTEDECLARANTEDERENTA),
            Click.on(RBTN_SIESCONTRIBUYENTEDELIMPUESTOSOBRELARENTA),
            Click.on(CBBX_REGIMENCONTRIBUYENTEIMPUESTOSOBRELARENTA),
            Click.on(CHBX_OPCIONREGIMENCONTRIBUYENTEIMPUESTOSOBRERENTA),
            Enter.theValue(informacionTributariaData.getDetalleRegimenContribuyenteImpuestoSobreRenta()).into(TXT_DETALLEREGIMENCONTRIBUYENTEIMPUESTOSOBRERENTA),
            Click.on(RBTN_SIESAUTORRETENEDORDERENDIMIENTOFINANCIEROS),
            Enter.theValue(informacionTributariaData.getNumeroResolucionAutorretenedorRendimientosFinancieros()).into(TXT_NUMERORESOLUCIONAUTORRETENEDORRENDIMIENTOSFINANCIEROS),
            Scroll.to(TXT_NUMERORESOLUCIONAUTORRETENEDORRENDIMIENTOSFINANCIEROS),
            WaitUntil.the(RBTN_ESRESPONSABLEDEIVA, isClickable()).forNoMoreThan(60).seconds(),
            JavaScriptClick.on(RBTN_ESRESPONSABLEDEIVA),
            JavaScriptClick.on(RBTN_ESCONTRIBUYANTEDELIMPUESTOINDUSTRIAYCOMERCIO),
            SeleccionarEnListas.laOpcion(CBBX_MUNICIPIOUNOCONTRIBUYENTEINDUSTRIAYCOMERCIO,"ALEJANDRIA"),
            Click.on(LINK_AGREGARMAS),
            SeleccionarEnListas.laOpcion(CBBX_MUNICIPIODOSCONTRIBUYENTEINDUSTRIAYCOMERCIO,"BELLO"),
            Click.on(LINK_AGREGARMAS),
            SeleccionarEnListas.laOpcion(CBBX_MUNICIPIOTRESCONTRIBUYENTEINDUSTRIAYCOMERCIO,"SABANETA"),
            JavaScriptClick.on(RBTN_NODEPENDEECONOMICAMENTEDEUNTERCERO),
            Click.on(BTN_CONTINUAR),
            WaitUntil.the(LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(60).seconds(),
            Click.on(BTN_CONTINUAR)
        );
    }
}


       
