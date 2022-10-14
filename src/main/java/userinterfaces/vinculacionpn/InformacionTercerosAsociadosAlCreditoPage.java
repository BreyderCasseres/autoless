package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionTercerosAsociadosAlCreditoPage
{
    InformacionTercerosAsociadosAlCreditoPage() {
        // Do nothing because of X and Y.
    }
    public static final Target RBTN_SIDESEAAGREGARTERCEROASOCIADO = Target.the("Si desea agregar tercero asociado").located(By.xpath("//div[@class='screen-ask__content']//mat-radio-button/label/div"));
    public static final Target RBTN_NODESEAAGREGARTERCEROASOCIADO = Target.the("No desea agregar tercero asociado").located(By.xpath("(//div[@class='screen-ask__content']//mat-radio-button/label/div)[3]"));
    public static final Target LINK_AGREGARTERCEROASOCIADO = Target.the("Agregar tercero asociado").located(By.xpath("//a[contains(text(),'Agregar tercero asociado al crédito')]"));
    public static final Target CBBX_TIPOIDENTIFICACIONTERCEROASOCIADO = Target.the("Tipo identificacion tercero asociado").located(By.cssSelector("div.section div.mat-form-field-flex"));
    public static final Target CHBX_OPCIONTIPOIDENTIFICACIONTERCEROASOCIADO = Target.the("Opción tipo identificación tercero asociado").located(By.xpath("//span[contains(text(),'Cédula')]"));
    public static final Target TXT_NUMEROIDENTIFICACIONTERCEROASOCIADO = Target.the("Numero identificacion tercero asociado").located(By.xpath("//input[@formcontrolname='numeroDocumento']"));
    public static final Target BTN_CONSULTARDOCUMENTOTERCEROASOCIADO = Target.the("Consultar documento tercero asociado").located(By.xpath("//button[contains(text(),'Consultar documento')]"));
    public static final Target CBBX_TIPODETERCERO = Target.the("Tipo de tercero").located(By.xpath("//mat-select[@formcontrolname='tipoTercero']"));
    public static final Target CHBX_OPCIONTIPOTERCERO = Target.the("Opcion tipo tercero").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'Avalista')]"));
    public static final Target TXT_PRIMERNOMBRETERCEROASOCIADO = Target.the("Primer nombre tercero asociado").located(By.xpath("//input[@formcontrolname='primerNombre']"));
    public static final Target TXT_SEGUNDONOMBRETERCEROASOCIADO = Target.the("Segundo nombre tercero asociado").located(By.xpath("//input[@formcontrolname='segundoNombre']"));
    public static final Target TXT_PRIMEROAPELLIDOTERCEROASOCIADO = Target.the("Primero apellido tercero asociado").located(By.xpath("//input[@formcontrolname='primerApellido']"));
    public static final Target TXT_SEGUNDOAPELLIDOTERCEROASOCIADO = Target.the("Segundo apellido tercero asociado").located(By.xpath("//input[@formcontrolname='segundoApellido']"));
    public static final Target TXT_FECHAEXPEDICIONDOCTERCEROASOCIADO = Target.the("Fecha expedicion doc tercero asociado").located(By.xpath("//input[@formcontrolname='fechaExpedicion']"));
    public static final Target TXT_FECHANACIMIENTOTERCEROASOCIADO = Target.the("Fecha nacimiento tercero asociado").located(By.xpath("//input[@formcontrolname='fechaNacimiento']"));
    public static final Target CBBX_PAISNACIMIENTOTERCEROASOCIADO = Target.the("Pais nacimiento tercero asociado").located(By.xpath("//input[@formcontrolname='paisNacimiento']"));
    public static final Target CHBX_OPCIONPAIS = Target.the("Opcion pais").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'COLOMBIA')]"));
    public static final Target CBBX_DEPARTAMENTONACIMIENTOTERCEROASOCIADO = Target.the("Departamento nacimiento tercero asociado").located(By.xpath("//input[@formcontrolname='departamentoNacimiento']"));
    public static final Target CHBX_OPCIONDEPARTAMENTO = Target.the("Opcion departamento").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'BOGOTA')]"));
    public static final Target CBBX_CIUDADNACIMIENTOTERCEROASOCIADO = Target.the("Ciudad nacimiento tercero asociado").located(By.xpath("//input[@formcontrolname='ciudadNacimiento']"));
    public static final Target CHBX_OPCIONCIUDAD = Target.the("Opcion ciudad").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'BOGOTA D.C.')]"));
    public static final Target CBBX_NACIONALIDADTERCEROASOCIADO = Target.the("Nacionalidad tercero asociado").located(By.xpath("//input[@placeholder='Nacionalidad']"));
    public static final Target CBBX_ESTADOCIVILTERCEROASOCIADO = Target.the("Estado civil tercero asociado").located(By.xpath("//input[@formcontrolname='estadoCivil']"));
    public static final Target CHBX_OPCIONESTADOCIVILTERCEROASOCIADO = Target.the("Opcion estado civil tercero asociado").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'Casado')]"));
    public static final Target CBBX_PAISRESIDENCIATERCEROASOCIADO = Target.the("Pais residencia tercero asociado").located(By.xpath("//input[@formcontrolname='paisResidencia']"));
    public static final Target CHBX_DEPARTAMENTORESIDENCIATERCEROASOCIADO = Target.the("Departamento residencia tercero asociado").located(By.xpath("//input[@formcontrolname='departamentoResidencia']"));
    public static final Target CBBX_CIUDADRESIDENCIATERCEROASOCIADO = Target.the("Ciudad residencia tercero asociado").located(By.xpath("//input[@formcontrolname='ciudadResidencia']"));
    public static final Target TXT_DIRECCIONRESIDENCIATERCEROASOCIADO = Target.the("Direccion residencia tercero asociado").located(By.xpath("//input[@formcontrolname='direccionResidencia']"));
    public static final Target TXT_INDICATIVOTELEFONOTERCEROASOCIADO = Target.the("Indicativo telefono tercero asociado").located(By.xpath("//div[@class='full-telephone']//input"));
    public static final Target TXT_TELEFONOTERCEROASOCIADO = Target.the("Telefono tercero asociado").located(By.xpath("(//div[@class='full-telephone']//input)[2]"));
    public static final Target CBBX_INDICATIVOCELULARTERCEROASOCIADO = Target.the("Indicativo celular tercero asociado").located(By.xpath("//div[@class='full-cellphone__country-code']//input"));
    public static final Target CHBX_OPCIONINDICATIVOCELULARTERCEROASOCIADO = Target.the("Opcion indicativo celular tercero asociado").located(By.xpath("//div[@class='cdk-overlay-pane mat-autocomplete-panel-above']//span[contains(text(),'Colombia')]"));
    public static final Target TXT_CELULARTERCEROASOCIADO = Target.the("Celular tercero asociado").located(By.xpath("//div[@class='full-cellphone__cellphone']//input"));
    public static final Target TXT_CORREOTERCEROASOCIADO = Target.the("Correo tercero asociado").located(By.xpath("//input[@formcontrolname='correo']"));
    public static final Target CBBX_OCUPACIONTERCEROASOCIADO = Target.the("Ocupacion tercero asociado").located(By.xpath("//input[@formcontrolname='ocupacion']"));
    public static final Target CHBX_OPCIONOCUPACIONTERCEROASOCIADO = Target.the("Opcion ocupacion tercero asociado").located(By.xpath("//div[@class='cdk-overlay-pane mat-autocomplete-panel-above']//span[contains(text(),'Otra')]"));
    public static final Target TXT_OTRACUALOCUPACIONTERCEROASOCIADO = Target.the("Otra cual ocupacion tercero asociado").located(By.xpath("//input[@formcontrolname='otraOcupacion']"));
    public static final Target CBBX_CODIGOCIIUTERCEROASOCIADO = Target.the("Codigo ciiu tercero asociado").located(By.xpath("//input[@formcontrolname='codigoCIIU']"));
    public static final Target CHBX_OPCIONCODIGOCIIUTERCEROASOCIADO = Target.the("Opcion codigo ciiu tercero asociado").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'0090 - RENTISTAS DE CAPITAL, SOLO PARA PERSONAS NATURALES')]"));
    public static final Target LINK_ADJUNTARPDF = Target.the("Adjuntar pdf").located(By.xpath("//input[@id='fileExplorer']"));
    public static final Target TXT_RAZONSOCIALTERCEROASOCIADO = Target.the("Razon social tercero asociado").located(By.xpath("//input[@formcontrolname='razonSocial']"));
}

