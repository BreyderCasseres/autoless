package tasks.vinculacionpnsolofiduciaria;

import interations.SeleccionarEnListasJavaScript;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.questions.Enabled;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static userinterfaces.GeneralesPage.BTN_CONTINUAR;
import static userinterfaces.GeneralesPage.LBL_CARGANDO;
import static userinterfaces.SeleccionDeProductosPage.*;

public class SeleccionarProductosSoloEntidadFiduciaria implements Task
{

    public static SeleccionarProductosSoloEntidadFiduciaria porEntidad()
    {
        return Tasks.instrumented(SeleccionarProductosSoloEntidadFiduciaria.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
            WaitUntil.the(LBL_CARGANDO, isCurrentlyVisible()).forNoMoreThan(180).seconds(),
            WaitUntil.the(LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(180).seconds());

        int i = 1;
        Target CHBX_PRODUCTO = Target.the("Producto").located(By.xpath("(//label[@class='mat-checkbox-layout'])["+i+"]"));
        while(actor.asksFor(Enabled.of(CHBX_PRODUCTO)) == true)
        {
            actor.attemptsTo(
                    JavaScriptClick.on(CHBX_PRODUCTO)
            );
            i++;
            CHBX_PRODUCTO = Target.the("Producto").located(By.xpath("(//label[@class='mat-checkbox-layout'])["+i+"]"));
        }

        actor.attemptsTo(
            SeleccionarEnListasJavaScript.laOpcion(CBBX_SEGMENTODELCLIENTE,"Mesa Digital"),
            Click.on(BTN_CONTINUAR),
            WaitUntil.the(BTN_ACEPTARVINCULARPRODUCTOS, isClickable()).forNoMoreThan(120).seconds(),
            Click.on(BTN_ACEPTARVINCULARPRODUCTOS));
    }
}


       
