package tasks.vinculacionpnunificada;

import interations.SeleccionarEnListas;
import models.setdata.vinculacionpn.InformacionBasicaClienteData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import userinterfaces.GeneralesPage;

import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotCurrentlyVisible;
import static userinterfaces.InformacionPersonalPage.CBBX_GENEROCLIENTE;
import static userinterfaces.InformacionTributariaPage.*;

public class IngresarLaInformacionTributaria implements Task
{
    private InformacionBasicaClienteData informacionTributariaData;

    public IngresarLaInformacionTributaria(InformacionBasicaClienteData informacionTributariaData) {
        this.informacionTributariaData = informacionTributariaData;
    }

    public static IngresarLaInformacionTributaria delCliente(InformacionBasicaClienteData informacionTributariaData)

    {
        return Tasks.instrumented(IngresarLaInformacionTributaria.class,informacionTributariaData);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
            WaitUntil.the(RBTN_CLIENTEDECLARANTEDERENTA, isClickable()).forNoMoreThan(30).seconds(),
            Hit.the(Keys.ARROW_DOWN).into(RBTN_CLIENTEDECLARANTEDERENTA),
            Click.on(RBTN_CLIENTEDECLARANTEDERENTA),
            Click.on(RBTN_SIESCONTRIBUYENTEDELIMPUESTOSOBRELARENTA),
            Click.on(CBBX_REGIMENCONTRIBUYENTEIMPUESTOSOBRELARENTA),
            Click.on(CHBX_OPCIONREGIMENCONTRIBUYENTEIMPUESTOSOBRERENTA),
            Enter.theValue(informacionTributariaData.getDetalleRegimenContribuyenteImpuestoSobreRenta()).into(TXT_DETALLEREGIMENCONTRIBUYENTEIMPUESTOSOBRERENTA),
            Hit.the(Keys.ARROW_DOWN).into(RBTN_SIESAUTORRETENEDORDERENDIMIENTOFINANCIEROS),
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
            JavaScriptClick.on(RBTN_DEPENDEECONOMICAMENTEDEUNTERCERO),
            Click.on(GeneralesPage.BTN_CONTINUAR));
    }
}


       
