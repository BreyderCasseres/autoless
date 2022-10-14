package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ListadoDeDocumentosPage
{
    ListadoDeDocumentosPage() {
        // Do nothing because of X and Y.
    }
    public static final Target RBTN_SIDESEAAGREGARORDENANTE = Target.the("Si desea agregar ordenante").located(By.xpath("//mat-radio-group[@formcontrolname='addOrdenantes']/mat-radio-button/label"));
    public static final Target RBTN_NODESEAAGREGARORDENANTE = Target.the("No desea agregar ordenante").located(By.xpath("(//mat-radio-group[@formcontrolname='addOrdenantes']/mat-radio-button/label)[2]"));
    public static final Target LINK_ADJUNTARPDF = Target.the("Adjuntar pdf").located(By.xpath("//span[contains(text(),'Adjuntar pdf')]"));
    public static final Target LINK_ADJUNTARPDFINPUT = Target.the("Adjuntar pdf").located(By.xpath("(//input[@id='fileExplorer'])[1]"));
    public static final Target LINK_ADJUNTARDENUEVO = Target.the("Adjuntar de nuevo").located(By.xpath("//mat-icon[@mattooltip='Adjuntar de nuevo']"));
    public static final Target BTN_ADJUNTAROTRODOCUMENTO = Target.the("Adjuntar otro documento").located(By.xpath("//button[@id='btn-adjuntar-soporte']"));
    public static final Target LINK_VERARCHIVO = Target.the("Ver archivo").located(By.xpath("//span[contains(text(),'Ver archivo')]"));
    public static final Target LINK_DESCARGARARCHIVO = Target.the("Descargar archivo").located(By.xpath("//mat-icon[@mattooltip='Descargar']"));
    public static final Target BTN_ELIMINARARCHIVO = Target.the("Eliminar archivo").located(By.xpath("//mat-icon[@mattooltip='Eliminar']"));
    public static final Target LBL_DOCUMENTACIONREQUERIDA = Target.the("Documentacion requerida").located(By.xpath("//Div[contains(text(),'Documentación requerida')]"));
    public static final Target LBL_DOCUMENTACIONORDENANTES = Target.the("Documentación Ordenantes").located(By.xpath("//Div[contains(text(),'Documentación Ordenantes')]"));
    public static final Target BTN_ADJUNTAAQUI = Target.the("Adjunta aquí").located(By.xpath("//span[@class='button-file']"));
}

