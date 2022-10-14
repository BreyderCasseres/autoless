package tasks;

import interations.SeleccionarEnListas;
import interations.SeleccionarEnListasJavaScript;
import models.setdata.vinculacionpn.InformacionOrdenanteData;
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
import static userinterfaces.InformacionOrdenantesPage.*;

public class IngresarInformacionParticipante implements Task
{
    private InformacionOrdenanteData informacionOrdenanteData;

    public IngresarInformacionParticipante(InformacionOrdenanteData informacionOrdenanteData) {
        this.informacionOrdenanteData = informacionOrdenanteData;
    }

    public static IngresarInformacionParticipante ordenante(InformacionOrdenanteData informacionOrdenanteData)
    {
        return Tasks.instrumented(IngresarInformacionParticipante.class,informacionOrdenanteData);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
            WaitUntil.the(LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(120).seconds(),
            WaitUntil.the(LINK_AGREGARORDENANTE, isCurrentlyVisible()).forNoMoreThan(120).seconds(),
            WaitUntil.the(LINK_AGREGARORDENANTE, isClickable()).forNoMoreThan(120).seconds(),
            JavaScriptClick.on(LINK_AGREGARORDENANTE),
            WaitUntil.the(CBBX_TIPOIDENTIFICACIONORDENANTE, isCurrentlyVisible()).forNoMoreThan(120).seconds(),
            WaitUntil.the(CBBX_TIPOIDENTIFICACIONORDENANTE, isClickable()).forNoMoreThan(120).seconds(),
            SeleccionarEnListas.laOpcion(CBBX_TIPOIDENTIFICACIONORDENANTE,"Pasaporte"),
            Enter.theValue(informacionOrdenanteData.getNumeroIdentificacionOrdenante()).into(TXT_NUMEROIDENTIFICACIONORDENANTE),
            Click.on(BTN_CONSULTARDOCUMENTOORDENANTE),
            JavaScriptClick.on(RBTN_SIESPARTERELACIONADOCONELCLIENTE),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_RELACIONCONELCLIENTE,"OTRO"),
            Enter.theValue(informacionOrdenanteData.getPrimerNombreOrdenante()).into(TXT_PRIMERNOMBREORDENANTE),
            Enter.theValue(informacionOrdenanteData.getSegundoNombreOrdenante()).into(TXT_SEGUNDONOMBREORDENANTE),
            Enter.theValue(informacionOrdenanteData.getPrimerApellidoOrdenante()).into(TXT_PRIMERAPELLIDOORDENANTE),
            Enter.theValue(informacionOrdenanteData.getSegundoApellidoOrdenante()).into(TXT_SEGUNDOAPELLIDOORDENANTE),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_PAISEXPEDICIONDOCORDENANTE,"COLOMBIA"),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_DEPARTAMENTOEXPEDICIONDOCORDENANTE,"ATLANTICO"),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_CIUDADEXPEDICIONDOCORDENANTE,"BARRANQUILLA"),
            WaitUntil.the(TXT_FECHAEXPEDICIONDOCORDENANTE, isClickable()).forNoMoreThan(120).seconds(),
            SendKeys.of(informacionOrdenanteData.getFechaExpedicionDocOrdenante()).into(TXT_FECHAEXPEDICIONDOCORDENANTE),
            WaitUntil.the(TXT_FECHAVIGENCIADOCORDENANTE, isClickable()).forNoMoreThan(120).seconds(),
            SendKeys.of(informacionOrdenanteData.getFechaVigenciaDocOrdenante()).into(TXT_FECHAVIGENCIADOCORDENANTE),
            WaitUntil.the(TXT_FECHANACIMIENTOORDENANTE, isClickable()).forNoMoreThan(120).seconds(),
            SendKeys.of(informacionOrdenanteData.getFechaNacimientoOrdenante()).into(TXT_FECHANACIMIENTOORDENANTE),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_PAISNACIMIENTOORDENANTE,"COLOMBIA"),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_DEPARTAMENTONACIMIENTOORDENANTE,"ANTIOQUIA"),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_CIUDADNACIMIENTOORDENANTE,"MEDELLIN"),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_PAISRESIDENCIAORDENANTE,"COLOMBIA"),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_DEPARTAMENTORESIDENCIAORDENANTE,"ANTIOQUIA"),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_CIUDADRESIDENCIAORDENANTE,"MEDELLIN"),
            Enter.theValue(informacionOrdenanteData.getDireccionResidenciaOrdenante()).into(TXT_DIRECCIONRESIDENCIAORDENANTE),
            Enter.theValue(informacionOrdenanteData.getIndicativoTelefonoOrdenante()).into(TXT_INDICATIVOTELEFONOORDENANTE),
            Enter.theValue(informacionOrdenanteData.getTelefonoOrdenante()).into(TXT_TELEFONOORDENANTE),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_INDICATIVOCELULARORDENANTE,"Colombia"),
            Enter.theValue(informacionOrdenanteData.getCelularOrdenante()).into(TXT_CELULARORDENANTE),
            Enter.theValue(informacionOrdenanteData.getCorreoOrdenante()).into(TXT_CORREOORDENANTE),
            JavaScriptClick.on(CHBX_USARCORREOPARARECIBIRINFORMACIONDELCLIENTE),
            JavaScriptClick.on(CHBX_YACUENTACONVALIDACIONBIOMETRICA),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_OCUPACIONORDENANTE,"Otra"),
            Enter.theValue(informacionOrdenanteData.getOtraOcupacionOrdenante()).into(TXT_OTRAOCUPACIONORDENANTE),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_CODIGOCIIUORDENANTE,"0082 - PERSONAS NATURALES SUBSIDIADAS POR TERCEROS")
        );
        Target LINK_AGREGARDOCUMENTOORDENANTEINPUT = Target.the("Agregar documento ordenante").located(By.xpath("//input[@accept='application/pdf']"));
        Path fileToUpload = Paths.get("src/test/resources/documentos/DOCUMENTOS LESS PN/Cedula Natalia Carmona.pdf");
        actor.attemptsTo(
                Upload.theFile(fileToUpload).to(LINK_AGREGARDOCUMENTOORDENANTEINPUT)
        );
        actor.attemptsTo(
            WaitUntil.the(BTN_CONTINUAR, isClickable()).forNoMoreThan(120).seconds(),
            Click.on(BTN_CONTINUAR),
            WaitUntil.the(LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(60).seconds(),
            WaitUntil.the(BTN_CONTINUARCSS, isCurrentlyVisible()).forNoMoreThan(60).seconds(),
            WaitUntil.the(BTN_CONTINUARCSS, isClickable()).forNoMoreThan(60).seconds(),
            JavaScriptClick.on(BTN_CONTINUARCSS)
        );
    }
}


       
