package tasks;

import interations.SeleccionarEnListas;
import models.setdata.vinculacionpn.InformacionDivisasData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.*;
import org.codehaus.groovy.vmplugin.v6.Java6;
import userinterfaces.*;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static userinterfaces.GeneralesPage.*;
import static userinterfaces.InformacionDivisasPage.*;

public class IngresarInformacionDivisas implements Task
{
    private InformacionDivisasData informacionDivisasData;

    public IngresarInformacionDivisas(InformacionDivisasData informacionDivisasData) {
        this.informacionDivisasData = informacionDivisasData;
    }

    public static IngresarInformacionDivisas delCliente(InformacionDivisasData informacionDivisasData)
    {
        return Tasks.instrumented(IngresarInformacionDivisas.class,informacionDivisasData);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
            WaitUntil.the(LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(60).seconds(),
            WaitUntil.the(RBTN_SITIENECUENTASDECOMPENSACION, isClickable()).forNoMoreThan(60).seconds(),
            JavaScriptClick.on(RBTN_SITIENECUENTASDECOMPENSACION),
            JavaScriptClick.on(RBTN_SITIENEGIROSLOCALES),
            Enter.theValue(informacionDivisasData.getCuentaBancariaNumero()).into(TXT_CUENTABANCARIANUMERO),
            SeleccionarEnListas.laOpcion(CBBX_TIPODECUENTA, "Ahorros"),
            SeleccionarEnListas.laOpcion(CBBX_ENTIDADFINANCIERA, "BANCO BTG PACTUAL COLOMBIA S.A."),
            Enter.theValue(informacionDivisasData.getBeneficiarioOTitular()).into(TXT_BENEFICIARIOOTITULAR),
            JavaScriptClick.on(RBTN_SITIENEGIROSINTERNACIONALES),
            Enter.theValue(informacionDivisasData.getNombreDelBeneficiarioDeLaCuenta()).into(TXT_NOMBREDELBENEFICIARIODELACUENTA),
            Enter.theValue(informacionDivisasData.getNumeroDeCuentaDelBeneficiario()).into(TXT_NUMERODECUENTADELBENEFICIARIO),
            Enter.theValue(informacionDivisasData.getBancoBeneficiario()).into(TXT_BANCOBENEFICIARIO),
            Enter.theValue(informacionDivisasData.getCodigoSwiftOAba()).into(TXT_CODIGOSWIFTOABA),
            Enter.theValue(informacionDivisasData.getBancoIntermediario()).into(TXT_BANCOINTERMEDIARIO),
            Enter.theValue(informacionDivisasData.getSegundoCodigoSwiftOAba()).into(TXT_SEGUNDOCODIGOSWIFTOABA),
            WaitUntil.the(BTN_CONTINUAR, isCurrentlyVisible()).forNoMoreThan(60).seconds(),
            WaitUntil.the(BTN_CONTINUAR, isClickable()).forNoMoreThan(60).seconds(),
            JavaScriptClick.on(BTN_CONTINUAR));
    }
}


       
