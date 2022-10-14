package models.setdata.vinculacionpn;

import lombok.Data;

@Data
public class InformacionDivisasData {

    private String cuentaBancariaNumero;
    private String beneficiarioOTitular;
    private String nombreDelBeneficiarioDeLaCuenta;
    private String numeroDeCuentaDelBeneficiario;
    private String bancoBeneficiario;
    private String codigoSwiftOAba;
    private String bancoIntermediario;
    private String segundoCodigoSwiftOAba;
    private String segundoNumeroDeCuentaDelBeneficiario;
}
