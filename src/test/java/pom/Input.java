package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Input {
		public Input(WebDriver driver)
		 {
			 PageFactory.initElements(driver, this);
		}
	@FindBy(xpath = "//input[@type='number']")
	private WebElement number;
	public WebElement getNumber() {
		return number;
	}
	}
	 

