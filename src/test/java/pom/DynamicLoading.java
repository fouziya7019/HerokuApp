package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoading {
		public DynamicLoading(WebDriver driver)
		 {
			 PageFactory.initElements(driver, this);
		}
		@FindBy(css = "a[href='/dynamic_loading/1']")
		private WebElement example1;
		@FindBy(css = "a[href='/dynamic_loading/2']")
		private WebElement example2;
		@FindBy(xpath ="//button[text()='Start']")
		private WebElement start2;
		@FindBy(xpath = "//button[text()='Start']")
		private WebElement StartButton;

public void example1(){
	example1.click();
}
public void example2(){
	example2.click();
}
public void start2(){
	start2.click();
}
public void StartButton(){
	StartButton.click();

}
	}
