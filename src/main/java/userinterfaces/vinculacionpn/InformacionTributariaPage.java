package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionTributariaPage
{
    InformacionTributariaPage() {
        // Do nothing because of X and Y.
    }
    public static final Target RBTN_CLIENTEDECLARANTEDERENTA = Target.the("Cliente Declarante de renta").located(By.xpath("//mat-radio-group[@formcontrolname='incomeTaxpayer']//mat-radio-button[@value='NO']"));
    public static final Target RBTN_SIESCONTRIBUYENTEDELIMPUESTOSOBRELARENTA = Target.the("Si es contribuyente del impuesto sobre la renta").located(By.xpath("(//mat-radio-group[@formcontrolname='contribuyenteImpuesto']//mat-radio-button//label)[1]"));
    public static final Target RBTN_NOESCONTRIBUYENTEDELIMPUESTOSOBRELARENTA = Target.the("No es contribuyente del impuesto sobre la renta").located(By.xpath("(//mat-radio-group[@formcontrolname='contribuyenteImpuesto']//mat-radio-button//label)[2]"));
    public static final Target CBBX_REGIMENCONTRIBUYENTEIMPUESTOSOBRELARENTA = Target.the("Regimen Contribuyente impuesto sobre la renta").located(By.xpath("//mat-select[@formcontrolname='tipoRegimen']"));
    public static final Target CHBX_OPCIONREGIMENCONTRIBUYENTEIMPUESTOSOBRERENTA = Target.the("Opción Regimen Contribuyente Impuesto sobre renta").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'Otro')]"));
    public static final Target TXT_DETALLEREGIMENCONTRIBUYENTEIMPUESTOSOBRERENTA = Target.the("Detalle Regimen Contribuyente Impuesto sobre renta").located(By.xpath("//input[@formcontrolname='otroRegimen']"));
    public static final Target RBTN_SIESAUTORRETENEDORDERENDIMIENTOFINANCIEROS = Target.the("SI es autorretenedor de rendimiento financieros").located(By.xpath("(//mat-radio-group[@formcontrolname='autoRetenedor']//mat-radio-button//label)[1]"));
    public static final Target RBTN_NOESAUTORRETENEDORDERENDIMIENTOFINANCIEROS = Target.the("NO es autorretenedor de rendimiento financieros").located(By.xpath("(//mat-radio-group[@formcontrolname='autoRetenedor']//mat-radio-button//label)[2]"));
    public static final Target TXT_NUMERORESOLUCIONAUTORRETENEDORRENDIMIENTOSFINANCIEROS = Target.the("Número Resolución Autorretenedor rendimientos financieros").located(By.xpath("//input[@formcontrolname='numeroResolucion']"));
    public static final Target RBTN_ESRESPONSABLEDEIVA = Target.the("Es responsable de IVA").located(By.cssSelector("[formcontrolname=\"responsableIva\"] > mat-radio-button[value=\"SI\"] > label"));
    public static final Target RBTN_ESCONTRIBUYANTEDELIMPUESTOINDUSTRIAYCOMERCIO = Target.the("Es contribuyante del impuesto Industria y comercio").located(By.xpath("//mat-radio-group[@formcontrolname='contribuyenteIndustriaComercio']//mat-radio-button[@value='SI']//label/div/div"));
    public static final Target CBBX_MUNICIPIOUNOCONTRIBUYENTEINDUSTRIAYCOMERCIO = Target.the("Municipio Uno Contribuyente Industria y Comercio").located(By.xpath("//input[@formcontrolname='ciudadContribuyenteIndustriaComercio']"));
    public static final Target CBBX_MUNICIPIODOSCONTRIBUYENTEINDUSTRIAYCOMERCIO = Target.the("Municipio Dos Contribuyente Industria y Comercio").located(By.xpath("//input[@formcontrolname='ciudadDosContribuyenteIndustriaComercio']"));
    public static final Target CBBX_MUNICIPIOTRESCONTRIBUYENTEINDUSTRIAYCOMERCIO = Target.the("Municipio Tres Contribuyente Industria y Comercio").located(By.xpath("//input[@formcontrolname='ciudadTresContribuyenteIndustriaComercio']"));
    public static final Target LINK_AGREGARMAS = Target.the("Link con función de agregar más").located(By.xpath("//span[contains(text(),'Agregar mas')]"));
    public static final Target CHBX_OPCIONMUNICIPIO = Target.the("Opcion Municipio").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'ABEJORRAL')]"));
    public static final Target RBTN_DEPENDEECONOMICAMENTEDEUNTERCERO = Target.the("Cliente Depende Económicamente de un Tercer").located(By.xpath("//mat-radio-group[@formcontrolname='dependecyOther']//mat-radio-button[@value='SI']/label/div/div"));
    public static final Target RBTN_NODEPENDEECONOMICAMENTEDEUNTERCERO = Target.the("Cliente Depende Económicamente de un Tercer").located(By.xpath("//mat-radio-group[@formcontrolname='dependecyOther']//mat-radio-button[@value='NO']/label/div/div"));
}

