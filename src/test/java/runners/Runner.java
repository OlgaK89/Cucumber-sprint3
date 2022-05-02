package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        tags = "@dashboard", //will run all scenarios with this tag
        features = "src/test/resources", //path to a folder where feature files are located
        glue = "stepDefs"

      //  ,dryRun = true // step definition execution is skipped, used for generating snippets without running the code
)

public class Runner {
}
