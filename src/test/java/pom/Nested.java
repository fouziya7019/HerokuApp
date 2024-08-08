package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nested {
	public Nested(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//body[contains(text(),'LEFT')]")
	private WebElement left;
	@FindBy(xpath = "//body[contains(text(),'RIGHT')]")
	private WebElement right;
	@FindBy(id ="content")
	private WebElement middle;
	public WebElement getLeft() {
		return left;
	}
	public WebElement getRight() {
		return right;
	}
	public WebElement getMiddle() {
		return middle;
	}
}

