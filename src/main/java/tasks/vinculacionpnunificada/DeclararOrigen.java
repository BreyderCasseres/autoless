package tasks;

import models.setdata.vinculacionpn.InformacionOrigenDeFondosData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotCurrentlyVisible;
import static userinterfaces.GeneralesPage.BTN_CONTINUAR;
import static userinterfaces.GeneralesPage.LBL_CARGANDO;
import static userinterfaces.InformacionDeclaracionDeOrigenDeLosFondosPage.*;

public class DeclararOrigen implements Task
{
    private InformacionOrigenDeFondosData informacionOrigenDeFondosData;

    public DeclararOrigen(InformacionOrigenDeFondosData informacionOrigenDeFondosData) {
        this.informacionOrigenDeFondosData = informacionOrigenDeFondosData;
    }

    public static DeclararOrigen deLosFondos(InformacionOrigenDeFondosData informacionOrigenDeFondosData)
    {
        return Tasks.instrumented(DeclararOrigen.class,informacionOrigenDeFondosData);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
            WaitUntil.the(LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(120).seconds(),
            WaitUntil.the(CHBX_HONORARIOSYOCOMISIONES, isClickable()).forNoMoreThan(60).seconds(),
            JavaScriptClick.on(CHBX_HONORARIOSYOCOMISIONES),
            JavaScriptClick.on(CHBX_INVERSIONESYRENDIMIENTOSFINANCIEROS),
            JavaScriptClick.on(CHBX_PENSION),
            JavaScriptClick.on(CHBX_PRODUCTOACTIVIDADECONOMICA),
            JavaScriptClick.on(CHBX_RENTAS),
            JavaScriptClick.on(CHBX_SALARIOS),
            JavaScriptClick.on(CHBX_OTRO),
            WaitUntil.the(TXT_OTROCUAL, isClickable()).forNoMoreThan(60).seconds(),
            Enter.theValue(informacionOrigenDeFondosData.getOtroCual()).into(TXT_OTROCUAL),
            Enter.theValue(informacionOrigenDeFondosData.getObservaciones()).into(TXT_OBSERVACIONES),
            Click.on(BTN_CONTINUAR));
    }
}


       
