package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaScript {
	public JavaScript(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[@onclick='jsAlert()']")
	private WebElement alert;
	@FindBy(xpath = "//button[@onclick='jsConfirm()']")
	private WebElement confirm;
	@FindBy(xpath = "//button[@onclick='jsPrompt()']")
	private WebElement prompt;
	public void alert(){
		alert.click();
	}
	public void confirm(){
		confirm.click();
	}
	public void prompt(){
		prompt.click();
	}
}
