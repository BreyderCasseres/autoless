package tasks;

import interations.SeleccionarEnListas;
import models.setdata.vinculacionpn.InformacionBasicaClienteData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.GeneralesPage;
import userinterfaces.InformacionPersonalPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotCurrentlyVisible;
import static userinterfaces.InformacionLaboralPage.*;
import static userinterfaces.InformacionTercerosPage.CBBX_TIPOIDENTIFICACIONTERCERO;

public class IngresarInformacionLaboral implements Task {

    private InformacionBasicaClienteData informacionBasicaClienteData;

    public IngresarInformacionLaboral(InformacionBasicaClienteData informacionBasicaClienteData) {
        this.informacionBasicaClienteData = informacionBasicaClienteData;
    }

    public static IngresarInformacionLaboral delCliente(InformacionBasicaClienteData informacionBasicaClienteData)
    {
        return Tasks.instrumented(IngresarInformacionLaboral.class,informacionBasicaClienteData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(GeneralesPage.LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(30).seconds(),
                SeleccionarEnListas.laOpcion(CBBX_OCUPACIONCLIENTE, "Empleado"),
                SeleccionarEnListas.laOpcion(CBBX_CODIGOCIIU, " 0010 - ASALARIADOS "),
                //Click.on(CBBX_CODIGOCIIU),
                //Click.on(CHBX_OPCIONCODIGOCIIU),
                Click.on(CBBX_VINCULOBTG),
                Click.on(CBBX_OPCIONVINCULOBTG),
                Click.on(RBTN_SEVINCULAATRAVESDEUNAPODERADO),
                Enter.theValue(informacionBasicaClienteData.getNombreEmpresaCliente()).into(TXT_NOMBREEMPRESACLIENTE),
                Enter.theValue(informacionBasicaClienteData.getCargoCliente()).into(TXT_CARGOCLIENTE),
                Click.on(CBBX_PAISEMPRESACLIENTE),
                Enter.theValue(informacionBasicaClienteData.getPaisEmpresa()).into(TXT_PAISEMPRESACLIENTE),
                Click.on(InformacionPersonalPage.CHBX_OPCIONPAIS),
                Click.on(CBBX_DEPARTAMENTOEMPRESACLIENTE),
                Enter.theValue(informacionBasicaClienteData.getDepartamentoEmpresa()).into(TXT_DEPARTAMENTOEMPRESACLIENTE),
                Click.on(CHBX_OPCIONDEPARTAMENTO),
                Click.on(CBBX_CIUDADEMPRESACLIENTE),
                Enter.theValue(informacionBasicaClienteData.getCiudadEmpresa()).into(TXT_CIUDADEMPRESACLIENTE),
                Click.on(InformacionPersonalPage.CHBX_OPCIONCIUDAD),
                Enter.theValue(informacionBasicaClienteData.getDireccionEmpresaCliente()).into(TXT_DIRECCIONEMPRESACLIENTE),
                Enter.theValue(informacionBasicaClienteData.getIndicativoEmpresaCliente()).into(TXT_INDICATIVOEMPRESACLIENTE),
                Enter.theValue(informacionBasicaClienteData.getTelefonoEmpresaCliente()).into(TXT_TELEFONOEMPRESACLIENTE)
        );
    }
}
