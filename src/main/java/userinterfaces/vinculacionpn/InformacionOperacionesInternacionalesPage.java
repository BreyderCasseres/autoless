package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionOperacionesInternacionalesPage
{
    InformacionOperacionesInternacionalesPage() {
        // Do nothing because of X and Y.
    }
    public static final Target RBTN_SIREALIZAOPERACIONESENMONEDAEXTRANJERA = Target.the("Si realiza operaciones en moneda extranjera").located(By.xpath("//mat-radio-group[@formcontrolname='realizaOpsMonedaExtranjera']/mat-radio-button/label/div"));
    public static final Target RBTN_NOREALIZAOPERACIONESENMONEDAEXTRANJERA = Target.the("No realiza operaciones en moneda extranjera").located(By.xpath("(//mat-radio-group[@formcontrolname='realizaOpsMonedaExtranjera']/mat-radio-button/label/div)[3]"));
    public static final Target CHBX_CUENTASBANCARIAS = Target.the("Opción Cuentas bancarias").located(By.xpath("//div[@id='check-operations-panel']/mat-checkbox/label"));
    public static final Target CHBX_ENDEUDAMIENTOEXTERNO = Target.the("Opcion Endeudamiento Externo").located(By.xpath("(//div[@id='check-operations-panel']/mat-checkbox/label)[2]"));
    public static final Target CHBX_EXPORTACION = Target.the("Opción Exportación").located(By.xpath("(//div[@id='check-operations-panel']/mat-checkbox/label)[3]"));
    public static final Target CHBX_IMPORTACION = Target.the("Opción Importación").located(By.xpath("(//div[@id='check-operations-panel']/mat-checkbox/label)[4]"));
    public static final Target CHBX_INVERSIONESINTERNACIONALES = Target.the("Opcion Inversiones Internacionales").located(By.xpath("(//div[@id='check-operations-panel']/mat-checkbox/label)[5]"));
    public static final Target CHBX_MERCADONOREGULADO = Target.the("Opcion Mercado no Regulado").located(By.xpath("(//div[@id='check-operations-panel']/mat-checkbox/label)[6]"));
}

