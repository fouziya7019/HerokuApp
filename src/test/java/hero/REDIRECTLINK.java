package hero;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Action;
import pom.HomePage;
import pom.ReDirect;

public class REDIRECTLINK {
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

	       HomePage homePage=new HomePage(driver);
	       homePage.clickRedirectlink();
	       ReDirect r1=new ReDirect(driver);
	       r1.click1();
	       r1.click2();
           r1.planetext();
	       Thread.sleep(2000);
           action.navigateback();

			action.Quit();













		}
}