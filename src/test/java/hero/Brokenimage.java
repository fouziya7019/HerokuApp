package hero;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Action;
import pom.HomePage;

public class Brokenimage {
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
//	  WebDriver driver = new ChromeDriver();
//      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//      driver.get("https://the-internet.herokuapp.com/");
//
		HomePage h2=new HomePage(driver);
	 h2.clickBrokenpagelink();
	 TakesScreenshot t=(TakesScreenshot)driver;
	 File src=t.getScreenshotAs(OutputType.FILE);
	 File dest=new File("./ScreenShort/BrokenImage.jpg");
	FileHandler.copy(src, dest);
	Reporter.log("Screenshot Captured",true);

	action.Quit();
}
}
