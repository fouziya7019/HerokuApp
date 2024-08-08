package hero;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Action;
import pom.HomePage;
import pom.abTest;

import java.time.Duration;
public class ABTesting {
    private WebDriver driver;
    private Action action;

    @BeforeMethod
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        action = new Action(driver);
        action.implicitwait();
        action.Browsermax();
        action.getUrl("https://the-internet.herokuapp.com/");
    }

    @Test
    public void executeabTC() throws InterruptedException
	{

       HomePage hp=new HomePage(driver);
        hp.clickABTestingLink();
        abTest ab=new abTest(driver);
        ab.getABTestControlText();

        action.Quit();
    }


}