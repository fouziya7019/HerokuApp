package hero;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Action;
import pom.HomePage;
import pom.Shifting;

public class Shift {
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
		public void disapper() throws InterruptedException {
		

	HomePage homePage=new HomePage(driver);
	homePage.clickShift();
	Shifting s1=new Shifting(driver);
	s1.example1();
	s1.firstclick();
	Thread.sleep(2000);
	s1.secondlink();
	Thread.sleep(2000);
	s1.lastlink();
	action.navigateback();
		action.navigateback();

		action.navigateback();
		action.navigateback();


		s1.image();
	s1.examplelink1();
	s1.examplelink2();
	s1.examplelink3();
	s1.examplelink4();
		action.navigateback();
		action.navigateback();
		action.navigateback();
		action.navigateback();

		s1.list();
		action.Quit();

	}}

