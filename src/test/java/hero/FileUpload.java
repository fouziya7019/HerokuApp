package hero;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Action;
import pom.HomePage;

public class FileUpload {
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
			public void FileUpload() {
				

		HomePage homepage=new HomePage(driver);
	  homepage.clickFileUpload();
	   pom.FileUpload f1=new pom.FileUpload(driver);
	f1.getChoosefile().sendKeys("C:\\Users\\FouziyaBanu\\Downloads\\Love (1).JPG");
	  f1.getUpload().click();
	  action.Quit();

	}
	}
	 

