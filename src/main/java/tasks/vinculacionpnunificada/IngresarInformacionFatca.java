package tasks;

import interations.SeleccionarEnListas;
import interations.SeleccionarEnListasJavaScript;
import models.setdata.vinculacionpn.InformacionFatcaData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.*;
import userinterfaces.*;
import userinterfaces.GeneralesPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static userinterfaces.GeneralesPage.*;
import static userinterfaces.InformacionFatcaPage.*;

public class IngresarInformacionFatca implements Task
{
    private InformacionFatcaData informacionFatcaData;

    public IngresarInformacionFatca(InformacionFatcaData informacionFatcaData) {
        this.informacionFatcaData = informacionFatcaData;
    }
    public static IngresarInformacionFatca delCliente(InformacionFatcaData informacionFatcaData)
    {
        return Tasks.instrumented(IngresarInformacionFatca.class,informacionFatcaData);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
            WaitUntil.the(LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(180).seconds(),
            WaitUntil.the(RBTN_SIESRESIDENTEFISCALENCOLOMBIA, isCurrentlyVisible()).forNoMoreThan(180).seconds(),
            WaitUntil.the(RBTN_SIESRESIDENTEFISCALENCOLOMBIA, isClickable()).forNoMoreThan(180).seconds(),
            JavaScriptClick.on(RBTN_SIESRESIDENTEFISCALENCOLOMBIA),
            //WaitUntil.the(RBTN_SITIENETINRESIDENCIAFISCALCOLOMBIA, isClickable()).forNoMoreThan(120).seconds(),
            JavaScriptClick.on(RBTN_SITIENETINRESIDENCIAFISCALCOLOMBIA),
            Enter.theValue(informacionFatcaData.getTinColombia()).into(TXT_TINCOLOMBIA),
            JavaScriptClick.on(RBTN_SIESRESIDENTEFISCALPAISESDIFERENTECOLOMBIA),
            WaitUntil.the(CBBX_PAISRESIDENTEDIFERENTEACOLOMBIA, isClickable()).forNoMoreThan(120).seconds(),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_PAISRESIDENTEDIFERENTEACOLOMBIA, "ESPAÑA"),
            JavaScriptClick.on(RBTN_NOTIENETINRESIDENCIAFISCALPAISDIFERENTECOLOMBIA),
            JavaScriptClick.on(RBTN_PAISDIFERENTECOLOMBIANOEMITETIN),
            Click.on(BTN_AGREGAROTROPAIS),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_OTROPAISRESIDENTEDIFERENTEACOLOMBIA,"ARGENTINA"),
            JavaScriptClick.on(RBTN_NOTIENETINRESIDENCIAFISCALOTROPAISDIFERENTECOLOMBIA),
            JavaScriptClick.on(RBTN_NOESTAHABILITADOENOTROPAISDIFERENTECOLOMBIAPARAOBTENERTIN),
            Enter.theValue(informacionFatcaData.getExpliquePorQueNoHabilitadoEnOtroPaisDiferenteColombiaParaObtenerTin()).into(TXT_EXPLIQUEPORQUENOHABILITADOENOTROPAISDIFERENTECOLOMBIAPARAOBTENERTIN),
            JavaScriptClick.on(RBTN_SIESCIUDADANOOTIENEPERMISORESIDENCIAENPAISESDIFERENTECOLOMBIA),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_PAISCIUDADANOOPERMISORESIDENCIAPAISESDIFERENTECOLOMBIA,"ALEMANIA"),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_RELACIONPAISCIUDADANOOPERMISORESIDENCIA,"Ciudadano"),
            Click.on(BTN_CONTINUAR));
    }
}


       
