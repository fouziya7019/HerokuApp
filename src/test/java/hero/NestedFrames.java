package hero;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Action;
import pom.HomePage;
import pom.Nested;

public class NestedFrames {
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
	public void NestedFrames() throws InterruptedException {
	

HomePage homePage=new HomePage(driver);
homePage.clickNested();
Nested n1=new Nested(driver);
driver.switchTo().frame(0);

driver.switchTo().frame(0);
String ExpectedOP="LEFT";
String actualOP = n1.getLeft().getText();
Assert.assertEquals(actualOP, ExpectedOP,"Failed to navigate LEFT frame");

driver.switchTo().parentFrame();

driver.switchTo().frame(1);
String ExpectedOP3="MIDDLE";
String actualOP3 = n1.getMiddle().getText();
Assert.assertEquals(actualOP3, ExpectedOP3,"Failed to navigate MIDDLE frame");

driver.switchTo().parentFrame();

driver.switchTo().frame(2);
String ExpectedOP1="RIGHT";
String actualOP1 = n1.getRight().getText();
Assert.assertEquals(actualOP1, ExpectedOP1,"Failed to navigate RIGHT frame");
		action.Quit();


}}

