package hero;

import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Action;
import pom.HomePage;

public class InfinitScroll {
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
	public void exeAddnRemove() throws InterruptedException {

HomePage homepage=new HomePage(driver);
homepage.clickInfinitscrolllink();
Thread.sleep(1000);
int i=1;
while(i<=50){
		driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
		i++;
	}
driver.quit();
}

    }

