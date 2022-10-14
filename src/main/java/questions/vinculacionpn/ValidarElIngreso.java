package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.*;
import userinterfaces.IniciarSesionPage;

public class ValidarElIngreso implements Question
{
    public static ValidarElIngreso alAplicativo()
    {
        return new ValidarElIngreso();
    }

    @Override
    public Object answeredBy(Actor actor)
    {
        return Text.of(IniciarSesionPage.LBL_NOMBREDEUSUARIO).answeredBy(actor);
    }
}

