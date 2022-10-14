package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.setdata.vinculacionpn.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import questions.*;
import questions.VisualizaElTexto;
import tasks.*;
import tasks.AprobarDocumentos;
import tasks.CargaDeFormatosYContratos;
import tasks.CargarDocumentos;
import tasks.DarConcepto;
import tasks.DarConceptoOficial;
import tasks.DeclararOrigen;
import tasks.IngresarInformacionBeneficiarioGarantias;
import tasks.IngresarInformacionDeContacto;
import tasks.IngresarInformacionDeParticipante;
import tasks.IngresarInformacionDivisas;
import tasks.IngresarInformacionFatca;
import tasks.IngresarInformacionFinanciera;
import tasks.IngresarInformacionInicial;
import tasks.IngresarInformacionInstruccionPago;
import tasks.IngresarInformacionLaboral;
import tasks.IngresarInformacionPago;
import tasks.IngresarInformacionParticipante;
import tasks.IngresarInformacionTerceroAsociado;
import tasks.IngresarInformacionVinculo;
import tasks.IngresarRelacionesBancarias;
import tasks.SeleccionarOperaciones;
import tasks.SeleccionarPreguntasPerfil;
import tasks.SeleccionarProductos;
import tasks.vinculacionpnmenordeedad.IngresarInformacionFinancieraDelClienteMenorDeEdad;
import tasks.vinculacionpnmenordeedad.IngresarInformacionInicialDelCliente;
import tasks.vinculacionpnmenordeedad.IngresarInformacionLaboralMenorDeEdad;
import tasks.vinculacionpnreplicacioncore.DarConceptoSinMarcarClasificacion;
import tasks.vinculacionpnreplicacioncore.SeleccionarProductosParaReplicacionCore;
import tasks.vinculacionpnsinparticipantes.*;
import tasks.vinculacionpnsolobanco.CargarDocumentosSinPreguntaOrdenante;
import tasks.vinculacionpnsolobanco.IngresarInformacionPersonalSoloEntidadBanco;
import tasks.vinculacionpnsolobanco.IngresarRelacionesBancariasEntidadSoloBanco;
import tasks.vinculacionpnsolobanco.SeleccionarProductosSoloEntidadBanco;
import tasks.vinculacionpnsolofiduciaria.IngresarInformacionPersonalSoloEntidadFuduciaria;
import tasks.vinculacionpnsolofiduciaria.SeleccionarProductosSoloEntidadFiduciaria;
import tasks.vinculacionpnsoloscb.IngresarInformacionFinancieraSoloEntidadSCB;
import tasks.vinculacionpnsoloscb.IngresarInformacionPersonalSoloEntidadSCB;
import tasks.vinculacionpnsoloscb.IngresarRelacionesBancariasSoloSCB;
import tasks.vinculacionpnsoloscb.SeleccionarProductosSoloEntidadSCB;
import tasks.vinculacionpnunificada.DescargarFormatosYContratos;
import tasks.vinculacionpnunificada.IngresarInformacionPersonal;
import tasks.vinculacionpnunificada.IngresarLaInformacionTributaria;

import javax.xml.crypto.Data;
import java.util.List;

public class VinculacionPersonaNaturalStepDefinitions {

    private final SetInformacionInicialClienteData setInformacionInicialClienteData = new SetInformacionInicialClienteData();
    private final SetInformacionBasicaClienteData setInformacionBasicaClienteData = new SetInformacionBasicaClienteData();
    //private final SetInformacionBasicaClienteData setInformacionTributariaData = new SetInformacionBasicaClienteData();
    private final SetInformacionTerceroData setInformacionTerceroData = new SetInformacionTerceroData();
    private final SetInformacionFatcaData setInformacionFatcaData = new SetInformacionFatcaData();
    private final SetInformacionDivisasData setInformacionDivisasData = new SetInformacionDivisasData();
    private final SetInformacionFamiliarData setInformacionFamiliarData = new SetInformacionFamiliarData();
    private final SetInformacionOrdenanteData setInformacionOrdenanteData = new SetInformacionOrdenanteData();
    private final SetInformacionTerceroAsociadoData setInformacionTerceroAsociadoData = new SetInformacionTerceroAsociadoData();
    private final SetInformacionBeneficiarioGarantiasData setInformacionBeneficiarioGarantiasData = new SetInformacionBeneficiarioGarantiasData();
    private final SetInformacionBancariaData setInformacionBancariaData = new SetInformacionBancariaData();
    private final SetInformacionPagoDividendoData setInformacionPagoDividendoData = new SetInformacionPagoDividendoData();
    private final SetInformacionOrigenDeFondosData setInformacionOrigenDeFondosData = new SetInformacionOrigenDeFondosData();
    private final SetInformacionFinancieraData setInformacionFinancieraData = new SetInformacionFinancieraData();
    
