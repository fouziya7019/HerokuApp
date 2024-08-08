package hero;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Action;
import pom.Challeng;
import pom.HomePage;

public class Challenging {
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
	public void exeChalleng() {


HomePage h2=new HomePage(driver);
h2.clickChallenglink();
Challeng c1=new Challeng(driver);
c1.ClickOnQuzbutton();
c1.ClickOnBuzbutton1();
c1.ClickOnBuzbutton2();
		action.Quit();
}
}