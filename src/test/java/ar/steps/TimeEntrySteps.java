package ar.steps;

import api.config.EntityConfiguration;
import com.crowdar.core.PageSteps;
import cucumber.api.java.en.When;
import io.cucumber.java.en.Given;
import services.GenericService;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class TimeEntrySteps extends PageSteps {
    @Given("^estoy en Clockify con mi key (.*)$")
    public void estoyEnClockifyConMiKey(String key) {
        GenericService.X_API_KEY.set(key);
    }
}
