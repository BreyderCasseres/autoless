package tasks;

import models.setdata.iniciodesesion.IngresarCredencialesData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.*;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotCurrentlyVisible;

public class IngresarCredenciales implements Task
{
    private IngresarCredencialesData ingresarCredencialesData;

    public IngresarCredenciales(IngresarCredencialesData ingresarCredencialesData) {
        this.ingresarCredencialesData = ingresarCredencialesData;
    }

    public static IngresarCredenciales enElAplicativo(IngresarCredencialesData ingresarCredencialesData)
    {
        return Tasks.instrumented(IngresarCredenciales.class,ingresarCredencialesData);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.wasAbleTo(
            Enter.theValue(ingresarCredencialesData.getUsuario()).into(IniciarSesionPage.TXT_USUARIO),
            Enter.theValue(ingresarCredencialesData.getContrasenia()).into(IniciarSesionPage.TXT_CONTRASENIA),
            Click.on(IniciarSesionPage.BTN_INGRESARLOGIN),
            WaitUntil.the(GeneralesPage.LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(30).seconds());
    }
}


       
