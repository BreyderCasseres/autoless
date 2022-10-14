package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GeneralesPage
{
    GeneralesPage() {
        // Do nothing because of X and Y.
    }
    public static final Target LBL_CARGANDO = Target.the("Icono cargando").located(By.xpath("//img[@id='loading-icon']"));
    public static final Target BTN_CONTINUAR = Target.the("Botón continuar").located(By.xpath("//button[contains(text(),'Continuar')]"));
    public static final Target BTN_CONTINUAR2 = Target.the("Botón continuar con punto").located(By.xpath("//button[contains(text(),'Continuar.')]"));
    public static final Target BTN_CONTINUAR3 = Target.the("Botón continuar ccselector").located(By.cssSelector("button#btn-continuar"));
    public static final Target BTN_CONTINUARCSS = Target.the("Botón continuar CSS").located(By.cssSelector("div.nav-btn-options button.full-width"));
    public static final Target BTN_GUARDARYSALIR = Target.the("Botón de guardar y salir").located(By.xpath("//button[@id='btn-abandonar']"));
    public static final Target BTN_ATRAS = Target.the("btn-atras").located(By.id("btn-atras"));
    public static final Target LBL_CERRARMODALCLIENTECREADO = Target.the("Cerrar modal cliente creado").located(By.xpath("//div[@class='sucreg']//mat-icon"));
    public static final Target LBL_CLIENTECREADOEXITOSAMENTE = Target.the("Cliente creado exitosamente").located(By.xpath("//p[contains(text(),'¡Cliente creado exitosamente!')]"));
    public static final Target LBL_POPUPCLIENTECREADO = Target.the("Pop up cliente creado").located(By.cssSelector("div.sucreg"));
}

