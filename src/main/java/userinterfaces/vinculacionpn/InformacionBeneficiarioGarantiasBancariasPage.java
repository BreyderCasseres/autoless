package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionBeneficiarioGarantiasBancariasPage
{
    InformacionBeneficiarioGarantiasBancariasPage() {
        // Do nothing because of X and Y.
    }
    public static final Target LINK_AGREGARBENEFICIARIOGARANTIASBANCARIAS = Target.the("Agregar beneficiario garantias bancarias").located(By.xpath("//a[contains(text(),'+ Agregar')]"));
    public static final Target CBBX_TIPOIDENTIFICACIONBENEFICIARIOGARANTIAS = Target.the("Tipo identificación beneficiario garantias").located(By.cssSelector("div.mat-form-field-flex"));
    public static final Target CHBX_OPCIONTIPOIDENTIFICACIONBENEFICIARIOGARANTIAS = Target.the("Opcion tipo identificacion beneficiario garantias").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'Cédula')]"));
    public static final Target TXT_NUMEROIDENTIFICACIONBENEFICIARIOGARANTIAS = Target.the("Numero identificacion beneficiario garantias").located(By.xpath("//app-identification-number[@formcontrolname='numeroDocumento']//input"));
    public static final Target BTN_BUSCARBENEFICIARIOGARANTIAS = Target.the("Buscar beneficiario garantias").located(By.xpath("//app-identification-number[@formcontrolname='numeroDocumento']//mat-icon"));
    public static final Target LINK_AGREGARDOCUMENTOBENEFICIARIOGARANTIAS = Target.the("Agregar documento beneficiario garantias").located(By.xpath("//span[contains(text(),'+ Agregar documento')]"));
    public static final Target TXT_PRIMERNOMBREBENEFICIARIOGARANTIAS = Target.the("Primer nombre beneficiario garantias").located(By.xpath("//app-text-input[@formcontrolname='primerNombre']//input"));
    public static final Target TXT_SEGUNDONOMBREBENEFICIARIOGARANTIAS = Target.the("Segundo nombre beneficiario garantias").located(By.xpath("//app-text-input[@formcontrolname='segundoNombre']//input"));
    public static final Target TXT_PRIMERAPELLIDOBENEFICIARIOGARANTIAS = Target.the("Primer apellido beneficiario garantias").located(By.xpath("//app-text-input[@formcontrolname='primerApellido']//input"));
    public static final Target TXT_SEGUNDOAPELLIDOBENEFICIARIOGARANTIAS = Target.the("Segundo apellido beneficiario garantias").located(By.xpath("//app-text-input[@formcontrolname='segundoApellido']//input"));
    public static final Target TXT_FECHAEXPEDICIONDOCBENEFICIARIOGARANTIAS = Target.the("Fecha expedicion doc beneficiario garantias").located(By.xpath("//app-date-input[@formcontrolname='fechaExpedicion']//input"));
    public static final Target TXT_FECHAVIGENCIADOCBENEFICIARIOGARANTIAS = Target.the("Fecha vigencia doc beneficiario garantias").located(By.xpath("//app-date-input[@formcontrolname='fechaVigencia']//input"));
    public static final Target TXT_RAZONSOCIALBENEFICIARIOGARANRIAS = Target.the("Razón social beneficiario garantías").located(By.xpath("//app-text-input[@formcontrolname='razonSocial']//input"));
}

