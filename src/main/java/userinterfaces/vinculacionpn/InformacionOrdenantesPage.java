package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionOrdenantesPage
{
    InformacionOrdenantesPage() {
        // Do nothing because of X and Y.
    }
    public static final Target LINK_AGREGARORDENANTE = Target.the("Agregar ordenante").located(By.xpath("//a[contains(text(),'+ Agregar ordenante')]"));
    public static final Target CBBX_TIPOIDENTIFICACIONORDENANTE = Target.the("Tipo identificación ordenante").located(By.xpath("//mat-select[@formcontrolname='tipoDocumento']//parent::div//parent::div"));
    public static final Target CHBX_OPCIONTIPOIDENTIFICACIONORDENANTE = Target.the("Opcion tipo identificacion ordenante").located(By.xpath("//span[contains(text(),'Cédula')]"));
    public static final Target TXT_NUMEROIDENTIFICACIONORDENANTE = Target.the("Numero identificación ordenante").located(By.xpath("//input[@formcontrolname='numeroDocumento']"));
    public static final Target BTN_CONSULTARDOCUMENTOORDENANTE = Target.the("Consultar documento ordenante").located(By.xpath("//button[contains(text(),'Consultar documento')]"));
    public static final Target LINK_AGREGARDOCUMENTOORDENANTE = Target.the("Agregar documento ordenante").located(By.xpath("//span[contains(text(),'+ Agregar documento')]"));
    public static final Target RBTN_SIESPARTERELACIONADOCONELCLIENTE = Target.the("Si es parte relacionado con el cliente").located(By.xpath("//mat-radio-group[@formcontrolname='esParteDelCliente']//label"));
    public static final Target RBTN_NOESPARTERELACIONADOCONELCLIENTE = Target.the("No es parte relacionado con el cliente").located(By.xpath("(//mat-radio-group[@formcontrolname='esParteDelCliente']//label)[3]"));
    public static final Target CBBX_RELACIONCONELCLIENTE = Target.the("Relación con el cliente").located(By.xpath("//mat-select[@formcontrolname='relacionCliente']"));
    public static final Target CHBX_OPCIONRELACIONCONELCLIENTE = Target.the("Opción relación con el cliente").located(By.xpath("//span[contains(text(),'Otro')]"));
    public static final Target TXT_PRIMERNOMBREORDENANTE = Target.the("Primer nombre ordenante").located(By.xpath("//input[@formcontrolname='primerNombre']"));
    public static final Target TXT_SEGUNDONOMBREORDENANTE = Target.the("Segundo nombre ordenante").located(By.xpath("//input[@formcontrolname='segundoNombre']"));
    public static final Target TXT_PRIMERAPELLIDOORDENANTE = Target.the("Primer apellido ordenante").located(By.xpath("//input[@formcontrolname='primerApellido']"));
    public static final Target TXT_SEGUNDOAPELLIDOORDENANTE = Target.the("Segundo apellido ordenante").located(By.xpath("//input[@formcontrolname='segundoApellido']"));
    public static final Target CBBX_PAISEXPEDICIONDOCORDENANTE = Target.the("Pais expedicion doc ordenante").located(By.xpath("//input[@formcontrolname='paisExpedicion']"));
    public static final Target CHBX_OPCIONPAIS = Target.the("Opcion pais").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'COLOMBIA')]"));
    public static final Target CBBX_DEPARTAMENTOEXPEDICIONDOCORDENANTE = Target.the("Departamento expedicion doc ordenante").located(By.xpath("//input[@formcontrolname='departamentoExpedicion']"));
    public static final Target CHBX_OPCIONDEPARTAMENTO = Target.the("Opción departamento").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'ATLANTICO')]"));
    public static final Target CBBX_CIUDADEXPEDICIONDOCORDENANTE = Target.the("Ciudad expedicion doc ordenante").located(By.xpath("//input[@formcontrolname='ciudadExpedicion']"));
    public static final Target CHBX_OPCIONCIUDAD = Target.the("Opcion ciudad").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'BARRANQUILLA')]"));
    public static final Target TXT_FECHAEXPEDICIONDOCORDENANTE = Target.the("Fecha expedicion doc ordenante").located(By.xpath("//input[@formcontrolname='fechaExpedicion']"));
    public static final Target TXT_FECHAVIGENCIADOCORDENANTE = Target.the("Fecha vigencia doc ordenante").located(By.xpath("//input[@formcontrolname='fechaVigencia']"));
    public static final Target TXT_FECHANACIMIENTOORDENANTE = Target.the("Fecha nacimiento ordenante").located(By.xpath("//input[@formcontrolname='fechaNacimiento']"));
    public static final Target CBBX_PAISNACIMIENTOORDENANTE = Target.the("Pais nacimiento ordenante").located(By.xpath("//input[@formcontrolname='paisNacimiento']"));
    public static final Target CBBX_DEPARTAMENTONACIMIENTOORDENANTE = Target.the("Departamento nacimiento ordenante").located(By.xpath("//input[@formcontrolname='departamentoNacimiento']"));
    public static final Target CBBX_CIUDADNACIMIENTOORDENANTE = Target.the("Ciudad nacimiento ordenante").located(By.xpath("//input[@formcontrolname='ciudadNacimiento']"));
    public static final Target CBBX_PAISRESIDENCIAORDENANTE = Target.the("Pais residencia ordenante").located(By.xpath("//input[@formcontrolname='paisResidencia']"));
    public static final Target CBBX_DEPARTAMENTORESIDENCIAORDENANTE = Target.the("Departamento residencia ordenante").located(By.xpath("//input[@formcontrolname='departamentoResidencia']"));
    public static final Target CBBX_CIUDADRESIDENCIAORDENANTE = Target.the("Ciudad residencia ordenante").located(By.xpath("//input[@formcontrolname='ciudadResidencia']"));
    public static final Target TXT_DIRECCIONRESIDENCIAORDENANTE = Target.the("Direccion residencia ordenante").located(By.xpath("//input[@formcontrolname='direccionResidencia']"));
    public static final Target TXT_INDICATIVOTELEFONOORDENANTE = Target.the("Indicativo telefono ordenante").located(By.xpath("//div[@class='full-telephone']//input"));
    public static final Target TXT_TELEFONOORDENANTE = Target.the("Telefono ordenante").located(By.xpath("(//div[@class='full-telephone']//input)[2]"));
    public static final Target CBBX_INDICATIVOCELULARORDENANTE = Target.the("Indicativo celular ordenante").located(By.xpath("//div[@class='full-cellphone']//input"));
    public static final Target CHBX_OPCIONINDICATIVOCELULARORDENANTE = Target.the("Opcion indicativo celular ordenante").located(By.xpath("//div[@class='cdk-overlay-pane mat-autocomplete-panel-above']//span[contains(text(),'Colombia')]"));
    public static final Target TXT_CELULARORDENANTE = Target.the("Celular ordenante").located(By.xpath("(//div[@class='full-cellphone']//input)[2]"));
    public static final Target TXT_CORREOORDENANTE = Target.the("Correo ordenante").located(By.xpath("//input[@formcontrolname='correo']"));
    public static final Target CHBX_USARCORREOPARARECIBIRINFORMACIONDELCLIENTE = Target.the("Usar correo para recibir informacion del cliente").located(By.xpath("//mat-checkbox[@formcontrolname='usarCorreoParaCliente']//div"));
    public static final Target CHBX_YACUENTACONVALIDACIONBIOMETRICA = Target.the("Ya cuenta con validacion biometrica").located(By.xpath("//mat-checkbox[@formcontrolname='validacionIdentidad']//div"));
    public static final Target CBBX_OCUPACIONORDENANTE = Target.the("Ocupacion ordenante").located(By.xpath("//input[@formcontrolname='ocupacion']"));
    public static final Target CHBX_OPCIONOCUPACIONORDENANTE = Target.the("Opción ocupación ordenante").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'Otra')]"));
    public static final Target TXT_OTRAOCUPACIONORDENANTE = Target.the("Otra ocupacion ordenante").located(By.xpath("//input[@formcontrolname='otraOcupacion']"));
    public static final Target CBBX_CODIGOCIIUORDENANTE = Target.the("Código ciiu ordenante").located(By.xpath("//input[@formcontrolname='codigoCIIU']"));
    public static final Target CHBX_OPCIONCODIGOCIIUORDENANTE = Target.the("Opcion codigo ciiu ordenante").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'0090 - RENTISTAS DE CAPITAL, SOLO PARA PERSONAS NATURALES')]"));
}

