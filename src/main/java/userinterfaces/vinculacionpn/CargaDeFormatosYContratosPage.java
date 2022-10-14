package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CargaDeFormatosYContratosPage
{
    CargaDeFormatosYContratosPage() {
        // Do nothing because of X and Y.
    }
    public static final Target LINK_CARGARFORMATO = Target.the("Cargar formato").located(By.xpath("//tbody[@role='rowgroup']//td/mat-icon"));
    public static final Target LBL_OPCIONFORMATOS = Target.the("Opción formatos").located(By.xpath("//span[contains(text(),'Formatos')]//parent::div"));
    public static final Target LBL_OPCIONCONTRATOS = Target.the("Opcion contratos").located(By.xpath("//span[contains(text(),'Contratos')]//parent::div"));
    public static final Target LINK_CARGARCONTRATOS = Target.the("Cargar contratos").located(By.xpath("//input[@id='fileExplorer']"));
    public static final Target BTN_ADJUNTAROTRODOCUMENTO = Target.the("Adjuntar otro documento").located(By.xpath("//button[contains(text(),'Adjuntar otro documento ')]/mat-icon"));
    public static final Target BTN_VERARCHIVODOCUMENTOADICIONAL = Target.the("Ver archivo documento adicional").located(By.xpath("//mat-icon[@mattooltip='Ver archivo']"));
    public static final Target BTN_DESCARGARDOCUMENTOADICIONAL = Target.the("Descargar documento adicional").located(By.xpath("//mat-icon[@mattooltip='Descargar']"));
    public static final Target BTN_ELIMINARDOCUMENTOADICIONAL = Target.the("Eliminar documento adicional").located(By.xpath("//mat-icon[@mattooltip='Eliminar']"));
    public static final Target CBBX_SELECCIONARCONTRATO = Target.the("Seleccionar contrato").located(By.xpath("(//div[@class='mat-form-field-flex']/div/mat-select)[1]"));
    public static final Target CHBX_OPCIONCONTRATO = Target.the("Opción contrato").located(By.xpath("(//div[@class='cdk-overlay-pane']/div/div/mat-option)[1]"));
    public static final Target LBL_OPCIONNOMBRECONTRATO = Target.the("Opción contrato").located(By.xpath("//td[@class='uplcon__name-document']"));
    public static final Target BTN_VERARCHIVOCONTRATO = Target.the("Ver archivo contrato").located(By.xpath("//button[@mattooltip='Ver archivo']"));
    public static final Target BTN_ELIMINARARCHIVOCONTRATO = Target.the("Eliminar archivo contrato").located(By.xpath("Eliminar archivo"));
    public static final Target BTN_CERRARPOPOUTCLIENTECREADO = Target.the("Cerar pop out cliente creado").located(By.xpath("//div[@id='close-button-wrapper']/mat-icon"));
}

