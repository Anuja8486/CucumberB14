package Multiplefile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		monochrome=true,
		dryRun=false,
		features={"src/test/resources/first.feature", "src/test/resources/second.feature"},
		glue={"src/test/java/"}
		
		)


public class RunnerFirstSecond {	

}
