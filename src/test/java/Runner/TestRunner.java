package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/feature/demo.feature"}, glue = {"Steps"}, monochrome = true,
 plugin = {"pretty",
         "html:target/cucumber-reports" ,"html:target/HtmlReports"})


public class TestRunner {
}



