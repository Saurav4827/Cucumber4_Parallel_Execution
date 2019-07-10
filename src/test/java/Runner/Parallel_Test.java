package Runner;

import cucumber.api.CucumberOptions;

import cucumber.api.cli.Main;
import cucumber.api.junit.Cucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import courgette.api.CourgetteOptions;
import courgette.api.junit.Courgette;
import courgette.api.CourgetteRunLevel;
@RunWith(Courgette.class)
@CourgetteOptions(
		  threads = 3,
	        runLevel = CourgetteRunLevel.SCENARIO,
	        showTestOutput = true,
	        reportTargetDir = "build",
	        cucumberOptions = @CucumberOptions(
	        		features = "src/test/resources/Features",
	        		glue = {"Step_defs"},
	        		tags = {"~@Ignore"}, 
	        		plugin = {"pretty","html:target/cucumber-reports/cucumber-pretty",
	        			"json:target/cucumber-reports/CucumberTestReport.json",
    			       "rerun:target/cucumber-reports/rerun.txt", "json:target/cucumber-reports/CucumberTestReport.json"
	        	
        		    }
        			)
	        )
		

public class Parallel_Test{




}





