package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DescargaDeFormatosYContratosPage
{
    DescargaDeFormatosYContratosPage() {
        // Do nothing because of X and Y.
    }
    public static final Target LBL_DECARGARFORMATOSYCONTRATOS = Target.the("Decargar formatos y contratos").located(By.xpath("//div[@id='info-left']//p[contains(text(),'Descargar Formatos y Contratos')]/parent::div//parent::div"));
    public static final Target LINK_DESCARGARFORMATO = Target.the("Descargar formato").located(By.xpath("(//tbody//td/mat-icon)[1]"));
    public static final Target LINK_DESCARGARCONTRATO = Target.the("Descargar contrato").located(By.xpath("(//tbody//td/mat-icon)[1]"));
    public static final Target BTN_DESCARGARTODO = Target.the("Descargar todo").located(By.xpath("//span[contains(text(),'Descargar todo')]"));
    public static final Target LBL_OPCIONFORMATOS = Target.the("Opción formatos").located(By.xpath("//span[contains(text(),'Formatos')]//parent::div"));
    public static final Target LBL_OPCIONCONTRATOS = Target.the("Opción contratos").located(By.xpath("//span[contains(text(),'Contratos')]//parent::div"));
    public static final Target BTN_AGREGAROTROCONTRATOCUENTACORRIENTE = Target.the("Agregar otro contrato cuenta corriente").located(By.xpath("(//button[@class='mat-icon-button mat-button-base']/span)[2]"));
    public static final Target BTN_QUITARCONTRATOCUENTACORRIENTE = Target.the("Quitar cuenta corriente").located(By.xpath("//button[@class='mat-icon-button mat-button-base']/span"));
}

