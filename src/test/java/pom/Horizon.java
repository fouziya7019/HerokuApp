package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Horizon {
	
		public Horizon(WebDriver driver)
		 {
			 PageFactory.initElements(driver, this);
		}
		@FindBy(id = "range")
		private WebElement slide;
		public WebElement getSlide() {
			return slide;
		}
		
	}
	 

