package hero;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Action;
import pom.Check;
import pom.HomePage;

public class Checkbox {
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
	public void exeCheckbox() {


HomePage h4=new HomePage(driver);
h4.clickCheckbox();
Check ch=new Check(driver);
ch.clickonCheckbox1();
ch.clickonCheckbox2();
		action.Quit();
}

}