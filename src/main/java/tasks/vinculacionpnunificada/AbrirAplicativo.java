package tasks;

import models.setdata.iniciodesesion.AbrirAplicativoData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

public class AbrirAplicativo implements Task
{
    private AbrirAplicativoData abrirAplicativoData;

    public AbrirAplicativo(AbrirAplicativoData abrirAplicativoData) {
        this.abrirAplicativoData = abrirAplicativoData;
    }

    public static AbrirAplicativo less(AbrirAplicativoData abrirAplicativoData)
    {
        return Tasks.instrumented(AbrirAplicativo.class,abrirAplicativoData);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Open.url(abrirAplicativoData.getUrl()));
    }
}


       
