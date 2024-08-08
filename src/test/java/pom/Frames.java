package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Frames {
	 public Frames(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	  }
	 @FindBy(linkText = "Nested Frames")
		private WebElement Nested;
		
	 @FindBy(linkText = "iFrame")
		private WebElement  iFrame;

	public void nested(){
		Nested.click();

	}
	public void iFrame(){
		iFrame.click();
	}

}
