package hero;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Action;
import pom.Forgot;
import pom.HomePage;

public class ForgotPassword {
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
	public void forgotpassword()  {

		HomePage homepage=new HomePage(driver);
		homepage.clickForgotpassword();
		Forgot f2=new Forgot(driver);
		f2.getMailid().click();
		f2.getMailid().sendKeys("syedii7019@gmail.com");
		f2.getRetrivepasword().click();
		action.Quit();
		
	}
}
