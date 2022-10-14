package models.setdata.iniciodesesion;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SetAbrirAplicativoData {
    public List<AbrirAplicativoData> setData(DataTable datatable){
        List<AbrirAplicativoData> dates = new ArrayList<>();
        List<Map<String,String>>  mapInfo = datatable.asMaps();
        for(Map<String,String>map : mapInfo){
            dates.add(new ObjectMapper().convertValue(map,AbrirAplicativoData.class));
        }
        return dates;
    }
}
