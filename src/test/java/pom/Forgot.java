package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgot {
	public Forgot(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	private WebElement  mailid;
	public WebElement getMailid() {
		return mailid;
	}
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/button[1]/i[1]")
	private WebElement  retrivepasword;
	public WebElement getRetrivepasword() {
		return retrivepasword;
	}

}
