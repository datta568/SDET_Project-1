package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:/Users/ManoharChebrolu/eclipse-workspace/SDET_Project-1/src/test/resources/SignUp/SingUp.feature"},
							glue = {"Stepdefinition"},
							plugin = {"html:Cucumber-HTML.html", "json:cucumber-JSON.json", "junit:Cucumber-JUnit.junit"})
public class Test_Runner {

}
