package services;

import api.model.EditTimer;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;
import java.util.HashMap;
import java.util.Map;

public class DeleteEntryService extends GenericService{
    public static Response delete(String jsonName) {
        return delete(jsonName, EditTimer.class, setParams());
    }
    public static Map<String, String> setParams(){
        Map<String, String> params = new HashMap<String, String>();
        params.put("api.key", X_API_KEY.get());
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("time.id", ENTRY_ID.get());
        return params;
    }
}
