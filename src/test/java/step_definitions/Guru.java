package step_definitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Era on 19/01/2019.
 */
public class Guru {

    private WebDriver driver;

    public Guru() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("^I am on the Login page$")
    public void iAmOnTheLoginPage() throws Throwable {
        driver.navigate().to("http://demo.guru99.com/Security/SEC_V1/index.php");
    }

    @When("I fill in username with {string} and password with {string}")
    public void iFillInUsernameWithUserAndPasswordWithPass(String string, String string2) throws Exception {
////        XPATH
//        driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(string);
//        driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(string);
//        driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(string);

        driver.findElement(By.name("uid")).sendKeys(string);
        driver.findElement(By.name("password")).sendKeys(string2);
        driver.findElement(By.name("btnLogin")).click();


        //// if true = mag ffail tong @When
        //// tas skip @Then
        ////        else proceed sa @Then
        boolean isAlert = isAlertPresents();
        System.out.println(isAlert);
        assertNotEquals(true,isAlert);
    }

    @Then("^I should see the HomePage$")
    public void iShouldSeeTheHomePage() throws Throwable {
        //al baguhin mo dito
        driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
    }

    public boolean isAlertPresents() {
        try {
            driver.switchTo().alert();
            return true;
        }// try
        catch (Exception e) {
            return false;
        }// catch
    }
}
