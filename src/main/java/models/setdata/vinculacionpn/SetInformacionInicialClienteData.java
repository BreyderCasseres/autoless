package models.setdata.vinculacionpn;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import models.setdata.iniciodesesion.IngresarCredencialesData;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SetInformacionInicialClienteData {

    public List<InformacionInicialClienteData> setData(DataTable datatable){
        List<InformacionInicialClienteData> dates = new ArrayList<>();
        List<Map<String,String>>  mapInfo = datatable.asMaps();
        for(Map<String,String>map : mapInfo){
            dates.add(new ObjectMapper().convertValue(map,InformacionInicialClienteData.class));
        }
        return dates;
    }
}
