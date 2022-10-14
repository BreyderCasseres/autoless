package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionPagoDeDividendosPage
{
    InformacionPagoDeDividendosPage() {
        // Do nothing because of X and Y.
    }
    public static final Target CBBX_PAGODIVIDENDOS = Target.the("Pago dividendos").located(By.xpath("//app-select[@formcontrolname='pagoDividendo']//div[@class='mat-form-field-flex']"));
    public static final Target CHBX_OPCIONPAGODIVIDENDO = Target.the("Opcion pago dividendo").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'Cartera')]"));
    public static final Target CBBX_ANOMBREDEQUIENESTALACUENTA = Target.the("A nombre de quien esta la cuenta").located(By.xpath("//app-select[@formcontrolname='titularCuenta']//div[@class='mat-form-field-flex']"));
    public static final Target CHBX_OPCIONANOMBREDEQUIENESTALACUENTA = Target.the("Opción a nombre de quien esta la cuenta").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'Tercero')]"));
    public static final Target TXT_CODIGOOYD = Target.the("Código oyd").located(By.xpath("//input[@formcontrolname='codigoOyD']"));
    public static final Target TXT_NOMBRETERCEROPAGODIVIDENDOS = Target.the("Nombre tercero pago dividendos").located(By.xpath("//input[@formcontrolname='nombreTercero']"));
    public static final Target TXT_NUMEROIDENTIFICACIONTERCEROPAGODIVIDENDOS = Target.the("Numero identificacion tercero pago dividendos").located(By.xpath("//input[@formcontrolname='numeroIdentificacion']"));
    public static final Target CBBX_TIPODECUENTAPAGODIVIDENDOS = Target.the("Tipo de cuenta pago dividendos").located(By.xpath("//app-select[@formcontrolname='tipoCuenta']"));
    public static final Target CHBX_OPCIONTIPODECUENTAPAGODIVIDENDOS = Target.the("Opcion tipo de cuenta pago dividendos").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'Ahorros')]"));
    public static final Target CBBX_ENTIDADFINANCIERAPAGODIVIDENDOS = Target.the("Entidad financiera pago dividendos").located(By.xpath("//app-financial-entity[@formcontrolname='entidadFinanciera']"));
    public static final Target CHBX_OPCIÓNENTIDADFINANCIERAPAGODIVIDENDOS = Target.the("Opción entidad financiera pago dividendos").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'Bancolombia S.A.')]"));
    public static final Target TXT_NUMEROCUENTAPAGODIVIDENDOS = Target.the("Numero cuenta pago dividendos").located(By.xpath("//input[@formcontrolname='numeroCuenta']"));
    public static final Target TXT_CLASE = Target.the("Clase FIC liquidez BTG").located(By.xpath("//input[@formcontrolname='clase']"));
    public static final Target TXT_ENCARGO = Target.the("Encargo FIC liquidez BTG").located(By.xpath("//input[@formcontrolname='encargo']"));
}

