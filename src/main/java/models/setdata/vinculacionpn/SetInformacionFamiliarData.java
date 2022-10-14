package models.setdata.vinculacionpn;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SetInformacionFamiliarData {

    public List<InformacionFamiliarData> setData(DataTable datatable){
        List<InformacionFamiliarData> dates = new ArrayList<>();
        List<Map<String,String>>  mapInfo = datatable.asMaps();
        for(Map<String,String>map : mapInfo){
            dates.add(new ObjectMapper().convertValue(map, InformacionFamiliarData.class));
        }
        return dates;
    }
}
