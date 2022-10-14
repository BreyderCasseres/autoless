package userinterfaces.vinculacionpn;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EstadoReplicacionCorePage {

    public static final Target LBL_ESTADOREPLICACIONCORE = Target.the("Label estado replicación de los core").located(By.xpath("//span[contains(text(),'Estado de Replicación a los Sistemas Core')]"));
    public static final Target TR_ESTADOREPLICACION = Target.the("Tr estado replicación").located(By.xpath("(//tbody/tr//div[contains(text(),'Exitoso')])[1]"));

}
