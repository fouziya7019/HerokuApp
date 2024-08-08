package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormAuth {
	
		public FormAuth(WebDriver driver)
		 {
			 PageFactory.initElements(driver, this);
		}
		@FindBy(id = "username")
		private WebElement user;
		@FindBy(id = "password")
		private WebElement pwd;
		@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/button[1]/i[1]")
		private WebElement login;
		public WebElement getLogin() {
			return login;
		}
		public WebElement getUser() {
			return user;
		}
		public WebElement getPwd() {
			return pwd;
		}
	}
	 

