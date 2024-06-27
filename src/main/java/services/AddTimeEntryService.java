package services;

import api.model.AddEntry;
import com.crowdar.api.rest.APIManager;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;
import java.util.HashMap;
import java.util.Map;

public class AddTimeEntryService extends GenericService{
    public static Response post(String jsonName) {
        return post(jsonName, AddEntry.class, setParams());
    }
    public static Map<String, String> setParams(){
        Map<String, String> params = new HashMap<String, String>();
        params.put("api.key", X_API_KEY.get());
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        return params;
    }
    public static String getTimeId() {
        AddEntry lastResponse = (AddEntry) APIManager.getLastResponse().getResponse();
        return lastResponse.id;
    }
}
