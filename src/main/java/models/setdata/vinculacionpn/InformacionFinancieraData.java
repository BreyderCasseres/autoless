package models.setdata.vinculacionpn;

import lombok.Data;

@Data
public class InformacionFinancieraData {

    private String ingresoMensual;
    private String otrosIngresos;
    private String detalleOtrosIngresos;
    private String egresoMensual;
    private String activo;
    private String pasivo;
    private String ingresoMensualOrdenante;
    private String otrosIngresosOrdenante;
    private String detalleOtrosIngresosOrdenante;
    private String egresoMensualOrdenante;
    private String activoOrdenante;
    private String pasivoOrdenante;

}
