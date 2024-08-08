package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Key {
	public Key(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	}
	@FindBy(id = "target")
	private WebElement id;
	public WebElement getId() {
		return id;
	}
	@FindBy(id = "result")
	private WebElement result;
	public WebElement getResult() {
		return result;
	}
}

