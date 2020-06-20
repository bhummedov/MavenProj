package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //Instructs junit to run this class as a Cucumber test runner
@CucumberOptions(
        dryRun = false,//execute the features
        features = "src\\test\\features",
        glue = {"stepDefs"},
        tags = "@regression",
        plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json"}
)
public class RunnerTest{

}