    @Before
    public void setStage()
    {
        OnStage.setTheStage(new OnlineCast());
    }

    @And("Ingresa la informacion inicial del cliente$")
    public void ingresaLaInformacionInicialDelCliente(DataTable table)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarInformacionInicial.delCliente(setInformacionInicialClienteData.setData(table).get(0)));

    }

    @And("Ingresa la informacion basica del cliente$")
    public void ingresaLaInformacionBasicaDelCliente(DataTable table)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IngresarInformacionPersonal.delCliente(setInformacionBasicaClienteData.setData(table).get(0)),
                IngresarInformacionDeContacto.delCliente(setInformacionBasicaClienteData.setData(table).get(0)),
                IngresarInformacionLaboral.delCliente(setInformacionBasicaClienteData.setData(table).get(0)),
                IngresarLaInformacionTributaria.delCliente(setInformacionBasicaClienteData.setData(table).get(0))
        );
    }

    @And("Ingresa la informacion del tercero$")
    public void ingresaLaInformacionDelTercero(DataTable table)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarInformacionDeParticipante.tercero(setInformacionTerceroData.setData(table).get(0)));
    }

    @And("Ingresa la informacion fatca$")
    public void ingresaLaInformacionFatca(DataTable table)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarInformacionFatca.delCliente(setInformacionFatcaData.setData(table).get(0)));
    }

    @And("Selecciona los productos$")
    public void seleccionaLosProductos()
    {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarProductos.porEntidad());
    }

    @And("Ingresa la informacion divisas$")
    public void ingresaLaInformacionDivisas(DataTable table)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarInformacionDivisas.delCliente(setInformacionDivisasData.setData(table).get(0)));
    }

    @And("Carga los documentos$")
    public void cargaLosDocumentos()
    {
        OnStage.theActorInTheSpotlight().attemptsTo(CargarDocumentos.requeridos());
    }

    @And("Ingresa la informacion del vinculo familiar$")
    public void ingresaLaInformacionDelVinculoFamiliar(DataTable table)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarInformacionVinculo.familiar(setInformacionFamiliarData.setData(table).get(0)));
    }

    @And("Ingresa la informacion del ordenante$")
    public void ingresaLaInformacionDelOrdenante(DataTable table)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarInformacionParticipante.ordenante(setInformacionOrdenanteData.setData(table).get(0)));
    }

    @And("ingresa la informacion del tercero asociado al credito$")
    public void ingresaLaInformacionDelTerceroAsociadoAlCredito(DataTable table)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarInformacionTerceroAsociado.alCredito(setInformacionTerceroAsociadoData.setData(table).get(0)));
    }

    @And("Ingresa la informacion del beneficiario de garantias bancarias$")
    public void ingresaLaInformacionDelBeneficiarioDeGarantiasBancarias(DataTable table)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarInformacionBeneficiarioGarantias.bancarias(setInformacionBeneficiarioGarantiasData.setData(table).get(0)));
    }

    @And("Ingresa las relaciones bancarias del cliente o tercero$")
    public void ingresaLasRelacionesBancariasDelClienteOTercero(DataTable table)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarRelacionesBancarias.delClienteOTercero(setInformacionBancariaData.setData(table).get(0)));
    }

    @And("Ingresa la informacion de pago de dividendos$")
    public void ingresaLaInformacionDePagoDeDividendos(DataTable table)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarInformacionPago.dividendos(setInformacionPagoDividendoData.setData(table).get(0)));
    }

    @And("Ingresa la informacion de instruccion pago de rendimientos$")
    public void ingresaLaInformacionDeInstruccionPagoDeRendimientos(DataTable table)
    {
        List<List<String>> data = table.asLists(String.class);
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarInformacionInstruccionPago.rendimientos(data.get(0).get(0)));
    }

    @And("Selecciona las operaciones internaciones$")
    public void seleccionaLasOperacionesInternaciones()
    {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarOperaciones.internacionales());
    }

    @And("Selecciona las preguntas de perfil de riesgo$")
    public void seleccionaLasPreguntasDePerfilDeRiesgo()
    {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarPreguntasPerfil.deRiesgo());
    }

    @And("Declara el origen de los fondos$")
    public void declaraElOrigenDeLosFondos(DataTable table)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(DeclararOrigen.deLosFondos(setInformacionOrigenDeFondosData.setData(table).get(0)));
    }

    @And("Ingresa la informacion financiera del cliente y o ordenante$")
    public void ingresaLaInformacionFinancieraDelClienteYOOrdenante(DataTable table)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarInformacionFinanciera.delClienteYOOrdenante(setInformacionFinancieraData.setData(table).get(0)));
    }

    @And("Aprueba los documentos adjuntados$")
    public void apruebaLosDocumentosAdjuntados()
    {
        OnStage.theActorInTheSpotlight().attemptsTo(AprobarDocumentos.adjuntados());
    }

    @And("Da el concepto aml$")
    public void daElConceptoAml(DataTable table)
    {
        List<List<String>> data = table.asLists(String.class);
        OnStage.theActorInTheSpotlight().attemptsTo(DarConcepto.aml(data.get(0).get(0)));
    }

    @And("Da el concepto del oficial de cumplimiento$")
    public void daElConceptoDelOficialDeCumplimiento(DataTable table)
    {
        List<List<String>> data = table.asLists(String.class);
        OnStage.theActorInTheSpotlight().attemptsTo(DarConceptoOficial.deCumplimiento(data.get(0).get(0)));
    }

    @And("Descarga los formatos y contratos$")
    public void descargaLosFormatosYContratos()
    {
        OnStage.theActorInTheSpotlight().attemptsTo(DescargarFormatosYContratos.delCliente());
    }

    @And("Carga los formatos y contratos$")
    public void cargaLosFormatosYContratos()
    {
        OnStage.theActorInTheSpotlight().attemptsTo(CargaDeFormatosYContratos.delCliente());
    }

    @Then("visualiza el texto (.*)$")
    public void visualizaElTextoClienteCreadoExitosamente(String texto)
    {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VisualizaElTexto.clienteCreado(texto)));
    }

    //------------------------------------------- SIN PARTICIPANTES -----------------------------------------

    @When("Ingresa la informacion basica del cliente seleccionado que no depende economicamente de un tercero")
    public void ingresaLaInformacionBasicaDelClienteSeleccionadoQueNoDependeEconomicamenteDeUnTercero(DataTable table) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IngresarInformacionPersonalDelCliente.noPep(setInformacionBasicaClienteData.setData(table).get(0)),
                IngresarInformacionDeContacto.delCliente(setInformacionBasicaClienteData.setData(table).get(0)),
                IngresarInformacionLaboral.delCliente(setInformacionBasicaClienteData.setData(table).get(0)),
                IngresarLaInformacionTributariaNoDepdendeDeTercero.delCliente(setInformacionBasicaClienteData.setData(table).get(0))
        );
    }
    @When("Carga los documentos y selecciona que no desea agregar ordenantes")
    public void cargaLosDocumentosYSeleccionaQueNoDeseaAgregarOrdenantes() {
        OnStage.theActorInTheSpotlight().attemptsTo(CargarDocumentosSinAgregarOrdenante.requeridos());
    }

    @When("Selecciona los productos sin producto garantias bancarias")
    public void seleccionaLosProductosSinProductoGarantiasBancarias() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarProductosSinParticipantes.porEntidad());
    }

    @When("Ingresa las relaciones bancarias del cliente")
    public void ingresaLasRelacionesBancariasDelCliente(DataTable table) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarRelacionesBancariasSolo.delCliente(setInformacionBancariaData.setData(table).get(0)));
    }
    @When("Ingresa la informacion financiera del cliente")
    public void ingresaLaInformacionFinancieraDelCliente(DataTable table) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarInformacionFinancieraSolo.delCliente(setInformacionFinancieraData.setData(table).get(0)));
    }
    //------------------------------------------- SOLO BANCO -----------------------------------------
    @When("Ingresa la informacion basica del cliente seleccionando solo la entidad banco")
    public void ingresaLaInformacionBasicaDelClienteSeleccionandoSoloLaEntidadBanco(DataTable table) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IngresarInformacionPersonalSoloEntidadBanco.delCliente(setInformacionBasicaClienteData.setData(table).get(0)),
                IngresarInformacionDeContacto.delCliente(setInformacionBasicaClienteData.setData(table).get(0)),
                IngresarInformacionLaboral.delCliente(setInformacionBasicaClienteData.setData(table).get(0)),
                IngresarLaInformacionTributaria.delCliente(setInformacionBasicaClienteData.setData(table).get(0))
        );
    }
    @When("Selecciona los productos de la entidad banco")
    public void seleccionaLosProductosDeLaEntidadBanco() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarProductosSoloEntidadBanco.porEntidad());
    }
    @When("Carga los documentos sin pregunta de ordenante")
    public void cargaLosDocumentosSinPreguntaDeOrdenante() {
        OnStage.theActorInTheSpotlight().attemptsTo(CargarDocumentosSinPreguntaOrdenante.requeridos());
    }

    @And("Ingresa las relaciones bancarias del cliente o tercero entidad solo banco$")
    public void ingresaLasRelacionesBancariasDelClienteOTerceroEntidadSoloBanco(DataTable table)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarRelacionesBancariasEntidadSoloBanco.delClienteOTercero(setInformacionBancariaData.setData(table).get(0)));
    }

    //---------------------------------------------- SOLO SCB ------------------------------------------------

    @When("Ingresa la informacion basica del cliente seleccionando solo la entidad SCB")
    public void ingresaLaInformacionBasicaDelClienteSeleccionandoSoloLaEntidadSCB(DataTable table) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IngresarInformacionPersonalSoloEntidadSCB.delCliente(setInformacionBasicaClienteData.setData(table).get(0)),
                IngresarInformacionDeContacto.delCliente(setInformacionBasicaClienteData.setData(table).get(0)),
                IngresarInformacionLaboral.delCliente(setInformacionBasicaClienteData.setData(table).get(0)),
                IngresarLaInformacionTributaria.delCliente(setInformacionBasicaClienteData.setData(table).get(0))
        );
    }

    @When("Selecciona los productos de la entidad SCB")
    public void seleccionaLosProductosDeLaEntidadSCB() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarProductosSoloEntidadSCB.porEntidad());
    }

    @When("Ingresa las relaciones bancarias del cliente o tercero solo SCB")
    public void ingresaLasRelacionesBancariasDelClienteOTerceroSoloSCB(DataTable table) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarRelacionesBancariasSoloSCB.delClienteOTercero(setInformacionBancariaData.setData(table).get(0)));
    }

    @And("Ingresa la informacion financiera del cliente y o ordenante solo entidad SCB$")
    public void ingresaLaInformacionFinancieraDelClienteYOOrdenanteSoloEntidadSCB(DataTable table)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarInformacionFinancieraSoloEntidadSCB.delClienteYOOrdenante(setInformacionFinancieraData.setData(table).get(0)));
    }

    //---------------------------------------------- SOLO FIDUCIARIA ------------------------------------------------

    @When("Ingresa la informacion basica del cliente seleccionando solo la entidad fiduciaria")
    public void ingresaLaInformacionBasicaDelClienteSeleccionandoSoloLaEntidadFiduciara(DataTable table) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IngresarInformacionPersonalSoloEntidadFuduciaria.delCliente(setInformacionBasicaClienteData.setData(table).get(0)),
                IngresarInformacionDeContacto.delCliente(setInformacionBasicaClienteData.setData(table).get(0)),
                IngresarInformacionLaboral.delCliente(setInformacionBasicaClienteData.setData(table).get(0)),
                IngresarLaInformacionTributaria.delCliente(setInformacionBasicaClienteData.setData(table).get(0))
        );
    }

    @When("Selecciona los productos de la entidad fiduciaria")
    public void seleccionaLosProductosDeLaEntidadFiduciaria() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarProductosSoloEntidadFiduciaria.porEntidad());
    }

    //----------------------------------------------- MENOR DE EDAD --------------------------------------------------------------

    @When("Ingresa la informacion inicial del cliente menor de edad")
    public void ingresaLaInformacionInicialDelClienteMenorDeEdad(DataTable table) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarInformacionInicialDelCliente.menorDeEdad(setInformacionInicialClienteData.setData(table).get(0)));
    }
    @When("Ingresa la informacion basica del cliente menor de edad")
    public void ingresaLaInformacionBasicaDelClienteMenorDeEdad(DataTable table) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IngresarInformacionPersonal.delCliente(setInformacionBasicaClienteData.setData(table).get(0)),
                IngresarInformacionDeContacto.delCliente(setInformacionBasicaClienteData.setData(table).get(0)),
                IngresarInformacionLaboralMenorDeEdad.delCliente(setInformacionBasicaClienteData.setData(table).get(0)),
                IngresarLaInformacionTributaria.delCliente(setInformacionBasicaClienteData.setData(table).get(0))
        );
    }

    @When("Ingresa la informacion financiera del cliente  menor de edad y o ordenante")
    public void ingresaLaInformacionFinancieraDelClienteMenorDeEdadYOOrdenante(DataTable table) {

        OnStage.theActorInTheSpotlight().attemptsTo(IngresarInformacionFinancieraDelClienteMenorDeEdad.yOOrdenante(setInformacionFinancieraData.setData(table).get(0)));
    }

    //------------------------------------------- REPLICACION CORE -----------------------------------------

    @When("Selecciona los productos de replicacion a los core")
    public void seleccionaLosProductosDeReplicaconALosCore() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarProductosParaReplicacionCore.porEntidad());
    }

    @And("Da el concepto aml sin carcar clasificacion")
    public void daElConceptoAmlSinMarcarClasificacion(DataTable table)
    {
        List<List<String>> data = table.asLists(String.class);
        OnStage.theActorInTheSpotlight().attemptsTo(DarConceptoSinMarcarClasificacion.aml(data.get(0).get(0)));
    }

}