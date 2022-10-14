package tasks;

import interations.SeleccionarEnListasJavaScript;
import models.setdata.vinculacionpn.InformacionTerceroAsociadoData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.questions.Enabled;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.*;
import org.openqa.selenium.By;
import userinterfaces.*;

import java.nio.file.Path;
import java.nio.file.Paths;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static userinterfaces.GeneralesPage.*;
import static userinterfaces.GeneralesPage.LBL_CARGANDO;
import static userinterfaces.InformacionOrdenantesPage.LINK_AGREGARORDENANTE;
import static userinterfaces.InformacionTercerosAsociadosAlCreditoPage.*;

public class IngresarInformacionTerceroAsociado implements Task
{
    private InformacionTerceroAsociadoData informacionTerceroAsociadoData;

    public IngresarInformacionTerceroAsociado(InformacionTerceroAsociadoData informacionTerceroAsociadoData) {
        this.informacionTerceroAsociadoData = informacionTerceroAsociadoData;
    }

    public static IngresarInformacionTerceroAsociado alCredito(InformacionTerceroAsociadoData informacionTerceroAsociadoData)
    {
        return Tasks.instrumented(IngresarInformacionTerceroAsociado.class,informacionTerceroAsociadoData);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
            WaitUntil.the(LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(120).seconds(),
            WaitUntil.the(RBTN_SIDESEAAGREGARTERCEROASOCIADO, isClickable()).forNoMoreThan(60).seconds(),
            JavaScriptClick.on(RBTN_SIDESEAAGREGARTERCEROASOCIADO),
            JavaScriptClick.on(LINK_AGREGARTERCEROASOCIADO),
            WaitUntil.the(CBBX_TIPOIDENTIFICACIONTERCEROASOCIADO, isCurrentlyVisible()).forNoMoreThan(120).seconds(),
            WaitUntil.the(CBBX_TIPOIDENTIFICACIONTERCEROASOCIADO, isClickable()).forNoMoreThan(120).seconds(),
            MoveMouse.to(CBBX_TIPOIDENTIFICACIONTERCEROASOCIADO),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_TIPOIDENTIFICACIONTERCEROASOCIADO,"Cédula"),
            Enter.theValue(informacionTerceroAsociadoData.getNumeroIdentificacionTerceroAsociado()).into(TXT_NUMEROIDENTIFICACIONTERCEROASOCIADO),
            JavaScriptClick.on(BTN_CONSULTARDOCUMENTOTERCEROASOCIADO),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_TIPODETERCERO,"Avalista"),
            Enter.theValue(informacionTerceroAsociadoData.getPrimerNombreTerceroAsociado()).into(TXT_PRIMERNOMBRETERCEROASOCIADO),
            Enter.theValue(informacionTerceroAsociadoData.getSegundoNombreTerceroAsociado()).into(TXT_SEGUNDONOMBRETERCEROASOCIADO),
            Enter.theValue(informacionTerceroAsociadoData.getPrimeroApellidoTerceroAsociado()).into(TXT_PRIMEROAPELLIDOTERCEROASOCIADO),
            Enter.theValue(informacionTerceroAsociadoData.getSegundoApellidoTerceroAsociado()).into(TXT_SEGUNDOAPELLIDOTERCEROASOCIADO),
            Enter.theValue(informacionTerceroAsociadoData.getFechaExpedicionDocTerceroAsociado()).into(TXT_FECHAEXPEDICIONDOCTERCEROASOCIADO),
            Enter.theValue(informacionTerceroAsociadoData.getFechaNacimientoTerceroAsociado()).into(TXT_FECHANACIMIENTOTERCEROASOCIADO),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_PAISNACIMIENTOTERCEROASOCIADO,"COLOMBIA"),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_DEPARTAMENTONACIMIENTOTERCEROASOCIADO,"BOGOTA"),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_CIUDADNACIMIENTOTERCEROASOCIADO,"BOGOTA D.C."),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_NACIONALIDADTERCEROASOCIADO,"COLOMBIA"),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_ESTADOCIVILTERCEROASOCIADO," Casado "),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_PAISRESIDENCIATERCEROASOCIADO,"COLOMBIA"),
            SeleccionarEnListasJavaScript.laOpcion(CHBX_DEPARTAMENTORESIDENCIATERCEROASOCIADO,"BOGOTA"),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_CIUDADRESIDENCIATERCEROASOCIADO,"BOGOTA D.C."),
            Enter.theValue(informacionTerceroAsociadoData.getDireccionResidenciaTerceroAsociado()).into(TXT_DIRECCIONRESIDENCIATERCEROASOCIADO),
            Enter.theValue(informacionTerceroAsociadoData.getIndicativoTelefonoTerceroAsociado()).into(TXT_INDICATIVOTELEFONOTERCEROASOCIADO),
            Enter.theValue(informacionTerceroAsociadoData.getTelefonoTerceroAsociado()).into(TXT_TELEFONOTERCEROASOCIADO),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_INDICATIVOCELULARTERCEROASOCIADO,"Colombia"),
            Enter.theValue(informacionTerceroAsociadoData.getCelularTerceroAsociado()).into(TXT_CELULARTERCEROASOCIADO),
            Enter.theValue(informacionTerceroAsociadoData.getCorreoTerceroAsociado()).into(TXT_CORREOTERCEROASOCIADO),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_OCUPACIONTERCEROASOCIADO,"Otra"),
            Enter.theValue(informacionTerceroAsociadoData.getOtraCualOcupacionTerceroAsociado()).into(TXT_OTRACUALOCUPACIONTERCEROASOCIADO),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_CODIGOCIIUTERCEROASOCIADO,"0090 - RENTISTAS DE CAPITAL, SOLO PARA PERSONAS NATURALES")
        );

        int i = 1;
        Target LINK_ADJUNTARPDFINPUT = Target.the("Adjuntar pdf").located(By.xpath("(//input[@id='fileExplorer'])["+i+"]"));
        while(actor.asksFor(Enabled.of(LINK_ADJUNTARPDFINPUT)) == true)
        {
            Path fileToUpload = Paths.get("src/test/resources/documentos/DOCUMENTOS LESS PN/Cedula Natalia Carmona.pdf");
            actor.attemptsTo(
                    Upload.theFile(fileToUpload).to(LINK_ADJUNTARPDFINPUT)
            );
            i++;
             LINK_ADJUNTARPDFINPUT = Target.the("Adjuntar pdf").located(By.xpath("(//input[@id='fileExplorer'])["+i+"]"));
        }
        actor.attemptsTo(
            WaitUntil.the(BTN_CONTINUAR2, isClickable()).forNoMoreThan(120).seconds(),
            JavaScriptClick.on(BTN_CONTINUAR2),
            WaitUntil.the(BTN_CONTINUAR3, isCurrentlyVisible()).forNoMoreThan(120).seconds(),
            WaitUntil.the(BTN_CONTINUAR3, isClickable()).forNoMoreThan(120).seconds(),
            JavaScriptClick.on(BTN_CONTINUAR3)
        );
    }
}


       
