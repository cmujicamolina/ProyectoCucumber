package cucumberPrueba;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Modulos/login/LoginPrueba.feature"},
			glue = "",
		tags = {"@prioridadAlta"}
		
		)
public class CucumberRunner {
	
}
