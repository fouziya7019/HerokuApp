package hero;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Action;
import pom.HomePage;

public class DynamicLoading {
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
		public void  DynamicLoading() {

			HomePage homepage=new HomePage(driver);
			homepage.clickLoading();
			pom.DynamicLoading d2=new pom.DynamicLoading(driver);
			d2.example1();
			d2.StartButton();
			driver.navigate().back();
			d2.example2();
			d2.start2();
			action.Quit();
	}}
	 

