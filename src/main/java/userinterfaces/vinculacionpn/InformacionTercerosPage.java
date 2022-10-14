package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionTercerosPage
{
    InformacionTercerosPage() {
        // Do nothing because of X and Y.
    }
    public static final Target RBTN_SIDESEAAGREGARTERCERO = Target.the("Opción si desea agregar un tercero").located(By.xpath("//mat-radio-group[@class='ask-template__btn-radio mat-radio-group']/mat-radio-button/label"));
    public static final Target RBTN_NODESEAAGREGARTERCERO = Target.the("Opción no desea agregar un tercero").located(By.xpath("(//mat-radio-group[@class='ask-template__btn-radio mat-radio-group']/mat-radio-button/label)[2]"));
    public static final Target LINK_AGREGAR = Target.the("Opción agregar").located(By.xpath("//a[contains(text(),'Agregar')]"));
    public static final Target CBBX_TIPOIDENTIFICACIONTERCERO = Target.the("Tipo Identificación Tercero").located(By.xpath("//div[@class='mat-form-field-infix']//mat-select"));
    public static final Target CHBX_OPCIONTIPOIDENTIFICACIONTERCERO = Target.the("Opción tipo identificación Tercero").located(By.xpath("//span[contains(text(),'Cédula')]"));
    public static final Target TXT_NUMEROIDENTIFICACIONTERCERO = Target.the("Numero Identificación Tercero").located(By.xpath("//div[@class='mat-form-field-infix']//input"));
    public static final Target BTN_BUSCAR = Target.the("Botón buscar").located(By.xpath("//mat-icon[@class='search mat-icon notranslate material-icons mat-icon-no-color ng-star-inserted']"));
    public static final Target TXT_PRIMERNOMBRETERCERO = Target.the("Primer Nombre Tercero").located(By.xpath("//input[@formcontrolname='primerNombre']"));
    public static final Target TXT_SEGUNDONOMBRETERCERO = Target.the("Segundo Nombre Tercero").located(By.xpath("//input[@formcontrolname='segundoNombre']"));
    public static final Target TXT_PRIMERAPELLIDOTERCERO = Target.the("Primer Apellido Tercero").located(By.xpath("//input[@formcontrolname='primerApellido']"));
    public static final Target TXT_SEGUNDOAPELLIDOTERCERO = Target.the("Segundo Apellido Tercero").located(By.xpath("//input[@formcontrolname='segundoApellido']"));
    public static final Target TXT_OCUPACIONTERCERO = Target.the("Ocupación Tercero").located(By.xpath("/html/body/app-root/app-form-third-party/app-page-template/div/div[2]/div/div[2]/form/div[3]/div[2]/app-economic-activity/div/app-autocomplete/mat-form-field/div/div[1]/div[2]/mat-icon"));
    public static final Target CHBX_OPCIONOCUPACIONTERCERO = Target.the("Opción Ocupación Tercero").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'Empleado')]"));
    public static final Target CBBX_CODIGOCIIUTERCERO = Target.the("Código CIIU Tercero").located(By.xpath("/html/body/app-root/app-form-third-party/app-page-template/div/div[2]/div/div[2]/form/div[3]/div[2]/app-economic-activity/div/app-code-ciiu/mat-form-field/div/div[1]/div[2]/mat-icon"));
    public static final Target CHBX_OPCIONCODIGOCIIUTERCERO = Target.the("Opción Código CIIU Tercero").located(By.xpath("//div[@class='cdk-overlay-pane mat-autocomplete-panel-above']//span[contains(text(),'0010 - Asalariados')]"));
    public static final Target CBBX_VINCULOCONELCLIENTE = Target.the("Vinculo con el cliente").located(By.xpath("/html/body/app-root/app-form-third-party/app-page-template/div/div[2]/div/div[2]/form/div[4]/div[2]/app-autocomplete/mat-form-field/div/div[1]/div[2]/mat-icon"));
    public static final Target CHBX_OPCIONVINCULOCONELCLIENTE = Target.the("Opción Vinculo con el Cliente").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'Cuñado / Cuñada')]"));
    public static final Target RBTN_TERCEROSIESDECLARANTEDERENTA = Target.the("Tercero Si es declarante de renta").located(By.xpath("//mat-radio-button[@class='forthi__radio-button mat-radio-button mat-accent']/label"));
    public static final Target  RBTN_TERCERONOESDECLARANTEDERENTA = Target.the("Tercero No es declarante de renta").located(By.xpath("(//mat-radio-button[@class='forthi__radio-button mat-radio-button mat-accent']/label)[2]"));
    public static final Target TXT_NOMBREEMPRESATERCERO = Target.the("Nombre Empresa Tercero").located(By.xpath("//input[@formcontrolname='nombreEmpresa']"));
    public static final Target TXT_CARGOTERCERO = Target.the("Cargo Tercero").located(By.xpath("//input[@formcontrolname='cargoEmpresa']"));
    public static final Target CBBX_PAISEMPRESATERCERO = Target.the("Pais Empresa Tercero").located(By.xpath("/html/body/app-root/app-form-third-party/app-page-template/div/div[2]/div/div[2]/form/div[7]/div[2]/app-ubication/app-autocomplete/mat-form-field/div/div[1]/div[2]/mat-icon"));
    public static final Target CHBX_OPCIONPAISEMPRESATERCERO = Target.the("Opcion Pais Tercero").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'COLOMBIA')]"));
    public static final Target CBBX_DEPARTAMENTOEMPRESATERCERO = Target.the("Departamento Empresa Tercero").located(By.xpath("/html/body/app-root/app-form-third-party/app-page-template/div/div[2]/div/div[2]/form/div[7]/div[2]/app-ubication/app-autocomplete[2]/mat-form-field/div/div[1]/div[2]/mat-icon"));
    public static final Target CHBX_OPCIONDEPARTAMENTOEMPRESATERCERO = Target.the("Opción Departamento Empresa Tercero").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'ANTIOQUIA')]"));
    public static final Target CBBX_CIUDADEMPRESATERCERO = Target.the("Ciudad Empresa Tercero").located(By.xpath("/html/body/app-root/app-form-third-party/app-page-template/div/div[2]/div/div[2]/form/div[7]/div[2]/app-ubication/app-autocomplete[3]/mat-form-field/div/div[1]/div[2]/mat-icon"));
    public static final Target CHBX_OPCIONCIUDADEMPRESATERCERO = Target.the("Opción Ciudad Empresa Tercero").located(By.xpath("//div[@class='cdk-overlay-pane mat-autocomplete-panel-above']//span[contains(text(),'MEDELLIN')]"));
    public static final Target TXT_DIRECCIONEMPRESATERCERO = Target.the("Dirección Empresa Tercero").located(By.xpath("//input[@formcontrolname='direccionEmpresa']"));
    public static final Target TXT_INDICATIVOTELEFONOEMPRESACLIENTE = Target.the("Indicativo Teléfono Empresa Cliente").located(By.xpath("//div[@class='full-telephone__city-code ']//input"));
    public static final Target TXT_TELEFONOEMPRESATERCERO = Target.the("Teléfono Empresa labora  Tercero").located(By.xpath("//div[@class='full-telephone__telephone']//input"));
    public static final Target CBBX_INDICATIVOCELULAREMPRESATERCERO = Target.the("Indicativo Celular Empresa Tercero").located(By.xpath("/html/body/app-root/app-form-third-party/app-page-template/div/div[2]/div/div[2]/form/div[8]/div[2]/app-full-cellphone/div/div[1]/app-country-code/mat-form-field/div/div[1]/div[3]/mat-icon"));
    public static final Target CHBX_OPCIONINDICATIVOCELULAREMPRESATERCERO = Target.the("Opción Indicativo Celular Empresa Tercero").located(By.xpath("//div[@class='cdk-overlay-pane mat-autocomplete-panel-above']//span[contains(text(),'Colombia')]"));
    public static final Target TXT_CELULAREMPRESATERCERO = Target.the("Celular Empresa Tercero").located(By.xpath("//div[@class='full-cellphone__cellphone']//input"));
}

