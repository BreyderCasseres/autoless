package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.Constantes;
import models.setdata.iniciodesesion.SetAbrirAplicativoData;
import models.setdata.iniciodesesion.SetIngresarCredencialesData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import questions.*;
import tasks.*;

import java.util.List;

public class InicioDeSesionStepDefinitions {
    private final SetAbrirAplicativoData setAbrirAplicativoData = new SetAbrirAplicativoData();
    private final SetIngresarCredencialesData setIngresarCredencialesData = new SetIngresarCredencialesData();

    @Before
    public void setStage()
    {
        OnStage.setTheStage(new OnlineCast());
    }
    
    @Given("Que el usuario ingresa al aplicativo LESS$")
    public void queElUsuarioIngresaAlAplicativoLess(DataTable table)
    {
        OnStage.theActorCalled(Constantes.ACTOR).wasAbleTo(AbrirAplicativo.less(setAbrirAplicativoData.setData(table).get(0)));
    }

    @When("Ingresa las credenciales de autenticacion$")
    public void ingresaLasCredencialesDeAutenticacion(DataTable table)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarCredenciales.enElAplicativo(setIngresarCredencialesData.setData(table).get(0)));
    }

    @Then("visualiza su nombre en el home$")
    public void visualizaSuNombreEnElHome(DataTable table)
    {
        List<List<String>> data = table.asLists(String.class);
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarElIngreso.alAplicativo(), Matchers.equalTo(data.get(0).get(0))));
    }


}