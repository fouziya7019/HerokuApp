package hero;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Action;
import pom.HomePage;

public class FileDownload {
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
			public void Filedownload() {

		HomePage homepage=new HomePage(driver);
		homepage.clickFileDownload();
		pom.FileDownload f1=new pom.FileDownload(driver);
		 f1.tc();
		 f1.t1();
		 f1.t2();
		 f1.t3();
		 f1.t4();
				action.Quit();
	}}
	 

