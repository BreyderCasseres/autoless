package tasks;

import interations.SeleccionarEnListas;
import interations.SeleccionarEnListasJavaScript;
import models.setdata.vinculacionpn.InformacionInicialClienteData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.*;
import userinterfaces.*;
import userinterfaces.GeneralesPage;
import userinterfaces.InformacionInicialClientePage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class IngresarInformacionInicial implements Task
{
    private InformacionInicialClienteData informacionInicialClienteData;


    public IngresarInformacionInicial(InformacionInicialClienteData informacionInicialClienteData) {
        this.informacionInicialClienteData = informacionInicialClienteData;
    }

    public static IngresarInformacionInicial delCliente(InformacionInicialClienteData informacionInicialClienteData)
    {
        return Tasks.instrumented(IngresarInformacionInicial.class,informacionInicialClienteData);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(WaitUntil.the(InformacionInicialClientePage.BTN_VINCULARPERSONANATURAL, isClickable()).forNoMoreThan(15).seconds(),
            Click.on(InformacionInicialClientePage.BTN_VINCULARPERSONANATURAL));
       actor.attemptsTo(
            WaitUntil.the(GeneralesPage.LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(120).seconds(),
            WaitUntil.the(InformacionInicialClientePage.CBBX_TIPODEDOCUMENTOCLIENTE, isClickable()).forNoMoreThan(30).seconds(),
            SeleccionarEnListasJavaScript.laOpcion(InformacionInicialClientePage.CBBX_TIPODEDOCUMENTOCLIENTE,"Cédula"),
            Enter.theValue(informacionInicialClienteData.getNumeroIdentificacionCliente()).into(InformacionInicialClientePage.TXT_NUMEROIDENTIFICACIONCLIENTE),
            Click.on(InformacionInicialClientePage.BTN_CONTINUAR),
            WaitUntil.the(GeneralesPage.LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(30).seconds(),
            Enter.theValue(informacionInicialClienteData.getPrimerNombreCliente()).into(InformacionInicialClientePage.TXT_PRIMERNOMBRECLIENTE),
            Enter.theValue(informacionInicialClienteData.getSegundoNombreCliente()).into(InformacionInicialClientePage.TXT_SEGUNDONOMBRECLIENTE),
            Enter.theValue(informacionInicialClienteData.getPrimerApellidoCliente()).into(InformacionInicialClientePage.TXT_PRIMERAPELLIDOCLIENTE),
            Enter.theValue(informacionInicialClienteData.getSegundoApellidoCliente()).into(InformacionInicialClientePage.TXT_SEGUNDOAPELLIDOCLIENTE),
            Click.on(InformacionInicialClientePage.BTN_CONTINUAR));

    }
}


       
