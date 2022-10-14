package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleccionDeProductosPage
{
    SeleccionDeProductosPage() {
        // Do nothing because of X and Y.
    }
    public static final Target CBBX_SEGMENTODELCLIENTE = Target.the("Segmento del cliente").located(By.xpath("//div[@class='mat-form-field-flex']"));
    public static final Target CHBX_OPCIONSEGMENTODELCLIENTE = Target.the("Opción segmento del cliente").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),' Mesa Digital ')]"));
    public static final Target CHBX_CDT = Target.the("Producto CDT").located(By.xpath("//label[@class='mat-checkbox-layout']"));
    public static final Target CHBX_CREDITOCOMERCIAL = Target.the("Producto Credito comercial").located(By.xpath("(//label[@class='mat-checkbox-layout'])[2]"));
    public static final Target CHBX_CREDITOLOMBARDO = Target.the("Producto Credito lombardo").located(By.xpath("(//label[@class='mat-checkbox-layout'])[3]"));
    public static final Target CHBX_CUENTACORRIENTE = Target.the("Producto Cuenta corriente").located(By.xpath("(//label[@class='mat-checkbox-layout'])[4]"));
    public static final Target RBTN_CUENTACORRIENTESIAPLICASOBREGIRO = Target.the("Cuenta corriente si aplica sobregiro").located(By.xpath("//div[@class='rb-wrapper']//mat-radio-button/label"));
    public static final Target RBTN_CUENTACORRIENTENOAPLICASOBREGIRO = Target.the("Cuenta corriente No aplica sobregiro").located(By.xpath("(//div[@class='rb-wrapper']//mat-radio-button/label)[2]"));
    public static final Target CHBX_DERIVADOSNOESTANDARIZADOSBANCO = Target.the("Producto Derivados no estandarizados Banco").located(By.xpath("(//label[@class='mat-checkbox-layout'])[5]"));
    public static final Target CHBX_DIVISASBANCO = Target.the("Producto Divisas Banco").located(By.xpath("(//label[@class='mat-checkbox-layout'])[6]"));
    public static final Target CHBX_GARANTIASBANCARIAS = Target.the("Producto Garantías bancarias").located(By.xpath("(//label[@class='mat-checkbox-layout'])[7]"));
    public static final Target CHBX_OPERACIONESDELIQUIDEZ = Target.the("Producto Operaciones de liquidez").located(By.xpath("(//label[@class='mat-checkbox-layout'])[8]"));
    public static final Target RBTN_SICUENTACONEXCEPCIONDEFIRMACODEUDOROPAGARE = Target.the("Si cuenta con excepcion de firma codeudor o pagare").located(By.xpath("//div[@class='m-exception-question__options']//mat-radio-button/label"));
    public static final Target RBTN_NOCUENTACONEXCEPCIONDEFIRMACODEUDOROPAGARE = Target.the("No cuenta con excepcion de firma codeudor o pagare").located(By.xpath("(//div[@class='m-exception-question__options']//mat-radio-button/label)[2]"));
    public static final Target CHBX_RENTAFIJABANCO = Target.the("Producto Renta fija Banco").located(By.xpath("(//label[@class='mat-checkbox-layout'])[9]"));
    public static final Target CHBX_APTS = Target.the("Producto APTS").located(By.xpath("(//label[@class='mat-checkbox-layout'])[10]"));
    public static final Target CHBX_ACCIONES = Target.the("Producto Acciones").located(By.xpath("(//label[@class='mat-checkbox-layout'])[11]"));
    public static final Target CHBX_DERIVADOSESTANDARIZADOSSCB = Target.the("Producto Derivados estandarizados SCB").located(By.xpath("(//label[@class='mat-checkbox-layout'])[12]"));
    public static final Target RBTN_SICUENTACONEXCEPCIONDEFIRMACODEUDOROPAGAREDE = Target.the("Si cuenta con excepcion de firma codeudor o pagare DE").located(By.xpath("(//div[@class='m-exception-question__options']//mat-radio-button/label)[3]"));
    public static final Target RBTN_NOCUENTACONEXCEPCIONDEFIRMACODEUDOROPAGAREDE = Target.the("No cuenta con excepcion de firma codeudor o pagare DE").located(By.xpath("(//div[@class='m-exception-question__options']//mat-radio-button/label)[4]"));
    public static final Target CHBX_DERIVADOSNOESTANDARIZADOSSCB = Target.the("Producto Derivados no estandarizados SCB").located(By.xpath("(//label[@class='mat-checkbox-layout'])[13]"));
    public static final Target RBTN_SICUENTACONEXCEPCIONDEFIRMACODEUDOROPAGAREDNE = Target.the("Si cuenta con excepcion de firma codeudor o pagare DNE").located(By.xpath("(//div[@class='m-exception-question__options']//mat-radio-button/label)[5]"));
    public static final Target RBTN_NOCUENTACONEXCEPCIONDEFIRMACODEUDOROPAGAREDNE = Target.the("No cuenta con excepcion de firma codeudor o pagare DNE").located(By.xpath("(//div[@class='m-exception-question__options']//mat-radio-button/label)[6]"));
    public static final Target CHBX_DIVISASSCB = Target.the("Producto Divisas SCB").located(By.xpath("(//label[@class='mat-checkbox-layout'])[14]"));
    public static final Target CHBX_FONDODEINVERSIONCOLECTIVA = Target.the("Producto Fondo de inversion colectiva").located(By.xpath("(//label[@class='mat-checkbox-layout'])[15]"));
    public static final Target CHBX_FONDODEINVERSIONCOLECTIVALISTADOENBOLSA = Target.the("Producto Fondo de inversion colectiva listado en bolsa").located(By.xpath("(//label[@class='mat-checkbox-layout'])[16]"));
    public static final Target CHBX_ACTIVOS = Target.the("Producto Activos").located(By.xpath("(//label[@class='mat-checkbox-layout'])[17]"));
    public static final Target RBTN_SICUENTACONEXCEPCIONDEFIRMACODEUDOROPAGAREACTIVOS = Target.the("Si cuenta con excepcion de firma codeudor o pagare Activos").located(By.xpath("(//div[@class='m-exception-question__options']//mat-radio-button/label)[7]"));
    public static final Target RBTN_NOCUENTACONEXCEPCIONDEFIRMACODEUDOROPAGAREACTIVOS = Target.the("No cuenta con excepcion de firma codeudor o pagare Activos").located(By.xpath("(//div[@class='m-exception-question__options']//mat-radio-button/label)[8]"));
    public static final Target CHBX_PASIVOS = Target.the("Producto Pasivos").located(By.xpath("(//label[@class='mat-checkbox-layout'])[18]"));
    public static final Target RBTN_SICUENTACONEXCEPCIONDEFIRMACODEUDOROPAGAREPASIVOS = Target.the("Si cuenta con excepcion de firma codeudor o pagare Pasivos").located(By.xpath("(//div[@class='m-exception-question__options']//mat-radio-button/label)[9]"));
    public static final Target RBTN_NOCUENTACONEXCEPCIONDEFIRMACODEUDOROPAGAREPASIVOS = Target.the("No cuenta con excepcion de firma codeudor o pagare Pasivos").located(By.xpath("(//div[@class='m-exception-question__options']//mat-radio-button/label)[10]"));
    public static final Target CHBX_SIMULTANEAS = Target.the("Producto Simultaneas").located(By.xpath("(//label[@class='mat-checkbox-layout'])[19]"));
    public static final Target RBTN_SICUENTACONEXCEPCIONDEFIRMACODEUDOROPAGARESIMULTANEAS = Target.the("Si cuenta con excepcion de firma codeudor o pagare Simultaneas").located(By.xpath("(//div[@class='m-exception-question__options']//mat-radio-button/label)[11]"));
    public static final Target RBTN_NOCUENTACONEXCEPCIONDEFIRMACODEUDOROPAGARESIMULTANEAS = Target.the("No cuenta con excepcion de firma codeudor o pagare Simultaneas").located(By.xpath("(//div[@class='m-exception-question__options']//mat-radio-button/label)[12]"));
    public static final Target CHBX_ACCIONESORIGINADORAS = Target.the("Producto Acciones originadoras").located(By.xpath("(//label[@class='mat-checkbox-layout'])[20]"));
    public static final Target RBTN_SICUENTACONEXCEPCIONDEFIRMACODEUDOROPAGAREAO = Target.the("Si cuenta con excepcion de firma codeudor o pagare AO").located(By.xpath("(//div[@class='m-exception-question__options']//mat-radio-button/label)[13]"));
    public static final Target RBTN_NOCUENTACONEXCEPCIONDEFIRMACODEUDOROPAGAREAO = Target.the("No cuenta con excepcion de firma codeudor o pagare AO").located(By.xpath("(//div[@class='m-exception-question__options']//mat-radio-button/label)[14]"));
    public static final Target CHBX_ACCIONESRECEPTORAS = Target.the("Producto Acciones receptoras").located(By.xpath("(//label[@class='mat-checkbox-layout'])[21]"));
    public static final Target RBTN_SICUENTACONEXCEPCIONDEFIRMACODEUDOROPAGAREAR = Target.the("Si cuenta con excepcion de firma codeudor o pagare AR").located(By.xpath("(//div[@class='m-exception-question__options']//mat-radio-button/label)[15]"));
    public static final Target RBTN_NOCUENTACONEXCEPCIONDEFIRMACODEUDOROPAGAREAR = Target.the("No cuenta con excepcion de firma codeudor o pagare AR").located(By.xpath("(//div[@class='m-exception-question__options']//mat-radio-button/label)[16]"));
    public static final Target CHBX_RENTAFIJASCB = Target.the("Producto Renta fija SCB").located(By.xpath("(//label[@class='mat-checkbox-layout'])[22]"));
    public static final Target CHBX_SERVICIODEPAGOBTG = Target.the("Producto Servicio de pago BTG").located(By.xpath("(//label[@class='mat-checkbox-layout'])[23]"));
    public static final Target CHBX_FONDOVOLUNTARIODEPENSIONES = Target.the("Producto Fondo voluntario de pensiones").located(By.xpath("(//label[@class='mat-checkbox-layout'])[24]"));
    public static final Target BTN_ACEPTARVINCULARPRODUCTOS = Target.the("Aceptar vincular productos").located(By.xpath("//div[@class='modal-wrapper']//button[contains(text(),'Aceptar')]"));
    public static final Target BTN_CANCELARVINCULARPRODUCTOS = Target.the("Cancelar vincular productos").located(By.xpath("//div[@class='modal-wrapper']//button[contains(text(),'Cancelar')]"));
}

