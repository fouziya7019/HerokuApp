package hero;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Action;
import pom.Disapperaing;
import pom.HomePage;

public class DisappearingElements {
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
	public void exeChalleng() throws InterruptedException {

HomePage homepage=new HomePage(driver);
homepage.clickDisappearing();
Disapperaing d1=new Disapperaing(driver);
d1.clickHome();
action.navigateback();;
Thread.sleep(1000);
d1.clickAbout();
		action.navigateback();;
Thread.sleep(1000);
d1.clickContactUs();
		action.navigateback();;
Thread.sleep(1000);
d1.clickPortfolio();
		action.navigateback();;
Thread.sleep(1000);

		action.navigateback();;

		action.Quit();


}}
