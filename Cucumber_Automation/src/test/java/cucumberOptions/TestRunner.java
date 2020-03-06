package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


//features = packagename of feature file, glue = packagename of stepdefination file
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue="stepDefinitions")
public class TestRunner {
	
}
