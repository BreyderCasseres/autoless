package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionConceptoAmlPage
{
    InformacionConceptoAmlPage() {
        // Do nothing because of X and Y.
    }
    public static final Target TXT_VERIFICARAML = Target.the("Verificar aml").located(By.xpath("//p[contains(text(),'Verificar AML')]/parent::div//parent::div"));
    public static final Target BTN_DARCONCEPTOAML = Target.the("Dar concento aml").located(By.xpath("(//div[@class='item ng-star-inserted']//mat-icon)[2]"));
    public static final Target TXT_CONCEPTOAML = Target.the("Concepto aml").located(By.xpath("//div[@id='concepto-content-wrapper']/textarea"));
    public static final Target RBTN_CONCEPTOPOSITIVO = Target.the("Concepto positivo").located(By.xpath("//mat-radio-group[@id='rb-concepto-aml']/mat-radio-button/label"));
    public static final Target RBTN_CONCEPTONEGATIVO = Target.the("Concepto negativo").located(By.xpath("(//mat-radio-group[@id='rb-concepto-aml']/mat-radio-button/label)[2]"));
    public static final Target BTN_GUARDARCONCEPTO = Target.the("Guardar concepto").located(By.xpath("//button[@id='btn-continuar']"));
    public static final Target BTN_ENVIARCONCEPTO = Target.the("Enviar concepto").located(By.xpath("//button[@id='btn-continuar']"));
    public static final Target CHBX_NIVELRIESGOPEP = Target.the("Nivel de riesgo pep").located(By.xpath("//label[@for='checkbox-pep-input']"));
}

