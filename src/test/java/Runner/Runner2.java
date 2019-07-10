package Runner;

import org.junit.runner.RunWith;
import cucumber.api.cli.Main;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/resources",
glue = {"Step_defs"},
tags = {"~@Ignore"}, 
plugin = {"pretty","html:target/cucumber-reports/cucumber-pretty",
	"json:target/cucumber-reports/CucumberTestReport.json",
	"rerun:target/cucumber-reports/rerun.txt", "json:target/cucumber-reports/CucumberTestReport.json"
	
  }
	)

public class Runner2 {
	

}
