package tasks;

import interations.SeleccionarEnListas;
import interations.SeleccionarEnListasJavaScript;
import models.setdata.vinculacionpn.InformacionTerceroData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static userinterfaces.GeneralesPage.BTN_CONTINUAR;
import static userinterfaces.InformacionTercerosPage.*;

public class IngresarInformacionDeParticipante implements Task
{
    private InformacionTerceroData informacionTerceroData;

    public IngresarInformacionDeParticipante(InformacionTerceroData informacionTerceroData) {
        this.informacionTerceroData = informacionTerceroData;
    }

    public static IngresarInformacionDeParticipante tercero(InformacionTerceroData informacionTerceroData)
    {
        return Tasks.instrumented(IngresarInformacionDeParticipante.class,informacionTerceroData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LINK_AGREGAR, isClickable()).forNoMoreThan(60).seconds(),
                Click.on(LINK_AGREGAR),
                //JavaScriptClick.on(LINK_AGREGAR),
                SeleccionarEnListas.laOpcion(CBBX_TIPOIDENTIFICACIONTERCERO, "Cédula"),
                Enter.theValue(informacionTerceroData.getNumeroIdentificacionTercero()).into(TXT_NUMEROIDENTIFICACIONTERCERO),
                Click.on(BTN_BUSCAR),
                Enter.theValue(informacionTerceroData.getPrimerNombreTercero()).into(TXT_PRIMERNOMBRETERCERO),
                Enter.theValue(informacionTerceroData.getSegundoNombreTercero()).into(TXT_SEGUNDONOMBRETERCERO),
                Enter.theValue(informacionTerceroData.getPrimerApellidoTercero()).into(TXT_PRIMERAPELLIDOTERCERO),
                Enter.theValue(informacionTerceroData.getSegundoApellidoTercero()).into(TXT_SEGUNDOAPELLIDOTERCERO),
                SeleccionarEnListasJavaScript.laOpcion(TXT_OCUPACIONTERCERO, "Empleado"),
                SeleccionarEnListasJavaScript.laOpcion(CBBX_CODIGOCIIUTERCERO, "0010 - Asalariados"),
                SeleccionarEnListasJavaScript.laOpcion(CBBX_VINCULOCONELCLIENTE, "Cuñado / Cuñada"),
                JavaScriptClick.on(RBTN_TERCERONOESDECLARANTEDERENTA),
                Enter.theValue(informacionTerceroData.getNombreEmpresaTercero()).into(TXT_NOMBREEMPRESATERCERO),
                Enter.theValue(informacionTerceroData.getCargoTercero()).into(TXT_CARGOTERCERO),
                SeleccionarEnListasJavaScript.laOpcion(CBBX_PAISEMPRESATERCERO, "COLOMBIA"),
                SeleccionarEnListasJavaScript.laOpcion(CBBX_DEPARTAMENTOEMPRESATERCERO, "ANTIOQUIA"),
                SeleccionarEnListasJavaScript.laOpcion(CBBX_CIUDADEMPRESATERCERO, "MEDELLIN"),
                Enter.theValue(informacionTerceroData.getDireccionEmpresaTercero()).into(TXT_DIRECCIONEMPRESATERCERO),
                Enter.theValue(informacionTerceroData.getIndicativoTelefonoEmpresaCliente()).into(TXT_INDICATIVOTELEFONOEMPRESACLIENTE),
                Enter.theValue(informacionTerceroData.getTelefonoEmpresaTercero()).into(TXT_TELEFONOEMPRESATERCERO),
                SeleccionarEnListasJavaScript.laOpcion(CBBX_INDICATIVOCELULAREMPRESATERCERO, "Colombia"),
                Enter.theValue(informacionTerceroData.getCelularEmpresaTercero()).into(TXT_CELULAREMPRESATERCERO),
                Click.on(BTN_CONTINUAR),
                Click.on(BTN_CONTINUAR));
    }
}


       
