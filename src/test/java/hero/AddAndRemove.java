package hero;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Action;
import pom.AddRemoveElement;
import pom.HomePage;

public class AddAndRemove {

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
	public void exeAddnRemove() {

HomePage h2=new HomePage(driver);
h2.clickAddremovelink();
AddRemoveElement a1=new AddRemoveElement(driver);
a1.clickonaddelement();
a1.clickonaddelement();
a1.clickonaddelement();
a1.RemoveElement();
a1.RemoveElement();
a1.RemoveElement();
	}

	@AfterMethod
	public void tearDown() throws Exception {
		if (driver != null) {
			action.Quit();
		}
	}

}
