package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotCurrentlyVisible;
import static userinterfaces.GeneralesPage.LBL_CARGANDO;
import static userinterfaces.InformacionConceptoOficialDeCumplimientoPage.*;

public class DarConceptoOficial implements Task
{
    private final String conceptoOficialDeCumplimiento;
    
    public DarConceptoOficial(String conceptoOficialDeCumplimiento)
    {
        this.conceptoOficialDeCumplimiento = conceptoOficialDeCumplimiento;
    }

    public static DarConceptoOficial deCumplimiento(String conceptoOficialDeCumplimiento)
    {
        return Tasks.instrumented(DarConceptoOficial.class,conceptoOficialDeCumplimiento);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
            WaitUntil.the(LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(120).seconds(),
            WaitUntil.the(LBL_VERIFICAROFICIALDECUMPLIMIENTO, isClickable()).forNoMoreThan(60).seconds(),
            Click.on(LBL_VERIFICAROFICIALDECUMPLIMIENTO),
            Click.on(BTN_DARCONCEPTOOFICIALDECUMPLIMIENTO),
            Enter.theValue(conceptoOficialDeCumplimiento).into(TXT_CONCEPTOOFICIALDECUMPLIMIENTO),
            JavaScriptClick.on(RBTN_CONCEPTOPOSITIVOOC),
            //Click.on(RBTN_CONCEPTOPOSITIVOOC),
            Click.on(BTN_GUARDARCONCEPTO),
            Click.on(BTN_ENVIARCONCEPTOOC)
        );
    }
}


       
