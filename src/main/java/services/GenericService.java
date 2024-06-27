package services;

import com.crowdar.api.rest.MethodsService;

public class GenericService extends MethodsService {
    public static final ThreadLocal<String> X_API_KEY = new ThreadLocal<>();
}
