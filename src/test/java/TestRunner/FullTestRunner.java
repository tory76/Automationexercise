package TestRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features" ,glue = "StepDefinitions",
        tags = "",
        monochrome = false,
        plugin = {"pretty", "html: Reports/Test_Report.html"}
)

public class FullTestRunner {

}
