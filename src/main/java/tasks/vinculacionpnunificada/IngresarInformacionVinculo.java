package tasks;

import interations.SeleccionarEnListas;
import interations.SeleccionarEnListasJavaScript;
import models.setdata.vinculacionpn.InformacionFamiliarData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.*;
import userinterfaces.*;
import userinterfaces.GeneralesPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static userinterfaces.GeneralesPage.*;
import static userinterfaces.GeneralesPage.LBL_CARGANDO;
import static userinterfaces.InformacionFamiliarPage.*;
import static userinterfaces.ListadoDeDocumentosPage.RBTN_SIDESEAAGREGARORDENANTE;

public class IngresarInformacionVinculo implements Task
{
    private InformacionFamiliarData informacionFamiliarData;

    public IngresarInformacionVinculo(InformacionFamiliarData informacionFamiliarData) {
        this.informacionFamiliarData = informacionFamiliarData;
    }

    public static IngresarInformacionVinculo familiar(InformacionFamiliarData informacionFamiliarData)
    {
        return Tasks.instrumented(IngresarInformacionVinculo.class,informacionFamiliarData);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
            WaitUntil.the(LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(120).seconds(),
            WaitUntil.the(LBL_CARGARVINCULOSFAMILIARES, isClickable()).forNoMoreThan(120).seconds(),
            Click.on(LBL_CARGARVINCULOSFAMILIARES),
            WaitUntil.the(LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(120).seconds(),
            WaitUntil.the(RBTN_SITIENEVINCULOFAMILIAR, isClickable()).forNoMoreThan(60).seconds(),
            JavaScriptClick.on(RBTN_SITIENEVINCULOFAMILIAR),
            JavaScriptClick.on(LINK_AGREGARFAMILIAR),
            WaitUntil.the(CBBX_TIPOIDENTIFICACIONFAMILIAR, isCurrentlyVisible()).forNoMoreThan(120).seconds(),
            WaitUntil.the(CBBX_TIPOIDENTIFICACIONFAMILIAR, isClickable()).forNoMoreThan(120).seconds(),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_TIPOIDENTIFICACIONFAMILIAR, "Pasaporte"),
            Enter.theValue(informacionFamiliarData.getNumeroIdentificacionFamiliar()).into(TXT_NUMEROIDENTIFICACIONFAMILIAR),
            Click.on(BTN_CONSULTARDOCUMENTO),
            Enter.theValue(informacionFamiliarData.getPrimerApellidoFamiliar()).into(TXT_PRIMERNOMBREFAMILIAR),
            Enter.theValue(informacionFamiliarData.getSegundoNombreFamiliar()).into(TXT_SEGUNDONOMBREFAMILIAR),
            Enter.theValue(informacionFamiliarData.getPrimerApellidoFamiliar()).into(TXT_PRIMERAPELLIDOFAMILIAR),
            Enter.theValue(informacionFamiliarData.getSegundoApellidoFamiliar()).into(TXT_SEGUNDOAPELLIDOFAMILIAR),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_TIPOVINCULO, "Empleado BTG"),
            SeleccionarEnListasJavaScript.laOpcion(CBBX_PARENTESCO, "Primo / Prima "),
            Click.on(BTN_CONTINUAR),
            Click.on(BTN_CONTINUAR)
        );
    }
}


       
