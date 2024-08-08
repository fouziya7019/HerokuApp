package hero;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Action;
import pom.HomePage;
import pom.Horizon;

public class HORIZONTAL {
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
			homepage.clickHorizontal();
			Horizon h1=new Horizon(driver);
			Actions a1=new Actions(driver);
			WebElement horizontalSlider = driver.findElement(By.xpath("//input[@type='range']"));
			a1.clickAndHold(horizontalSlider).perform();
			a1.dragAndDropBy(horizontalSlider, 121, 205).perform();
			a1.release();
			action.Quit();
	}}
	 

