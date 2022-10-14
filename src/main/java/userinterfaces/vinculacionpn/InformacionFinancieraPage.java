package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionFinancieraPage
{
    InformacionFinancieraPage() {
        // Do nothing because of X and Y.
    }
    public static final Target BTN_AGREGARINFORMACIONFINANCIERACLIENTE = Target.the("Agregar informacion financiera cliente").located(By.xpath("(//div[@title='Cliente']//mat-icon)[2]"));
    public static final Target TXT_INGRESOMENSUAL = Target.the("Ingreso mensual").located(By.xpath("//input[@formcontrolname='ingresoMensual']"));
    public static final Target TXT_OTROSINGRESOS = Target.the("Otros ingresos").located(By.xpath("//input[@formcontrolname='otrosIngresos']"));
    public static final Target TXT_DETALLEOTROSINGRESOS = Target.the("Detalle otros ingresos").located(By.xpath("//textarea[@formcontrolname='detalleOtrosIngresos']"));
    public static final Target TXT_EGRESOMENSUAL = Target.the("Egreso mensual").located(By.xpath("//input[@formcontrolname='egresoMensual']"));
    public static final Target TXT_ACTIVO = Target.the("Activo").located(By.xpath("//input[@formcontrolname='activo']"));
    public static final Target TXT_PASIVO = Target.the("Pasivo").located(By.xpath("//input[@formcontrolname='pasivo']"));
    public static final Target BTN_AGREGARINFORMACIONFINANCIERAORDENANTE = Target.the("Agregar informacion financiera ordenante").located(By.xpath("(//div[@title='Ordenantes']//mat-icon)[2]"));
    public static final Target LBL_CARGARINFORMACIONFINANCIERA= Target.the("Label carga informacióon financiera").located(By.xpath("//p[contains(text(),'Cargar Informacion Financiera')]"));
}

