package services;

import api.model.Root;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class WorkspaceService extends MethodsService {
    public static Response get(String jsonName) {
        return get(jsonName, Root[].class);
    }
}
