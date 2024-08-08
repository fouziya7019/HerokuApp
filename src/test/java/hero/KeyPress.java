package hero;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Action;
import pom.HomePage;
import pom.Key;

public class KeyPress {
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
		public void KeyPress() throws InterruptedException {
		

	HomePage homepage=new HomePage(driver);
	homepage.clickKeyPresses();
	Key k1=new Key(driver);
	k1.getId().sendKeys("a");
	Thread.sleep(2000);
	k1.getId().sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	k1.getId().sendKeys(Keys.ARROW_UP);
	Thread.sleep(2000);
	k1.getId().sendKeys(Keys.SPACE);
	k1.getResult();
		action.Quit();

	}}

