package hero;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Action;
import pom.HomePage;
import pom.JavaScript;

public class javascrip {
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
		public void javascript() throws InterruptedException {

	
	HomePage homepage=new HomePage(driver);
	homepage.clickJavascript();
	JavaScript j1=new JavaScript(driver);
	j1.alert();
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	j1.confirm();
	driver.switchTo().alert().dismiss();
	Thread.sleep(2000);
	j1.prompt();
	Alert a = driver.switchTo().alert();
	a.sendKeys("I want Hike");
	a.accept();
		action.Quit();

	}}

