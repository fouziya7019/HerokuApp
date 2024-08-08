package hero;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Basicandauth {

			
			@Test
			public void exeAddnRemove() {
				  WebDriver driver = new ChromeDriver();
		
			        // Implicit wait for elements to be found
			        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
			        // Open the A/B Testing page
			        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
				driver.quit();
	}}
	 
	



