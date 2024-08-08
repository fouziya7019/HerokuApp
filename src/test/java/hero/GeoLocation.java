package hero;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Action;
import pom.Geolocation;
import pom.HomePage;

public class GeoLocation {
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
	public void exelocation() {

HomePage homepage=new HomePage(driver);
homepage.clickGeolocation();
Geolocation g1=new Geolocation(driver);
g1.whobutton();
		action.Quit();



}}
