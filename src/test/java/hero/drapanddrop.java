package hero;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Action;
import pom.DragAndDrop;
import pom.HomePage;

public class drapanddrop {
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
	public void drapanddrop()  {

		HomePage homepage=new HomePage(driver);
	 homepage.clickDraganddrop();
	 DragAndDrop d1=new DragAndDrop(driver);
	 WebElement src = d1.getAbox();
     WebElement des = d1.getBbox();
		Actions act=new Actions(driver);
		act.dragAndDrop(src, des);
		action.Quit();
   }}
