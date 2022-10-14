package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionInstruccionPagoRendimientosPage
{
    InformacionInstruccionPagoRendimientosPage() {
        // Do nothing because of X and Y.
    }
    public static final Target CBBX_INSTRUCCIONPAGORENDIMIENTO = Target.the("Instruccion pago rendimiento").located(By.xpath("//div[@class='mat-form-field-flex']"));
    public static final Target CHBX_OPCIONINSTRUCCIONPAGORENDIMIENTO = Target.the("Opcion instruccion pago rendimiento").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'Cuenta Bancaria otras entidades')]"));
    public static final Target TXT_DETALLE = Target.the("Detalle instruccion pago rendimientos").located(By.xpath("//div[@class='mat-form-field-infix']//textarea"));
}

