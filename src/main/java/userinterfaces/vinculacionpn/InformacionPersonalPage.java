package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionPersonalPage
{
    InformacionPersonalPage() {
        // Do nothing because of X and Y.
    }

    public static final Target CBBX_COMERCIALRM = Target.the("Lista de comerciales").located(By.cssSelector("div.mat-form-field-flex div:nth-of-type(1)"));
    public static final Target TXT_COMERCIAL = Target.the("Caja de texto Comercial").located(By.xpath("//input[@formcontrolname='comercialRM'][@placeholder='Comercial RM*']"));
    public static final Target CHBX_OPCIONCOMERCIAL = Target.the("Opción Comercial").located(By.cssSelector("div.mat-autocomplete-panel mat-option:nth-of-type(1)"));
    public static final Target CBBX_TIPODEENTREVISTA = Target.the("Lista de tipo de entrevista").located(By.cssSelector("input[formcontrolname=interviewType]"));
    public static final Target TXT_TIPOENTREVISTA = Target.the("caja de texto tipo de entrevista").located(By.xpath("//input[@formcontrolname='interviewType']"));
    public static final Target CHBX_OPCIONTIPOENTREVISTA = Target.the("Opción Tipo Entrevista").located(By.cssSelector("div.mat-autocomplete-panel mat-option:nth-of-type(1)"));
    public static final Target TXT_LUGARENTREVISTA = Target.the("Caja de texto para ingresar el lugar de la entrevista").located(By.xpath("//input[@formcontrolname='interviewPlace']"));
    public static final Target TXT_FECHAENTREVISTA = Target.the("Fecha Entrevista").located(By.xpath("//input[@formcontrolname='interviewDate']"));
    public static final Target TXT_HORAENTREVISTA = Target.the("Hora Entrevista").located(By.xpath("//input[@formcontrolname='interviewHour']"));
    public static final Target TXT_GRUPOECONOMICOCLIENTE = Target.the("Grupo Economico Cliente").located(By.xpath("//input[@formcontrolname='economicGroup']"));
    public static final Target CBBX_CLASIFICACIONDELCLIENTE = Target.the("Clasificacion del Cliente").located(By.cssSelector("input[formcontrolname=customerClasification]"));
    public static final Target TXT_CLASIFICACIONCLIENTE = Target.the("Caja de texto Clasificacion del Cliente").located(By.xpath("//input[@formcontrolname='customerClasification']"));
    public static final Target CHBX_OPCIONCLASIFICACIONCLIENTE = Target.the("Opción Clasificación del Cliente").located(By.xpath("div.mat-autocomplete-panel mat-option:nth-of-type(1)"));
    public static final Target TXT_OBSERVACIONESENTREVISTA = Target.the("Observaciones Entrevista").located(By.xpath("//textarea[@formcontrolname='interviewObservations']"));
    public static final Target CHBX_ENTIDADBANCO = Target.the("Entidad Banco").located(By.xpath("//mat-checkbox[@id='mat-checkbox-1']"));
    public static final Target CHBX_ENTIDADSCB = Target.the("Entidad Sociedad Comisionista de Bolsa").located(By.xpath("//mat-checkbox[@id='mat-checkbox-2']"));
    public static final Target CHBX_ENTIDADSOCIEDADFIDUCIARIA = Target.the("Entidad Sociedad Fiduciaria").located(By.xpath("//mat-checkbox[@id='mat-checkbox-3']"));
    public static final Target TXT_FECHAVIGENCIADOCCLIENTE = Target.the("Fecha de vigencia del documento de identidad del cliente").located(By.xpath("//input[@formcontrolname='dateVig']"));
    public static final Target CBBX_PAISEXPEDICIONDOCCLIENTE = Target.the("Pais de Expedición del documento del Cliente").located(By.xpath("//input[@formcontrolname='paisExpedicion']"));
    public static final Target TXT_PAISEXPEDICIONDOCCLIENTE = Target.the("Caja de texto Pais de Expedición del documento").located(By.xpath("//input[@formcontrolname='paisExpedicion']"));
    public static final Target CHBX_OPCIONPAIS = Target.the("Opción Pais cssSelector").located(By.cssSelector("div.mat-autocomplete-panel mat-option:nth-of-type(1)"));
    public static final Target CHBX_OPCIONPAIS1 = Target.the("Opción Pais XPATH").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'COLOMBIA')]"));
    public static final Target CBBX_DEPARTAMENTOEXPEDICIONDOCCLIENTE = Target.the("Departamento expedición del documento del cliente").located(By.xpath("//input[@formcontrolname='departamentoExpedicion']"));
    public static final Target TXT_DEPARTAMENTOEXPEDICIONDOCCLIENTE = Target.the("Caja de texto Departamento expedición del documento").located(By.xpath("//input[@formcontrolname='departamentoExpedicion']"));
    public static final Target CHBX_OPCIONDEPARTAMENTO = Target.the("Opción Departamento").located(By.cssSelector("div.mat-autocomplete-panel mat-option:nth-of-type(1)"));
    public static final Target CHBX_OPCIONDEPARTAMENTO1 = Target.the("Opción Departamento XPATH").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'BOGOTA')]"));
    public static final Target CBBX_CIUDADEXPEDICIONDOCCLIENTE = Target.the("Listas de ciudades de Expedición del documento Cliente").located(By.xpath("//input[@formcontrolname='ciudadExpedicion']"));
    public static final Target TXT_CIUDADEXPEDICIONDOCCLIENTE = Target.the("Caja de texto ciudad de Expedición del documento Cliente").located(By.xpath("//input[@formcontrolname='ciudadExpedicion']"));
    public static final Target CHBX_OPCIONCIUDAD = Target.the("Opción Ciudad").located(By.cssSelector("div.mat-autocomplete-panel mat-option:nth-of-type(1)"));
    public static final Target CHBX_OPCIONCIUDAD1 = Target.the("Opción Ciudad XPATH").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'BOGOTA D.C.')]"));
    public static final Target TXT_FECHAEXPEDICIONDOCCLIENTE = Target.the("Fecha Expedición documento del Cliente").located(By.xpath("//input[@formcontrolname='dateExp']"));
    public static final Target TXT_FECHANACIMIENTOCLIENTE = Target.the("Fecha Nacimiento Cliente").located(By.xpath("//input[@formcontrolname='birthDate']"));
    public static final Target CBBX_PAISNACIMIENTOCLIENTE = Target.the("Pais Nacimiento Cliente").located(By.xpath("//input[@formcontrolname='birthCountry']"));
    public static final Target CBBX_DEPARTAMENTONACIMIENTOCLIENTE = Target.the("Departamento Nacimiento Cliente").located(By.xpath("//input[@formcontrolname='birthDepto']"));
    public static final Target CBBX_CIUDADNACIMIENTOCLIENTE = Target.the("Ciudad Nacimiento Cliente").located(By.xpath("//input[@formcontrolname='birthCity']"));
    public static final Target CBBX_NACIONALIDADCLIENTE = Target.the("Nacionalidad Cliente").located(By.xpath("//input[@formcontrolname='nacionalidad']"));
    public static final Target CBBX_GENEROCLIENTE = Target.the("Genero Cliente").located(By.cssSelector("mat-select[formcontrolname=sex]"));
    public static final Target CHBX_OPCIONGENEROCLIENTE = Target.the("").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'Masculino')]"));
    public static final Target CBBX_ESTADOCIVILCLIENTE = Target.the("Estado Civil Cliente").located(By.xpath("//mat-select[@formcontrolname='civilStatus']"));
    public static final Target CHBX_OPCIONESTADOCIVILCLIENTE = Target.the("Opción Estado Civil Cliente").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'Unión Libre')]"));
    public static final Target RBTN_CLIENTEPEP = Target.the("Pregunta si el cliente es PEP").located(By.xpath("//mat-radio-group[@formcontrolname='pep']//mat-radio-button[@value='SI']"));
    public static final Target RBTN_CLIENTENOPEP = Target.the("Pregunta no el cliente es PEP").located(By.xpath("//mat-radio-group[@formcontrolname='pep']//mat-radio-button[@value='NO']"));
    public static final Target LBL_CUALQUIERPARTE = Target.the("Acción para guardar la hora").located(By.xpath("//div[@class='form-label']"));
    public static final Target TXT_JUSTIFIQUEPEP = Target.the("Justifique PEP").located(By.xpath("//textarea[@formcontrolname='pepInfo']"));

}

