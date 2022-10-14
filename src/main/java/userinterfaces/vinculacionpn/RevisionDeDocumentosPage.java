package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RevisionDeDocumentosPage
{
    RevisionDeDocumentosPage() {
        // Do nothing because of X and Y.
    }
    public static final Target SLIDE_TIPOAPROBADO = Target.the("Tipo aprobado").located(By.xpath("(//input[@aria-checked='false'])[1]"));
    public static final Target LINK_VERARCHIVO = Target.the("Ver archivo").located(By.xpath("(//span[contains(text(),'Ver archivo')])[1]"));
    public static final Target CBBX_INFORMACIONDELCLIENTEESCORRECTA = Target.the("Informacion del cliente es correcta").located(By.xpath("//div[@class='mat-select-trigger']//div[@class='mat-select-arrow-wrapper']"));
    public static final Target CHBX_OPCIONINFORMACIONCLIENTEESCORRECTA = Target.the("Opcion informacion cliente es correcta").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'Sí')]"));
    public static final Target TXT_DETALLESOBRELADEVOLUCION = Target.the("Detalle sobre la devolucion").located(By.xpath("//app-approv-modal[@class='ng-star-inserted']//textarea"));
    public static final Target BTN_CANCELARREVISIONDEDOCUMENTOS = Target.the("Cancelar revision de documentos").located(By.id("btn-confirm-cancelar"));
    public static final Target BTN_ACEPTARREVISIONDEDOCUMENTOS = Target.the("Aceptar revision de documentos").located(By.xpath("//button[@id='btn-confirm-aceptar']"));
}

