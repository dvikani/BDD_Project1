package runner_1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="classpath:feature", 
		glue ="steps_1",
		tags ="@Bank&Chash",
		
		monochrome=true,
		dryRun=false,
		plugin= {
				"pretty",
				"html:target/cucumber",
				"json:target/cucumber.json"
				
		}
		)

public class LoginRunner_1 {
	
}
