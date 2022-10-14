package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionRelacionesBancariasPage
{
    InformacionRelacionesBancariasPage() {
        // Do nothing because of X and Y.
    }
    public static final Target RBTN_SIDESEAAGREGARUNACUENTABANCARIA = Target.the("Si desea agregar una cuenta bancaria").located(By.xpath("//div[@class='screen-ask__content']//mat-radio-button//label/div"));
    public static final Target RBTN_NODESEAAGREGARUNACUENTABANCARIA = Target.the("No desea agregar una cuenta bancaria").located(By.xpath("(//div[@class='screen-ask__content']//mat-radio-button//label/div)[3]"));
    public static final Target LINK_AGREGARCUENTA = Target.the("Agregar cuenta").located(By.xpath("//a[contains(text(),'Agregar cuenta')]"));
    public static final Target CBBX_ANOMBREDEQUIENESTALACUENTA = Target.the("A nombre de quien esta la cuenta").located(By.cssSelector("app-select[formcontrolname=\"titularCuenta\"] div[class=\"mat-form-field-flex\"]"));
    public static final Target CHBX_OPCIONANOMBREDEQUIENESTALACUENTA = Target.the("Opcion a nombre de quien esta la cuenta").located(By.xpath("//span[contains(text(),'Tercero')]"));
    public static final Target TXT_NOMBREPERSONALIZADO = Target.the("Nombre personalizado").located(By.xpath("//input[@formcontrolname='nombrePersonalizado']"));
    public static final Target TXT_NOMBRETITULAR = Target.the("Nombre titular").located(By.xpath("//input[@formcontrolname='nombreTitular']"));
    public static final Target CBBX_TIPOIDENTIFICACIONTITULAR = Target.the("Tipo identificacion titular").located(By.cssSelector("[formcontrolname=\"tipoDocumento\"] div.mat-form-field-flex"));
    public static final Target CHBX_OPCIONTIPOIDENTIFICACIONTITULAR = Target.the("Opción tipo identificacion  titular").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'Cédula')]"));
    public static final Target TXT_NUMEROIDENTIFICACIONTITULAR = Target.the("Numero identificacion titular").located(By.xpath("//app-identification-number[@formcontrolname='numeroDocumento']//input"));
    public static final Target RBTN_CUENTALOCAL = Target.the("Cuenta local").located(By.xpath("//mat-radio-group[@formcontrolname='esCuentaLocal']/mat-radio-button/label/div"));
    public static final Target RBTN_CUENTAEXTRANJERA = Target.the("Cuenta extranjera").located(By.xpath("(//mat-radio-group[@formcontrolname='esCuentaLocal']/mat-radio-button/label/div)[3]"));
    public static final Target CBBX_ENTIDADFINANCIERA = Target.the("Entidad financiera").located(By.xpath("//app-financial-entity[@formcontrolname='entidadFinanciera']//div[@class='mat-form-field-flex']"));
    public static final Target CHBX_OPCIONENTIDADFINANCIERA = Target.the("Opción entidad financiera").located(By.xpath("//span[contains(text(),'Banco Btg Pactual Colombia S.A.')]"));
    public static final Target CBBX_TIPODECUENTA = Target.the("Tipo de cuenta").located(By.xpath("//app-select[@formcontrolname='typeAccount']//div[@class='mat-form-field-flex']"));
    public static final Target CHBX_OPCIONTIPODECUENTA = Target.the("Opcion tipo de cuenta").located(By.xpath("//span[contains(text(),'Ahorros')]"));
    public static final Target TXT_NUMERODECUENTA = Target.the("Numero de cuenta").located(By.xpath("//input[@formcontrolname='numberAccount']"));
    public static final Target CHBX_ENTIDADBANCO = Target.the("Entidad banco").located(By.xpath("//div[@id='resources']//label"));
    public static final Target CHBX_ENTIDADSOCIEDADCOMISIONISTADEBOLSA = Target.the("Entidad sociedad comisionista de bolsa").located(By.xpath("(//div[@id='resources'])[2]//label"));
    public static final Target CHBX_ENTIDADSOCIEDADFIDUCIARIA = Target.the("Entidad sociedad fiduciaria").located(By.xpath("(//div[@id='resources'])[3]//label"));
    public static final Target TXT_ENTIDADFINANCIERACUENTAEXTRANJERA = Target.the("Entidad financiera cuenta extranjera").located(By.xpath("//input[@formcontrolname='entidadFinanciera']"));
    public static final Target TXT_TIPODECUENTACUENTAEXTRANJERA = Target.the("Tipo de cuenta cuenta extranjera").located(By.xpath("//input[@formcontrolname='typeAccount']"));
    public static final Target TXT_NUMERODECUENTACUENTAEXTRANJERA = Target.the("Numero de cuenta cuenta extranjera").located(By.xpath("//input[@formcontrolname='numberAccount']"));
}

