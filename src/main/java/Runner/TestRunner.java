package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\champ\\OneDrive\\Desktop\\BddFramework\\src\\main\\java\\features",
				glue ={"stepDefination"})
            




public class TestRunner {

}
