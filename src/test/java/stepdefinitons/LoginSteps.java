package stepdefinitons;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/login");
        loginPage = new LoginPage(driver);
    }

    @When("I enter valid credentials")
    public void i_enter_valid_credentials() {
        loginPage.enterUsername("testuser@example.com");
        loginPage.enterPassword("testpassword");
        loginPage.clickLogin();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        loginPage.verifyLoginSuccess();
        driver.quit();
    }
}