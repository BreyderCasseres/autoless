package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionFamiliarPage
{
    InformacionFamiliarPage() {
        // Do nothing because of X and Y.
    }
    public static final Target LBL_CARGARVINCULOSFAMILIARES = Target.the("Cargar vinculos familiares").located(By.xpath("//p[contains(text(),'Cargar Vinculos Familiares')]"));
    public static final Target RBTN_SITIENEVINCULOFAMILIAR = Target.the("Si tiene vinculo familiar").located(By.xpath("//div[@class='customer-body']//div[@class='mat-radio-container']"));
    public static final Target RBTN_NOTIENEVINCULOFAMILIAR = Target.the("No tiene vinculo familiar").located(By.xpath("(//div[@class='customer-body']//div[@class='mat-radio-container'])[2]"));
    public static final Target LINK_AGREGARFAMILIAR = Target.the("Agregar familiar").located(By.xpath("//span[contains(text(),'+ Agregar familiar')]"));
    public static final Target CBBX_TIPOIDENTIFICACIONFAMILIAR = Target.the("Tipo identificacion familiar").located(By.cssSelector("div.mat-form-field-flex"));
    public static final Target CHBX_OPCIONTIPOIDENTIFICACIONFAMILIAR = Target.the("Opción tipo identificación familiar").located(By.xpath("//span[contains(text(),'Cédula ')]"));
    public static final Target TXT_NUMEROIDENTIFICACIONFAMILIAR = Target.the("Numero identificación familiar").located(By.xpath("//input[@formcontrolname='numeroDocumento']"));
    public static final Target BTN_CONSULTARDOCUMENTO = Target.the("Consultar documento familiar").located(By.xpath("//button[contains(text(),'Consultar documento')]"));
    public static final Target TXT_PRIMERNOMBREFAMILIAR = Target.the("Primer nombre familiar").located(By.xpath("//input[@formcontrolname='primerNombre']"));
    public static final Target TXT_SEGUNDONOMBREFAMILIAR = Target.the("Segundo nombre familiar").located(By.xpath("//input[@formcontrolname='segundoNombre']"));
    public static final Target TXT_PRIMERAPELLIDOFAMILIAR = Target.the("Primer apellido familiar").located(By.xpath("//input[@formcontrolname='primerApellido']"));
    public static final Target TXT_SEGUNDOAPELLIDOFAMILIAR = Target.the("Segundo apellido familiar").located(By.xpath("//input[@formcontrolname='segundoApellido']"));
    public static final Target CBBX_TIPOVINCULO = Target.the("Tipo vinculo").located(By.xpath("//mat-select[@formcontrolname='tipoVinculo']"));
    public static final Target CHBX_OPCIONTIPOVINCULO = Target.the("Opción tipo vinculo").located(By.xpath("//span[contains(text(),'Empleado BTG')]"));
    public static final Target CBBX_PARENTESCO = Target.the("Parentesco").located(By.xpath("//mat-select[@formcontrolname='parentesco']"));
    public static final Target CHBX_OPCIONPARENTESCO = Target.the("Opción parentesco").located(By.xpath("//span[contains(text(),'Primo / Prima ')]"));
}

