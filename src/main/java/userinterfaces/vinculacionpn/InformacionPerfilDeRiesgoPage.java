package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionPerfilDeRiesgoPage
{
    InformacionPerfilDeRiesgoPage() {
        // Do nothing because of X and Y.
    }
    public static final Target RBTN_PREGUNTAAOPCIONUNO = Target.the("Objetivo opcion 1").located(By.xpath("//mat-radio-group[@formcontrolname='preguntaA']//mat-radio-button/label/div"));
    public static final Target RBTN_PREGUNTAAOPCIONDOS = Target.the("Objetivo opcion 2").located(By.xpath("(//mat-radio-group[@formcontrolname='preguntaA']//mat-radio-button/label/div)[3]"));
    public static final Target RBTN_PREGUNTAAOPCIONTRES = Target.the("Objetivo opcion 3").located(By.xpath("(//mat-radio-group[@formcontrolname='preguntaA']//mat-radio-button/label/div)[5]"));
    public static final Target RBTN_PREGUNTABOPCIONUNO = Target.the("Horizonte de tiempo opcion 1").located(By.xpath("//mat-radio-group[@formcontrolname='preguntaB']//mat-radio-button/label/div"));
    public static final Target RBTN_PREGUNTABOPCIONDOS = Target.the("Horizonte de tiempo opcion 2").located(By.xpath("(//mat-radio-group[@formcontrolname='preguntaB']//mat-radio-button/label/div)[3]"));
    public static final Target RBTN_PREGUNTABOPCIONTRES = Target.the("Horizonte de tiempo").located(By.xpath("(//mat-radio-group[@formcontrolname='preguntaB']//mat-radio-button/label/div)[5]"));
    public static final Target RBTN_PREGUNTACOPCIONUNO = Target.the("Porcentaje de este portafolio opcion 1").located(By.xpath("//mat-radio-group[@formcontrolname='preguntaC']//mat-radio-button/label/div"));
    public static final Target RBTN_PREGUNTACOPCIONDOS = Target.the("Porcentaje de este portafolio opcion 2").located(By.xpath("(//mat-radio-group[@formcontrolname='preguntaC']//mat-radio-button/label/div)[3]"));
    public static final Target RBTN_PREGUNTACOPCIONTRES = Target.the("Porcentaje de este portafolio opcion 3").located(By.xpath("(//mat-radio-group[@formcontrolname='preguntaC']//mat-radio-button/label/div)[5]"));
    public static final Target RBTN_PREGUNTADOPCIONUNO = Target.the("Pérdida temporal opcion 1").located(By.xpath("//mat-radio-group[@formcontrolname='preguntaD']//mat-radio-button/label/div"));
    public static final Target RBTN_PREGUNTADOPCIONDOS = Target.the("Pérdida temporal opcion 2").located(By.xpath("(//mat-radio-group[@formcontrolname='preguntaD']//mat-radio-button/label/div)[3]"));
    public static final Target RBTN_PREGUNTADOPCIONTRES = Target.the("Pérdida temporal opcion 3").located(By.xpath("(//mat-radio-group[@formcontrolname='preguntaD']//mat-radio-button/label/div)[5]"));
    public static final Target RBTN_PREGUNTAEOPCIONUNO = Target.the("Productos opcion 1").located(By.xpath("//mat-radio-group[@formcontrolname='preguntaE']//mat-radio-button/label/div"));
    public static final Target RBTN_PREGUNTAEOPCIONDOS = Target.the("Productos opcion 2").located(By.xpath("(//mat-radio-group[@formcontrolname='preguntaE']//mat-radio-button/label/div)[3]"));
    public static final Target RBTN_PREGUNTAEOPCIONTRES = Target.the("Productos opcion 3").located(By.xpath("(//mat-radio-group[@formcontrolname='preguntaE']//mat-radio-button/label/div)[5]"));
    public static final Target RBTN_PREGUNTAFOPCIONUNO = Target.the("Intervalo de retorno opcion 1").located(By.xpath("//mat-radio-group[@formcontrolname='preguntaF']//mat-radio-button/label/div"));
    public static final Target RBTN_PREGUNTAFOPCIONDOS = Target.the("Intervalo de retorno opcion 2").located(By.xpath("(//mat-radio-group[@formcontrolname='preguntaF']//mat-radio-button/label/div)[3]"));
    public static final Target RBTN_PREGUNTAFOPCIONTRES = Target.the("Intervalo de retorno opcion 3").located(By.xpath("(//mat-radio-group[@formcontrolname='preguntaF']//mat-radio-button/label/div)[5]"));
    public static final Target RBTN_PREGUNTAGOPCIONUNO = Target.the("Pérdida hipotéticamente opcion 1").located(By.xpath("//mat-radio-group[@formcontrolname='preguntaG']//mat-radio-button/label/div"));
    public static final Target RBTN_PREGUNTAGOPCIONDOS = Target.the("Pérdida hipotéticamente opcion 2").located(By.xpath("(//mat-radio-group[@formcontrolname='preguntaG']//mat-radio-button/label/div)[3]"));
    public static final Target RBTN_PREGUNTAGOPCIONTRES = Target.the("Pérdida hipotéticamente opcion 3").located(By.xpath("(//mat-radio-group[@formcontrolname='preguntaG']//mat-radio-button/label/div)[5]"));
    public static final Target RBTN_PREGUNTAHOPCIONUNO = Target.the("Rentabilidad y riesgo opcion 1").located(By.xpath("//mat-radio-group[@formcontrolname='preguntaH']//mat-radio-button/label/div"));
    public static final Target RBTN_PREGUNTAHOPCIONDOS = Target.the("Rentabilidad y riesgo").located(By.xpath("(//mat-radio-group[@formcontrolname='preguntaH']//mat-radio-button/label/div)[3]"));
    public static final Target RBTN_PREGUNTAHOPCIONTRES = Target.the("Rentabilidad y riesgo opcion 3").located(By.xpath("(//mat-radio-group[@formcontrolname='preguntaH']//mat-radio-button/label/div)[5]"));
}

