package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionConceptoOficialDeCumplimientoPage
{
    InformacionConceptoOficialDeCumplimientoPage() {
        // Do nothing because of X and Y.
    }
    public static final Target LBL_VERIFICAROFICIALDECUMPLIMIENTO = Target.the("Verificar oficial de cumplimiento").located(By.xpath("//div[@id='info-left']//p[contains(text(),'Verificar Oficial Cumplimiento')]/parent::div//parent::div"));
    public static final Target BTN_DARCONCEPTOOFICIALDECUMPLIMIENTO = Target.the("Dar concepto oficial de cumplimiento").located(By.xpath("(//div[@class='item ng-star-inserted']/mat-icon)[2]"));
    public static final Target TXT_CONCEPTOOFICIALDECUMPLIMIENTO = Target.the("Concepto oficial de cumplimiento").located(By.xpath("(//div[@id='concepto-content-wrapper']/textarea)[2]"));
    public static final Target RBTN_CONCEPTOPOSITIVOOC = Target.the("Concepto positivo oc").located(By.xpath("(//mat-radio-group[@id='rb-concepto-aml']/mat-radio-button/label)[3]"));
    public static final Target RBTN_CONCEPTONEGATIVOOC = Target.the("Concepto negativo oc").located(By.xpath("(//mat-radio-group[@id='rb-concepto-aml']/mat-radio-button/label)[4]"));
    public static final Target BTN_GUARDARCONCEPTO = Target.the("Guardar concepto").located(By.id("btn-continuar"));
    public static final Target BTN_ENVIARCONCEPTOOC = Target.the("Enviar concepto oc").located(By.id("btn-continuar"));
}

