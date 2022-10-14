package models.setdata.iniciodesesion;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SetIngresarCredencialesData {
    public List<IngresarCredencialesData> setData(DataTable datatable){
        List<IngresarCredencialesData> dates = new ArrayList<>();
        List<Map<String,String>>  mapInfo = datatable.asMaps();
        for(Map<String,String>map : mapInfo){
            dates.add(new ObjectMapper().convertValue(map,IngresarCredencialesData.class));
        }
        return dates;
    }
}
