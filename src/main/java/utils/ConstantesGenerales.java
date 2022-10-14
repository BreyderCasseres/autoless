package utils;


import java.lang.reflect.Array;

public class ConstantesGenerales {
    public static int CANTIDADCONTRATOS = 0;
    public static String DOCUMENTOS[] = new String[24];

    public static String[] getDOCUMENTOS() {
        return DOCUMENTOS;
    }

    public static void setDOCUMENTOS(String[] DOCUMENTOS) {
        ConstantesGenerales.DOCUMENTOS = DOCUMENTOS;
    }

    public static int getCANTIDADCONTRATOS() {
        return CANTIDADCONTRATOS;
    }

    public static void setCANTIDADCONTRATOS(int CANTIDADCONTRATOS) {
        ConstantesGenerales.CANTIDADCONTRATOS = CANTIDADCONTRATOS;
    }
}
