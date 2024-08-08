package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NOtification {
	public NOtification(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/p[1]/a[1]")
	private WebElement clicknotif;
	
public void clicknotif() {
	clicknotif.click();
}
}
