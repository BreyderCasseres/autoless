package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionLaboralPage {

    public static final Target CBBX_OCUPACIONCLIENTE = Target.the("Ocupación Cliente").located(By.xpath("//input[@formcontrolname='ocupation']"));
    public static final Target CHBX_OPCIONOCUPACION = Target.the("Opción Ocupación").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'Empleado')]"));
    public static final Target CBBX_CODIGOCIIU = Target.the("código CIIU").located(By.xpath("//input[@formcontrolname='codCiiu']"));
    public static final Target CHBX_OPCIONCODIGOCIIU = Target.the("Opción Codigo CIIU").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),' 0010 - ASALARIADOS ')]"));
    public static final Target CBBX_VINCULOBTG = Target.the("Vinculo BTG").located(By.xpath("//mat-select[@formcontrolname='vinculoBtg']"));
    public static final Target CBBX_OPCIONVINCULOBTG = Target.the("Opción Vinculo BTG").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'Ninguno')]"));
    public static final Target RBTN_SEVINCULAATRAVESDEUNAPODERADO = Target.the("El cliente se vincula a través de un Apoderado").located(By.xpath("//mat-radio-group[@formcontrolname='attorney']//mat-radio-button[@value='SI']"));
    public static final Target TXT_NOMBREEMPRESACLIENTE = Target.the("Nombre Empresa donde trabaja el Cliente").located(By.xpath("//input[@formcontrolname='nameCompany']"));
    public static final Target TXT_CARGOCLIENTE = Target.the("Cargo Cliente").located(By.xpath("//input[@formcontrolname='jobCompany']"));
    public static final Target CHBX_OPCIONDEPARTAMENTO = Target.the("Opción Departamento").located(By.cssSelector("div.mat-autocomplete-panel mat-option:nth-of-type(1)"));
    public static final Target CBBX_PAISEMPRESACLIENTE = Target.the("Pais empresa cliente").located(By.xpath("//input[@formcontrolname='countryCompany']"));
    public static final Target TXT_PAISEMPRESACLIENTE = Target.the("Caja de texto Pais empresa cliente").located(By.cssSelector("input[formcontrolname=countryCompany]"));
    public static final Target CBBX_DEPARTAMENTOEMPRESACLIENTE = Target.the("Departamento empresa cliente").located(By.xpath("//input[@formcontrolname='deptoCompany']"));
    public static final Target TXT_DEPARTAMENTOEMPRESACLIENTE = Target.the("Caja de textoDepartamento empresa cliente").located(By.cssSelector("input[formcontrolname=deptoCompany]"));
    public static final Target CBBX_CIUDADEMPRESACLIENTE = Target.the("Ciudad empresa cliente").located(By.xpath("//input[@formcontrolname='cityCompany']"));
    public static final Target TXT_CIUDADEMPRESACLIENTE = Target.the("Caja de texto Ciudad empresa cliente").located(By.cssSelector("input[formcontrolname=cityCompany]"));
    public static final Target TXT_DIRECCIONEMPRESACLIENTE = Target.the("Direccion empresa cliente").located(By.xpath("//input[@formcontrolname='addressCompany']"));
    public static final Target TXT_INDICATIVOEMPRESACLIENTE = Target.the("Indicativo empresa cliente").located(By.xpath("//div[@class='full-telephone__city-code ']//input"));
    public static final Target TXT_TELEFONOEMPRESACLIENTE = Target.the("Telefono empresa cliente").located(By.xpath("//div[@class='full-telephone__telephone']//input"));
}
