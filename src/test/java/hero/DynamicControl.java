package hero;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Action;
import pom.HomePage;

public class DynamicControl {
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
		public void dynamic() throws IOException, InterruptedException {

			HomePage homepage=new HomePage(driver);
			homepage.clickDynamicControls();
			pom.DynamicControl d1=new pom.DynamicControl(driver);
			d1.CheackBox();
			d1.remove();
			d1.add();
			Thread.sleep(2000);
			d1.enable();
			d1.disable();
			action.Quit();
			}
	}
	 

