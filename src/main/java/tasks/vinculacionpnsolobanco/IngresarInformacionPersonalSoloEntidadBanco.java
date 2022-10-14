package tasks.vinculacionpnsolobanco;

import models.setdata.vinculacionpn.InformacionBasicaClienteData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import userinterfaces.GeneralesPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotCurrentlyVisible;
import static userinterfaces.GeneralesPage.LBL_CARGANDO;
import static userinterfaces.InformacionPersonalPage.*;

public class IngresarInformacionPersonalSoloEntidadBanco implements Task
{
    private InformacionBasicaClienteData informacionBasicaClienteData;

    public IngresarInformacionPersonalSoloEntidadBanco(InformacionBasicaClienteData informacionBasicaClienteData) {
        this.informacionBasicaClienteData = informacionBasicaClienteData;
    }

    public static IngresarInformacionPersonalSoloEntidadBanco delCliente(InformacionBasicaClienteData informacionBasicaClienteData)
    {
        return Tasks.instrumented(IngresarInformacionPersonalSoloEntidadBanco.class,informacionBasicaClienteData);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
            WaitUntil.the(LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(120).seconds(),
            WaitUntil.the(CBBX_COMERCIALRM, isClickable()).forNoMoreThan(120).seconds(),
            Click.on(CBBX_COMERCIALRM),
            Enter.theValue(informacionBasicaClienteData.getOpcionComercial()).into(TXT_COMERCIAL),
            Click.on(CHBX_OPCIONCOMERCIAL),
            Click.on(CBBX_TIPODEENTREVISTA),
            Enter.theValue(informacionBasicaClienteData.getOpcionTipoEntrevista()).into(TXT_TIPOENTREVISTA),
            Click.on(CHBX_OPCIONTIPOENTREVISTA),
            Enter.theValue(informacionBasicaClienteData.getLugarEntrevista()).into(TXT_LUGARENTREVISTA),
            Enter.theValue(informacionBasicaClienteData.getFechaEntrevista()).into(TXT_FECHAENTREVISTA),
            Enter.theValue(informacionBasicaClienteData.getHoraEntrevista()).into(TXT_HORAENTREVISTA),
            Enter.theValue(informacionBasicaClienteData.getGrupoEconomicoCliente()).into(TXT_GRUPOECONOMICOCLIENTE),
            Click.on(TXT_CLASIFICACIONCLIENTE),
            Enter.theValue(informacionBasicaClienteData.getOpcionClasificacionCliente()).into(TXT_CLASIFICACIONCLIENTE),
            Click.on(CHBX_OPCIONTIPOENTREVISTA),
            Enter.theValue(informacionBasicaClienteData.getObservacionesEntrevista()).into(TXT_OBSERVACIONESENTREVISTA),
            Click.on(CHBX_ENTIDADBANCO),
            Click.on(CBBX_PAISEXPEDICIONDOCCLIENTE),
            Enter.theValue(informacionBasicaClienteData.getPaisExpedicionDocumento()).into(TXT_PAISEXPEDICIONDOCCLIENTE),
            Click.on(CHBX_OPCIONPAIS),
            Click.on(CBBX_DEPARTAMENTOEXPEDICIONDOCCLIENTE),
            Enter.theValue(informacionBasicaClienteData.getDepartamentoExpedicionDocumento()).into(TXT_DEPARTAMENTOEXPEDICIONDOCCLIENTE),
            Click.on(CHBX_OPCIONDEPARTAMENTO),
            Click.on(CBBX_CIUDADEXPEDICIONDOCCLIENTE), Enter.theValue(informacionBasicaClienteData.getCiudadExpedicionDocumento()).into(TXT_CIUDADEXPEDICIONDOCCLIENTE),
            Click.on(CHBX_OPCIONCIUDAD),
            Enter.theValue(informacionBasicaClienteData.getFechaExpedicionDocCliente()).into(TXT_FECHAEXPEDICIONDOCCLIENTE),
            Enter.theValue(informacionBasicaClienteData.getFechaNacimientoCliente()).into(TXT_FECHANACIMIENTOCLIENTE),
            Click.on(CBBX_PAISNACIMIENTOCLIENTE),
            Click.on(CHBX_OPCIONPAIS1),
            Click.on(CBBX_DEPARTAMENTONACIMIENTOCLIENTE),
            Click.on(CHBX_OPCIONDEPARTAMENTO1),
            Click.on(CBBX_CIUDADNACIMIENTOCLIENTE),
            Click.on(CHBX_OPCIONCIUDAD1),
            Click.on(CBBX_NACIONALIDADCLIENTE),
            Click.on(CHBX_OPCIONPAIS1),
            Hit.the(Keys.TAB).into(CBBX_GENEROCLIENTE),
            Hit.the(Keys.ARROW_DOWN).into(CBBX_GENEROCLIENTE),
            Hit.the(Keys.TAB).into(CBBX_ESTADOCIVILCLIENTE),
            Hit.the(Keys.ARROW_DOWN).into(CBBX_ESTADOCIVILCLIENTE),
            Click.on(RBTN_CLIENTEPEP),
            Enter.theValue(informacionBasicaClienteData.getJustifiquePep()).into(TXT_JUSTIFIQUEPEP),
            Click.on(GeneralesPage.BTN_CONTINUAR)
        );
    }
}


       
