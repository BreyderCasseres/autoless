package tasks.vinculacionpnunificada;

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
import static userinterfaces.DescargaDeFormatosYContratosPage.*;
import static userinterfaces.GeneralesPage.BTN_CONTINUAR;
import static userinterfaces.GeneralesPage.LBL_CARGANDO;
import static utils.ConstantesGenerales.setCANTIDADCONTRATOS;

public class DescargarFormatosYContratos implements Task
{
        
    public DescargarFormatosYContratos()
    {
    }

    public static DescargarFormatosYContratos delCliente()
    {
        return Tasks.instrumented(DescargarFormatosYContratos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
            WaitUntil.the(LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(120).seconds(),
            WaitUntil.the(LBL_DECARGARFORMATOSYCONTRATOS, isClickable()).forNoMoreThan(60).seconds(),
            Click.on(LBL_DECARGARFORMATOSYCONTRATOS)
        );
        int i = 1;
        actor.attemptsTo(
                WaitUntil.the(LINK_DESCARGARFORMATO, isClickable()).forNoMoreThan(60).seconds()
        );

        Target LINK_DESCARGARFORMATO = Target.the("Descargar formato").located(By.xpath("(//tbody//td/mat-icon)["+i+"]"));
        System.out.println(actor.asksFor(Enabled.of(LINK_DESCARGARFORMATO)));
        while(actor.asksFor(Enabled.of(LINK_DESCARGARFORMATO)) == true)
        {
            actor.attemptsTo(
                    JavaScriptClick.on(LINK_DESCARGARFORMATO)
            );
            i++;
            LINK_DESCARGARFORMATO = Target.the("Descargar formato").located(By.xpath("(//tbody//td/mat-icon)["+i+"]"));
        }

        actor.attemptsTo(
            WaitUntil.the(LBL_OPCIONCONTRATOS, isClickable()).forNoMoreThan(60).seconds(),
            Click.on(LBL_OPCIONCONTRATOS),
            WaitUntil.the(BTN_DESCARGARTODO, isCurrentlyVisible()).forNoMoreThan(60).seconds()
        );

        /*HtmlTableValidationPage.verifyHtmlTableData();
        int t=1,d=1;
        String [] nomf = getDOCUMENTOS();
        Target NOMBRE_FORMULARIO = Target.the("nombre contrato o formulario").located(By.xpath("(//tbody//td/div)["+t+"]"));
        Target TABLE = Target.the("nombre contrato o formulario").located(By.xpath("(//tr//td[3])["+t+"]"));
        while(actor.asksFor(CurrentlyEnabled.of(TABLE)))
        {

            if(actor.asksFor(Value.of(TABLE))!=" "){
                nomf[d]= actor.asksFor(Text.of(NOMBRE_FORMULARIO));
                d++;
            }
            t++;
            NOMBRE_FORMULARIO = Target.the("nombre contrato o formulario").located(By.xpath("(//tbody//td/div)["+t+"]"));
        }*/
        int b = 1;
        Target LINK_DESCARGARCONTRATO = Target.the("Descargar contrato").located(By.xpath("(//tbody//td/mat-icon)["+b+"]"));
        //Target NOMBRE_FORMULARIO = Target.the("nombre contrato o formulario").located(By.xpath("(//tbody//td/div)["+b+"]"));
        while(actor.asksFor(Enabled.of(LINK_DESCARGARCONTRATO)) == true)
        {
            //nomf[b]= actor.asksFor(Text.of(NOMBRE_FORMULARIO));
            actor.attemptsTo(
                    JavaScriptClick.on(LINK_DESCARGARCONTRATO)
            );
            b++;
            LINK_DESCARGARCONTRATO = Target.the("Descargar contrato").located(By.xpath("(//tbody//td/mat-icon)["+b+"]"));
        }

        int c = 1;
            Target CANTIDADTR = Target.the("TR de tabla contratos").located(By.xpath("(//tbody//tr[@role='row'])["+c+"]"));
        while(actor.asksFor(Enabled.of(CANTIDADTR)) == true)
        {;
            c++;
            CANTIDADTR = Target.the("Descargar contrato").located(By.xpath("(//tbody//tr[@role='row'])["+c+"]"));
        }
        setCANTIDADCONTRATOS(c);

        actor.attemptsTo(
           WaitUntil.the(BTN_CONTINUAR, isClickable()).forNoMoreThan(120).seconds(),
            Click.on(BTN_CONTINUAR)
        );
    }
}


       
