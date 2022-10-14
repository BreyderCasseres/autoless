package tasks;

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
import userinterfaces.InformacionDeContactoPage;
import userinterfaces.InformacionPersonalPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotCurrentlyVisible;
import static userinterfaces.InformacionDeContactoPage.*;

public class IngresarInformacionDeContacto implements Task {
    private InformacionBasicaClienteData informacionBasicaClienteData;

    public IngresarInformacionDeContacto(InformacionBasicaClienteData informacionBasicaClienteData) {
        this.informacionBasicaClienteData = informacionBasicaClienteData;
    }

    public static IngresarInformacionDeContacto delCliente(InformacionBasicaClienteData informacionBasicaClienteData)
    {
        return Tasks.instrumented(IngresarInformacionDeContacto.class,informacionBasicaClienteData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CBBX_PAISRESIDENCIACLIENTE),
                Click.on(InformacionPersonalPage.CHBX_OPCIONPAIS1),
                Click.on(CBBX_DEPARTAMENTORESIDENCIACLIENTE),
                Click.on(InformacionPersonalPage.CHBX_OPCIONDEPARTAMENTO1),
                Click.on(CBBX_CIUDADRESIDENCIACLIENTE),
                Click.on(InformacionPersonalPage.CHBX_OPCIONCIUDAD1),
                Enter.theValue(informacionBasicaClienteData.getDireccionResidenciaCliente()).into(TXT_DIRECCIONRESIDENCIACLIENTE),
                Enter.theValue(informacionBasicaClienteData.getIndicativoTelefonoCliente()).into(TXT_INDICATIVOTELEFONOCLIENTE),
                Enter.theValue(informacionBasicaClienteData.getTelefonoCliente()).into(TXT_TELEFONOCLIENTE),
                Click.on(CBBX_INDICATIVOCELULARCLIENTE),
                Click.on(TXT_OPCIONINDICATIVOCELULARCLIENTE),
                Enter.theValue(informacionBasicaClienteData.getCelularCliente()).into(TXT_CELULARCLIENTE),
                Enter.theValue(informacionBasicaClienteData.getCorreoPersonalCliente()).into(TXT_CORREOPERSONALCLIENTE),
                Enter.theValue(informacionBasicaClienteData.getCorreoSecundarioCliente()).into(TXT_CORREOSECUNDARIOCLIENTE),
                Hit.the(Keys.TAB).into(TXT_CORREOSECUNDARIOCLIENTE),
                WaitUntil.the(GeneralesPage.LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(60).seconds(),
                WaitUntil.the(CHBX_VALIDACIONBIOMETRICA, isClickable()).forNoMoreThan(30).seconds(),
                Click.on(CHBX_VALIDACIONBIOMETRICA),
                Click.on(GeneralesPage.BTN_CONTINUAR)
        );
    }
}
