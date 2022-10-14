package tasks.vinculacionpnmenordeedad;

import interations.SeleccionarEnListas;
import models.setdata.vinculacionpn.InformacionBasicaClienteData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.GeneralesPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotCurrentlyVisible;
import static userinterfaces.InformacionLaboralPage.*;

public class IngresarInformacionLaboralMenorDeEdad implements Task {

    private InformacionBasicaClienteData informacionBasicaClienteData;

    public IngresarInformacionLaboralMenorDeEdad(InformacionBasicaClienteData informacionBasicaClienteData) {
        this.informacionBasicaClienteData = informacionBasicaClienteData;
    }

    public static IngresarInformacionLaboralMenorDeEdad delCliente(InformacionBasicaClienteData informacionBasicaClienteData)
    {
        return Tasks.instrumented(IngresarInformacionLaboralMenorDeEdad.class,informacionBasicaClienteData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(GeneralesPage.LBL_CARGANDO, isNotCurrentlyVisible()).forNoMoreThan(30).seconds(),
                SeleccionarEnListas.laOpcion(CBBX_OCUPACIONCLIENTE, " Estudiante "),
                SeleccionarEnListas.laOpcion(CBBX_CODIGOCIIU, " 0 - SIN DEFINIR "),
                //Click.on(CBBX_CODIGOCIIU),
                //Click.on(CHBX_OPCIONCODIGOCIIU),
                SeleccionarEnListas.laOpcion(CBBX_VINCULOBTG, " Parte Relacionada "),
                //Click.on(CBBX_VINCULOBTG),
                //Click.on(CBBX_OPCIONVINCULOBTG),
                Click.on(RBTN_SEVINCULAATRAVESDEUNAPODERADO)
        );
    }
}
