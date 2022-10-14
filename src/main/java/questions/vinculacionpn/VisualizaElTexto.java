package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
import static userinterfaces.GeneralesPage.LBL_CLIENTECREADOEXITOSAMENTE;
import static userinterfaces.GeneralesPage.LBL_POPUPCLIENTECREADO;

public class VisualizaElTexto implements Question<Boolean>
{
    private String texto;

    public VisualizaElTexto(String texto) {this.texto = texto;}


    @Override
    public Boolean answeredBy(Actor actor)
    {
        actor.attemptsTo(
                WaitUntil.the(LBL_POPUPCLIENTECREADO, isCurrentlyVisible()).forNoMoreThan(60).seconds()
        );
        String msgs = actor.asksFor(Text.of(LBL_CLIENTECREADOEXITOSAMENTE));
        System.out.println(msgs);
        System.out.println(texto);
        return msgs.equals(texto);
    }

    public static VisualizaElTexto clienteCreado(String texto)
    {
        return new VisualizaElTexto(texto);
    }
}

