package hero;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Action;
import pom.HomePage;

public class ExitIntent {
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
	public void exeAddnRemove() throws AWTException {

HomePage homepage=new HomePage(driver);
   homepage.clickExitintent();
   Robot robot =new Robot();
   
   
   WebElement e = driver.findElement(By.cssSelector("h3"));
   Actions actionn = new Actions(driver);
   robot.mouseMove(1000,0);
		action.Quit();

	}
}
