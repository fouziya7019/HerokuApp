package hero;

import java.time.Duration;  

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Action;
import pom.Context;
import pom.HomePage;

public class Contextbox {
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


			HomePage h2=new HomePage(driver);
			h2.clickContectlink();
			Context c4=new Context(driver);
			Actions act=new Actions(driver);
			act.contextClick(c4.getContextbox()).perform();
			driver.switchTo().alert().accept();
		action.Quit();
	        }
		
		 
}
