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
import static userinterfaces.InformacionConceptoAmlPage.*;

public class DarConcepto implements Task
{
    private final String conceptoAml;
    
    public DarConcepto(String conceptoAml)
    {
        this.conceptoAml = conceptoAml;
    }

    public static DarConcepto aml(String conceptoAml)
    {
        return Tasks.instrumented(DarConcepto.class,conceptoAml);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
            WaitUntil.the(LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(120).seconds(),
            WaitUntil.the(TXT_VERIFICARAML, isClickable()).forNoMoreThan(60).seconds(),
            Click.on(TXT_VERIFICARAML),
            Click.on(BTN_DARCONCEPTOAML),
            JavaScriptClick.on(CHBX_NIVELRIESGOPEP),
            Enter.theValue(conceptoAml).into(TXT_CONCEPTOAML),
            JavaScriptClick.on(RBTN_CONCEPTOPOSITIVO),
            //Click.on(RBTN_CONCEPTOPOSITIVO),
            Click.on(BTN_GUARDARCONCEPTO),
            Click.on(BTN_ENVIARCONCEPTO)
        );
    }
}


       
