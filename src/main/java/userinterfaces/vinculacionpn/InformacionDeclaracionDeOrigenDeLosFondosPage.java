package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionDeclaracionDeOrigenDeLosFondosPage
{
    InformacionDeclaracionDeOrigenDeLosFondosPage() {
        // Do nothing because of X and Y.
    }
    public static final Target CHBX_HONORARIOSYOCOMISIONES = Target.the("Honorarios y o comisiones").located(By.xpath("//div[@id='resources']/mat-checkbox/label"));
    public static final Target CHBX_INVERSIONESYRENDIMIENTOSFINANCIEROS = Target.the("Inversiones y rendimientos financieros").located(By.xpath("(//div[@id='resources']/mat-checkbox)[2]/label"));
    public static final Target CHBX_PENSION = Target.the("Pension").located(By.xpath("(//div[@id='resources']/mat-checkbox)[3]/label"));
    public static final Target CHBX_PRODUCTOACTIVIDADECONOMICA = Target.the("Producto actividad económica").located(By.xpath("(//div[@id='resources']/mat-checkbox)[4]/label"));
    public static final Target CHBX_RENTAS = Target.the("Rentas").located(By.xpath("(//div[@id='resources']/mat-checkbox)[5]/label"));
    public static final Target CHBX_SALARIOS = Target.the("Salarios").located(By.xpath("(//div[@id='resources']/mat-checkbox)[6]/label"));
    public static final Target CHBX_OTRO = Target.the("Otro").located(By.xpath("(//div[@id='resources']/mat-checkbox)[7]/label"));
    public static final Target TXT_OTROCUAL = Target.the("Otro origen de fondos").located(By.xpath("//input[@formcontrolname='otherResource']"));
    public static final Target TXT_OBSERVACIONES = Target.the("Observaciones").located(By.xpath("//textarea[@formcontrolname='observaciones']"));
}

