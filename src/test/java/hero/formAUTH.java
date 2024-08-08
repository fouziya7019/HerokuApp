package hero;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Action;
import pom.FormAuth;
import pom.HomePage;

public class formAUTH {
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
			public void CHECKbox() {

		HomePage homepage=new HomePage(driver);
		homepage.clickForm();
		FormAuth f2=new FormAuth(driver);
		f2.getUser().sendKeys("tomsmith");
		f2.getPwd().sendKeys("SuperSecretPassword!");
		f2.getLogin().click();
				action.Quit();
	}}
	 

