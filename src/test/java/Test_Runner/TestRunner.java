package Test_Runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(value = Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "stepdefinitions",
        plugin = {"pretty", "html:target/cucumber-report.html"},
        monochrome = true
)
public class TestRunner {
}
