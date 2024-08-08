package hero;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Action;
import pom.HomePage;
import pom.Multiwindow;

public class MultipeWindows {
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
	public void exebroken() throws IOException {

	  	
			HomePage homePage=new HomePage(driver);
homePage.clickWindomultilink();
Multiwindow m1=new Multiwindow(driver);
m1.clickhere();
action.navigateback();
		action.Quit();

}
}