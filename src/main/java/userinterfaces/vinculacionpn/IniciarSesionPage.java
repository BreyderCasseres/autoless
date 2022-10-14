package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IniciarSesionPage
{
    IniciarSesionPage() {
        // Do nothing because of X and Y.
    }
    public static final Target TXT_USUARIO = Target.the("Nombre del usuario que ingresará al aplicativo").located(By.id("txt_username"));
    public static final Target TXT_CONTRASENIA = Target.the("Contraseña del usuario que ingresará al aplicativo").located(By.id("txt_password"));
    public static final Target BTN_INGRESARLOGIN = Target.the("Botón para iniciar sesión").located(By.id("btn_submit"));
    public static final Target LINK_CERRARSESION = Target.the("Opción cerrar sesion").located(By.id("link-close-session"));
    public static final Target LBL_NOMBREDEUSUARIO = Target.the("Label para validar que el usuario inicio sesión exitosamente").located(By.xpath("//p[contains(text(),'Breyder Casseres')]"));
}

