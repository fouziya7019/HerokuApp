package hero;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Action;
import pom.HomePage;
import pom.securefiledownload;

public class SecureDownloadFiles {
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
	public void drapanddrop() throws InterruptedException {


		HomePage homePage= new HomePage(driver);
		homePage.clickSecuredownloadlink();
		Thread.sleep(2000);
		driver.get("https://admin:admin@the-internet.herokuapp.com/download_secure");
	securefiledownload s1=new securefiledownload(driver);
	s1.file1();
	s1.file2();
	s1.file3();
	s1.file4();
		action.Quit();

	}
}
