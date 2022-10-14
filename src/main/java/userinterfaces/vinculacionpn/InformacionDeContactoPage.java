package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionDeContactoPage {
    public static final Target CBBX_PAISRESIDENCIACLIENTE = Target.the("Pais Residencia Cliente").located(By.xpath("//input[@formcontrolname='countryResidence']"));
    public static final Target CBBX_DEPARTAMENTORESIDENCIACLIENTE = Target.the("Departamento Residencia Cliente").located(By.xpath("//input[@formcontrolname='deptoResidence']"));
    public static final Target CBBX_CIUDADRESIDENCIACLIENTE = Target.the("//input[@formcontrolname=cityResidence]").located(By.xpath("//input[@formcontrolname='cityResidence']"));
    public static final Target CHBX_OPCIONDEPARTAMENTO1 = Target.the("Opción Departamento XPATH").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'BOGOTA')]"));
    public static final Target TXT_DIRECCIONRESIDENCIACLIENTE = Target.the("Dirección Residencia Cliente").located(By.xpath("//input[@formcontrolname='address']"));
    public static final Target TXT_INDICATIVOTELEFONOCLIENTE = Target.the("Indicativo Teléfono Cliente").located(By.cssSelector("div.full-telephone__city-code  input"));
    public static final Target TXT_TELEFONOCLIENTE = Target.the("Teléfono Cliente").located(By.xpath("//input[@placeholder='Teléfono']"));
    public static final Target CBBX_INDICATIVOCELULARCLIENTE = Target.the("Indicativo Celular Cliente").located(By.cssSelector("div.full-cellphone__country-code input"));
    public static final Target TXT_OPCIONINDICATIVOCELULARCLIENTE = Target.the("Opcion indicativo celular Cliente").located(By.xpath("//div[@class='cdk-overlay-pane mat-autocomplete-panel-above']//span[contains(text(),'Colombia')]"));
    public static final Target TXT_CELULARCLIENTE = Target.the("Celular Cliente").located(By.xpath("//input[@placeholder='Celular']"));
    public static final Target TXT_CORREOPERSONALCLIENTE = Target.the("Correo Personal Cliente").located(By.xpath("//input[@formcontrolname='personalEmail']"));
    public static final Target TXT_CORREOSECUNDARIOCLIENTE = Target.the("Correo Secundario Cliente").located(By.xpath("//input[@formcontrolname='extraEmail']"));
    public static final Target CHBX_VALIDACIONBIOMETRICA = Target.the("Validación Biométrica").located(By.cssSelector("div.mat-checkbox-inner-container"));
}
