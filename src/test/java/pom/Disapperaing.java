package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Disapperaing {
	public Disapperaing(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Home")
	private WebElement home;
	
	@FindBy(linkText = "About")
	private WebElement about;

	@FindBy(linkText = "Contact Us")
	private WebElement contactus;

	@FindBy(linkText = "Portfolio")
	private WebElement portfoliyo;
	

	public void clickHome() {
		home.click();
	}
public void clickAbout() {
		about.click();
}
public void clickContactUs() {
		contactus.click();
}
public void clickPortfolio() {
		portfoliyo.click();
}

}


