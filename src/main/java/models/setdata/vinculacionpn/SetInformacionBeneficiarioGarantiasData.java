package models.setdata.vinculacionpn;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SetInformacionBeneficiarioGarantiasData {

    public List<InformacionBeneficiarioGarantiasData> setData(DataTable datatable){
        List<InformacionBeneficiarioGarantiasData> dates = new ArrayList<>();
        List<Map<String,String>>  mapInfo = datatable.asMaps();
        for(Map<String,String>map : mapInfo){
            dates.add(new ObjectMapper().convertValue(map,InformacionBeneficiarioGarantiasData.class));
        }
        return dates;
    }
}
