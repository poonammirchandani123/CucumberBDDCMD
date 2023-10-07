package Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.HomePage;

public class DemoSteps {
    private WebDriver driver;
    private HomePage homePage;

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
    }

    @When("I open the URL {string}")
    public void iOpenTheURL(String url) {
        homePage.open(url);
    }

    @Then("I should see the Google logo")
    public void iShouldSeeTheGoogleLogo() {

    }
}



