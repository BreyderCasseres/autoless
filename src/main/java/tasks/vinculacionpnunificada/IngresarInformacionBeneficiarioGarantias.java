package tasks;

import interations.SeleccionarEnListasJavaScript;
import models.setdata.vinculacionpn.InformacionBeneficiarioGarantiasData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.*;
import org.openqa.selenium.By;
import userinterfaces.*;

import java.nio.file.Path;
import java.nio.file.Paths;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static userinterfaces.GeneralesPage.*;
import static userinterfaces.GeneralesPage.LBL_CARGANDO;
import static userinterfaces.InformacionBeneficiarioGarantiasBancariasPage.*;
import static userinterfaces.InformacionTercerosAsociadosAlCreditoPage.RBTN_SIDESEAAGREGARTERCEROASOCIADO;

public class IngresarInformacionBeneficiarioGarantias implements Task
{
    private InformacionBeneficiarioGarantiasData informacionBeneficiarioGarantiasData;

    public IngresarInformacionBeneficiarioGarantias(InformacionBeneficiarioGarantiasData informacionBeneficiarioGarantiasData) {
        this.informacionBeneficiarioGarantiasData = informacionBeneficiarioGarantiasData;
    }

    public static IngresarInformacionBeneficiarioGarantias bancarias(InformacionBeneficiarioGarantiasData informacionBeneficiarioGarantiasData)
    {
        return Tasks.instrumented(IngresarInformacionBeneficiarioGarantias.class,informacionBeneficiarioGarantiasData);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
            WaitUntil.the(LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(180).seconds(),
            WaitUntil.the(LINK_AGREGARBENEFICIARIOGARANTIASBANCARIAS, isClickable()).forNoMoreThan(60).seconds(),
            JavaScriptClick.on(LINK_AGREGARBENEFICIARIOGARANTIASBANCARIAS),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_TIPOIDENTIFICACIONBENEFICIARIOGARANTIAS,"Pasaporte"),
            Enter.theValue(informacionBeneficiarioGarantiasData.getNumeroIdentificacionBeneficiarioGarantias()).into(TXT_NUMEROIDENTIFICACIONBENEFICIARIOGARANTIAS),
            Click.on(BTN_BUSCARBENEFICIARIOGARANTIAS),
            Enter.theValue(informacionBeneficiarioGarantiasData.getPrimerNombreBeneficiarioGarantias()).into(TXT_PRIMERNOMBREBENEFICIARIOGARANTIAS),
            Enter.theValue(informacionBeneficiarioGarantiasData.getSegundoNombreBeneficiarioGarantias()).into(TXT_SEGUNDONOMBREBENEFICIARIOGARANTIAS),
            Enter.theValue(informacionBeneficiarioGarantiasData.getPrimerApellidoBeneficiarioGarantias()).into(TXT_PRIMERAPELLIDOBENEFICIARIOGARANTIAS),
            Enter.theValue(informacionBeneficiarioGarantiasData.getSegundoApellidoBeneficiarioGarantias()).into(TXT_SEGUNDOAPELLIDOBENEFICIARIOGARANTIAS),
            Enter.theValue(informacionBeneficiarioGarantiasData.getFechaExpedicionDocBeneficiarioGarantias()).into(TXT_FECHAEXPEDICIONDOCBENEFICIARIOGARANTIAS),
            Enter.theValue(informacionBeneficiarioGarantiasData.getFechaVigenciaDocBeneficiarioGarantias()).into(TXT_FECHAVIGENCIADOCBENEFICIARIOGARANTIAS)
        );
 // Falta cargar el documento de identidad bug en el aplicativo
        actor.attemptsTo(
            WaitUntil.the(LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(60).seconds(),
            JavaScriptClick.on(BTN_CONTINUAR),
            WaitUntil.the(LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(60).seconds(),
            JavaScriptClick.on(BTN_CONTINUAR)
        );
    }
}


       
