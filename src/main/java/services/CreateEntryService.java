package services;

import api.model.Timer;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

import static services.GenericService.X_API_KEY;

public class CreateEntryService {
    public static Response post(String jsonName) {
        return post(jsonName, Timer[].class, setParams());
    }
    public static Map<String, String> setParams(){
        Map<String, String> params = new HashMap<String, String>();
        params.put("api.key", X_API_KEY.get());
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        return params;
    }
}
