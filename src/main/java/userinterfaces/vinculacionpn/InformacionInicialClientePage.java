package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionInicialClientePage
{
    InformacionInicialClientePage() {
        // Do nothing because of X and Y.
    }
    public static final Target BTN_VINCULARPERSONANATURAL = Target.the("Botón para ir a la opción de persona natural").located(By.xpath("//p[contains(text(),'Vincular Cliente Natural')]"));
    //public static final Target CBBX_TIPODEDOCUMENTOCLIENTE = Target.the("Lista de tipos de documentos").located(By.cssSelector("div.mat-select-trigger > div.mat-select-value"));
    public static final Target CBBX_TIPODEDOCUMENTOCLIENTE = Target.the("Lista de tipos de documentos").located(By.cssSelector("div.mat-select-arrow-wrapper > div.mat-select-arrow"));
    //public static final Target CBBX_TIPODEDOCUMENTOCLIENTE = Target.the("Lista de tipos de documentos").located(By.xpath("//*[@role=\"listbox\"]/div/div[2]/div"));
    //*[@id="mat-select-0"]/div/div[2]/div
    public static final Target CHBX_OPCIONTIPODOCCLIENTE = Target.the("Opcion Cedula ciudadania").located(By.cssSelector("div.ng-tns-c4-1 > mat-option#mat-option-0"));
    public static final Target TXT_NUMEROIDENTIFICACIONCLIENTE = Target.the("Numero Identificacion del Cliente").located(By.xpath("//input[@formcontrolname='numDocumento']"));
    public static final Target BTN_CONTINUAR = Target.the("Botón continuar").located(By.xpath("//button[@id='btn-continuar']"));
    public static final Target TXT_PRIMERNOMBRECLIENTE = Target.the("Primer Nombre Cliente").located(By.xpath("//input[@formcontrolname='primerNombre']"));
    public static final Target TXT_SEGUNDONOMBRECLIENTE = Target.the("Segundo Nombre Cliente").located(By.xpath("//input[@formcontrolname='segundoNombre']"));
    public static final Target TXT_PRIMERAPELLIDOCLIENTE = Target.the("Primer Apellido Cliente").located(By.xpath("//input[@formcontrolname='primerApellido']"));
    public static final Target TXT_SEGUNDOAPELLIDOCLIENTE = Target.the("Segundo Apellido Cliente").located(By.xpath("//input[@formcontrolname='segundoApellido']"));
    public static final Target BTN_ATRAS = Target.the("Botón para ir a preguntas anteriores").located(By.xpath("//button[@id='btn-atras']"));
    public static final Target OPTION_SELECT = Target.the("option to select")
            .locatedBy("//mat-option//span[contains(text(),'{0}')]");



}

