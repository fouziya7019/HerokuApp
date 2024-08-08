package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FloatingMenu {
	
		public FloatingMenu(WebDriver driver)
		 {
			 PageFactory.initElements(driver, this);
		}
		@FindBy(linkText = "Home")
		private WebElement home;
		@FindBy(linkText = "News")
		private WebElement news;
		@FindBy(linkText = "Contact")
		private WebElement contact;
		@FindBy(linkText = "About")
		private WebElement about;
		public void home(){
			home.click();
		}
		public void news(){
			news.click();

		}
		public void contact(){
			contact.click();
		}
		public void about(){
			about.click();
		}
	}
	 
	 

