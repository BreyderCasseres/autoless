package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionDivisasPage
{
    InformacionDivisasPage() {
        // Do nothing because of X and Y.
    }
    public static final Target RBTN_SITIENECUENTASDECOMPENSACION = Target.the("Si tiene cuentas de compensación").located(By.xpath("//div[@class='comacc__content']//mat-radio-group/mat-radio-button/label"));
    public static final Target RBTN_NOTIENECUENTASDECOMPENSACION = Target.the("No tiene cuentas de compensación").located(By.xpath("(//div[@class='comacc__content']//mat-radio-group/mat-radio-button/label)[2]"));
    public static final Target RBTN_SITIENEGIROSLOCALES = Target.the("Si tiene giros locales").located(By.xpath("//div[@class='loctur__content']//mat-radio-group/mat-radio-button/label"));
    public static final Target RBTN_NOTIENEGIROSLOCALES = Target.the("No tiene giros locales").located(By.xpath("(//div[@class='loctur__content']//mat-radio-group/mat-radio-button/label)[2]"));
    public static final Target TXT_CUENTABANCARIANUMERO = Target.the("Cuenta bancaria numero").located(By.xpath("//input[@placeholder='Cuenta bancaria número']"));
    public static final Target CBBX_TIPODECUENTA = Target.the("Tipo de cuenta bancaria giros locales").located(By.xpath("//div[@class='mat-select-arrow-wrapper']"));
    public static final Target CHBX_OPCIONTIPODECUENTA = Target.the("Opción tipo de cuenta bancaria giros locales").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'Ahorros')]"));
    public static final Target CBBX_ENTIDADFINANCIERA = Target.the("Entidad financiera giros locales").located(By.xpath("(//div[@class='mat-select-arrow-wrapper'])[2]"));
    public static final Target CHBX_OPCIONENTIDADFINANCIERA = Target.the("Opción entidad financiera giros locales").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),' BANCO BTG PACTUAL COLOMBIA S.A. ')]"));
    public static final Target TXT_BENEFICIARIOOTITULAR = Target.the("Beneficiario o titular giros locales").located(By.xpath("//input[@placeholder='Beneficiario o titular']"));
    public static final Target RBTN_SITIENEGIROSINTERNACIONALES = Target.the("Si tiene giros internacionales").located(By.xpath("//div[@class='inttur__content']//mat-radio-group/mat-radio-button/label"));
    public static final Target RBTN_NOTIENEGIROSINTERNACIONALES = Target.the("No tiene giros internacionales").located(By.xpath("(//div[@class='inttur__content']//mat-radio-group/mat-radio-button/label)[2]"));
    public static final Target TXT_NOMBREDELBENEFICIARIODELACUENTA = Target.the("Nombre del beneficiario de la cuenta").located(By.xpath("//input[@placeholder='Nombre del beneficiario de la cuenta']"));
    public static final Target TXT_NUMERODECUENTADELBENEFICIARIO = Target.the("Número de cuenta del beneficiario").located(By.xpath("//input[@placeholder='Número de cuenta del beneficiario']"));
    public static final Target TXT_BANCOBENEFICIARIO = Target.the("Banco beneficiario").located(By.xpath("//input[@placeholder='Banco beneficiario']"));
    public static final Target TXT_CODIGOSWIFTOABA = Target.the("Código SWIFT o ABA").located(By.xpath("//input[@placeholder='Código SWIFT o ABA']"));
    public static final Target TXT_BANCOINTERMEDIARIO = Target.the("Banco intermediario").located(By.xpath("//input[@placeholder='Banco intermediario']"));
    public static final Target TXT_SEGUNDOCODIGOSWIFTOABA = Target.the("Segundo Código SWIFT o ABA").located(By.xpath("(//input[@placeholder='Código SWIFT o ABA'])[2]"));
    public static final Target TXT_SEGUNDONUMERODECUENTADELBENEFICIARIO = Target.the("Segundo Numero de cuenta del beneficiario").located(By.xpath("(//input[@placeholder='Número de cuenta del beneficiario'])[2]"));
}

