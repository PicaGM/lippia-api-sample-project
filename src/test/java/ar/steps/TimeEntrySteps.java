package ar.steps;

import api.config.EntityConfiguration;
import com.crowdar.core.PageSteps;
import com.google.api.client.repackaged.com.google.common.base.Splitter;
import cucumber.api.java.en.When;
import io.cucumber.java.en.Given;
import org.apache.commons.lang.StringUtils;
import services.GenericService;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class TimeEntrySteps extends PageSteps {

    @When("^llevo a cabo un '(.*)' a '(.*)' endpoint con el '(.*)' y '(.*)'$")
    public void doRequest(String methodName, String entity, String jsonName, String jsonReplacementValues) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        Class entityService = EntityConfiguration.valueOf(entity).getEntityService();
        Map<String, String> parameters = getParameters(jsonReplacementValues);
        String jsonPath = "request/".concat(jsonName);
        if (parameters == null) {
            entityService.getMethod(methodName.toLowerCase(), String.class).invoke("", jsonPath);
        } else {
            entityService.getMethod(methodName.toLowerCase(), String.class, Map.class).invoke("", jsonPath, parameters);
        }
    }

    private Map<String, String> getParameters(String jsonReplacementValues) {
        Map<String, String> parameters = null;
        if (!StringUtils.isEmpty(jsonReplacementValues)) {
            parameters = Splitter.on(",").withKeyValueSeparator(":").split(jsonReplacementValues);
        }
        return parameters;
    }

    @Given("^estoy en Clockify con mi key (.*)$")
    public void estoyEnClockifyConMiKey(String key) {
        GenericService.X_API_KEY.set(key);
    }
}
