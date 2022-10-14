package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionFatcaPage
{
    InformacionFatcaPage() {
        // Do nothing because of X and Y.
    }
    public static final Target RBTN_SIESRESIDENTEFISCALENCOLOMBIA = Target.the("SI es residente fiscal en Colombia").located(By.cssSelector("label[class='mat-radio-label']"));
    public static final Target RBTN_NOESRESIDENTEFISCALENCOLOMBIA = Target.the("No es residente fiscal en Colombia").located(By.xpath("(//label[@class='mat-radio-label'])[2]"));
    public static final Target RBTN_SITIENETINRESIDENCIAFISCALCOLOMBIA = Target.the("Si tiene TIN residencia fiscal en Colombia").located(By.cssSelector("mat-radio-group[formcontrolname=\"tinResidenteFiscalCol\"] >mat-radio-button >label"));
    public static final Target RBTN_NOTIENETINRESIDENCIAFISCALCOLOMBIA = Target.the("No tiene TIN residencia fiscal  en Colombia").located(By.cssSelector("mat-radio-group[formcontrolname=\"tinResidenteFiscalCol\"] >mat-radio-button >label > div > input[value=\"NO\"]"));
    public static final Target TXT_TINCOLOMBIA = Target.the("Numero tributario en Colombia").located(By.xpath("//input[@formcontrolname='numeroTributarioCol']"));
    public static final Target RBTN_ELPAISNOEMITETIN = Target.the("El pais donde es residente no emite TIN").located(By.xpath("//mat-radio-group[@formcontrolname='emisionTin']/div/mat-radio-button/label"));
    public static final Target RBTN_NOESTAHABILITADOPARAOBTENERTIN = Target.the("no esta habilitado en dicho país para obtener TIN").located(By.xpath("(//mat-radio-group[@formcontrolname='emisionTin']/div/mat-radio-button/label)[2]"));
    public static final Target TXT_EXPLIQUEPORQUENOHABILITADOPARAOBTENERTIN = Target.the("Explique por que no está habilitado para obtener TIN").located(By.xpath("//textarea[@formcontrolname='noEmiteTin']"));
    public static final Target RBTN_SIESRESIDENTEFISCALPAISESDIFERENTECOLOMBIA = Target.the("Si es residente fiscal en otros paises diferente a Colombia").located(By.cssSelector("mat-radio-group[formcontrolname='residenteFiscalOtros'] >mat-radio-button >label"));
    public static final Target RBTN_NOESRESIDENTEFISCALPAISESDIFERENTECOLOMBIA = Target.the("No es residente fiscal en paises diferente a Colombia").located(By.cssSelector("mat-radio-group[formcontrolname='residenteFiscalOtros'] >mat-radio-button >label >div > input[value=\"NO\"]"));
    public static final Target CBBX_PAISRESIDENTEDIFERENTEACOLOMBIA = Target.the("Pais Residente diferente a Colombia").located(By.cssSelector("div.form-data__section__question-mat__group div.mat-form-field-flex"));
    public static final Target CHBX_OPCIONPAISRESIDENTEDIFERENTEACOLOMBIA = Target.the("Opción Pais Residente diferente a Colombia").located(By.xpath("//span[contains(text(),' ESPAÑA')]"));
    public static final Target RBTN_SITIENETINRESIDENCIAFISCALPAISDIFERENTECOLOMBIA = Target.the("Si tiene TIN residencia fiscal Pais diferente Colombia").located(By.cssSelector("mat-radio-group[formcontrolname=\"tinResidenteFiscalOtros\"]>mat-radio-button>label"));
    public static final Target RBTN_NOTIENETINRESIDENCIAFISCALPAISDIFERENTECOLOMBIA = Target.the("No tiene TIN residencia fiscal Pais diferente a Colombia").located(By.cssSelector("mat-radio-group[formcontrolname=\"tinResidenteFiscalOtros\"]>mat-radio-button>label>div>input[value=\"NO\"]"));
    public static final Target TXT_TINPAISDIFERENTECOLOMBIA = Target.the("TIN pais diferente Colombia").located(By.xpath("//input[@formcontrolname='numeroTributarioOtros']"));
    public static final Target RBTN_PAISDIFERENTECOLOMBIANOEMITETIN = Target.the("Pais diferente a Colombia No emite TIN").located(By.cssSelector("mat-radio-group[formcontrolname=\"emisionTinOtros\"]>div>mat-radio-button>label"));
    public static final Target RBTN_NOESTAHABILITADOENPAISDIFERENTECOLOMBIAPARAOBTENERTIN = Target.the("No esta habilitado en pais diferente Colombia para obtener TIN").located(By.xpath("(//mat-radio-group[@formcontrolname='emisionTinOtros']/div/mat-radio-button/label)[2]"));
    public static final Target RBTN_EXPLIQUEPORQUENOHABILITADOENPAISDIFERENTECOLOMBIAPARAOBTENERTIN = Target.the("Explique por que no habilitado para obtener TIN").located(By.xpath("//textarea[@formcontrolname='noEmiteTinOtros']"));
    public static final Target BTN_AGREGAROTROPAIS = Target.the("Agregar otro pais donde es residente fiscal").located(By.xpath("//span[contains(text(),'+ Agregar otro país')]"));
    public static final Target CBBX_OTROPAISRESIDENTEDIFERENTEACOLOMBIA = Target.the("Otro pais Residente diferente a Colombia").located(By.xpath("(//mat-icon[@role='img'])[2]"));
    public static final Target CHBX_OPCIONOTROPAISRESIDENTEDIFERENTEACOLOMBIA = Target.the("Opción Otro Pais Residente diferente a Colombia").located(By.xpath("//span[contains(text(),' BRASIL ')]"));
    public static final Target RBTN_SITIENETINRESIDENCIAFISCALOTROPAISDIFERENTECOLOMBIA = Target.the("Si tiene TIN residencia fiscal Otro Pais diferente Colombia").located(By.cssSelector("mat-radio-group[formcontrolname=\"otroPaisTinResidenteFiscal\"]>mat-radio-button>label"));
    public static final Target RBTN_NOTIENETINRESIDENCIAFISCALOTROPAISDIFERENTECOLOMBIA = Target.the("No tiene TIN residencia fiscal Otro Pais diferente Colombia").located(By.cssSelector("mat-radio-group[formcontrolname=\"otroPaisTinResidenteFiscal\"]>mat-radio-button>label>div>input[value=\"NO\"]"));
    public static final Target TXT_TINOTROPAISDIFERENTECOLOMBIA = Target.the("TIN Otro pais diferente Colombia").located(By.xpath("//input[@formcontrolname='otroPaisNumeroTributario']"));
    public static final Target RBTN_OTROPAISDIFERENTECOLOMBIANOEMITETIN = Target.the("Otro Pais diferente Colombia No emite TIN").located(By.xpath("//mat-radio-group[@formcontrolname='otroPaisEmisionTin']/div/mat-radio-button/label"));
    public static final Target RBTN_NOESTAHABILITADOENOTROPAISDIFERENTECOLOMBIAPARAOBTENERTIN = Target.the("No esta habilitado en otro pais diferente Colombia para obtener TIN").located(By.cssSelector("mat-radio-group[formcontrolname=\"otroPaisEmisionTin\"] input[value=\"NO ESTOY HABILITADO EN DICHO PAÍS PARA OBTENER UN NÚMERO DE IDENTIFICACIÓN TRIBUTARIA\"]"));
    public static final Target TXT_EXPLIQUEPORQUENOHABILITADOENOTROPAISDIFERENTECOLOMBIAPARAOBTENERTIN = Target.the("Explique por que no habilitado en otro pais diferente Colombia para obtener TIN").located(By.xpath("//textarea[@formcontrolname='otroPaisNoEmiteTin']"));
    public static final Target BTN_REMOVERPAIS = Target.the("Remover pais").located(By.xpath("//span[contains(text(),'- Remover país')]"));
    public static final Target RBTN_SIESCIUDADANOOTIENEPERMISORESIDENCIAENPAISESDIFERENTECOLOMBIA = Target.the("Si es ciudadano o tiene permiso residencia en paises diferente colombia").located(By.cssSelector("mat-radio-group[formcontrolname=\"permisoResidenteFiscalOtros\"] input[value=\"SI\"]"));
    public static final Target RBTN_NOESCIUDADANOOTIENEPERMISORESIDENCIAENPAISESDIFERENTECOLOMBIA = Target.the("No es ciudadano o tiene permiso residencia en paises diferente colombia").located(By.xpath("(//mat-radio-group[@formcontrolname='permisoResidenteFiscalOtros']/mat-radio-button/label/div)[3]"));
    public static final Target CBBX_PAISCIUDADANOOPERMISORESIDENCIAPAISESDIFERENTECOLOMBIA = Target.the("Pais ciudadano o permiso residencia paises diferente Colombia").located(By.xpath("//input[@formcontrolname='permisoPaisResidente']"));
    public static final Target CHBX_OPCIONPAISCIUDADADOOPERMISORESIDENCIA = Target.the("Opción pais ciudadado o permiso residencia paises diferente colombia").located(By.xpath("//span[contains(text(),' ALEMANIA')]"));
    public static final Target CBBX_RELACIONPAISCIUDADANOOPERMISORESIDENCIA = Target.the("Relación pais ciudadano o permiso residencia paises diferente Colombia").located(By.xpath("//input[@formcontrolname='permisoCiudadanoResidente']"));
    public static final Target CHBX_OPCIONRELACIONPAISCIUDADANOOPERMISORESIDENCIA = Target.the("Opcion Relacion pais ciudadano o permiso residencia").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'Ciudadano')]"));
    public static final Target BTN_AGREGAROTROPAISCIUDADANOOPERMISORESIDENCIA = Target.the("Agregar otro pais ciudadano o permiso residencia").located(By.xpath("//span[contains(text(),'+ Agregar otro país')]"));
    public static final Target CBBX_OTROPAISCIUDADANOOPERMISORESIDENCIAPAISESDIFERENTECOLOMBIA = Target.the("Otro Pais ciudadano o permiso residencia paises diferente Colombia").located(By.xpath("//div[@class='mat-form-field-suffix ng-tns-c18-178 ng-star-inserted']//mat-icon"));
    public static final Target CHBX_OPCIONOTROPAISCIUDADADOOPERMISORESIDENCIA = Target.the("Opción Otro pais ciudadado o permiso residencia").located(By.xpath("//span[contains(text(),' ARGENTINA')]"));
    public static final Target CBBX_RELACIONOTROPAISCIUDADANOOPERMISORESIDENCIA = Target.the("Relacion otro pais ciudadano o permiso residencia").located(By.xpath("//div[@class='mat-form-field-suffix ng-tns-c18-179 ng-star-inserted']//mat-icon"));
    public static final Target CHBX_OPCIONRELACIONOTROPAISCIUDADANOOPERMISORESIDENCIA = Target.the("Opción Relacion  otro pais ciudadano o permiso residencia").located(By.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'Residencia')]"));
}

