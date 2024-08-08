package hero;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Action;
import pom.FloatingMenu;
import pom.HomePage;

public class Floatingmenu {
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
	public void Float() throws InterruptedException{


		HomePage homepage=new HomePage(driver);
		homepage.clickFloatingMenu();
		FloatingMenu f2=new FloatingMenu(driver);
		f2.home();
		Thread.sleep(2000);
		f2.news();
		Thread.sleep(2000);
		f2.contact();
		Thread.sleep(2000);
		f2.about();
		action.Quit();
}}

