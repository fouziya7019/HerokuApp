package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUpload {
		
		public FileUpload(WebDriver driver)
		 {
			 PageFactory.initElements(driver, this);
		}
		@FindBy(id = "file-upload")
		private WebElement choosefile;
		@FindBy(id = "file-submit")
		private WebElement upload;
		public WebElement getChoosefile() {
			return choosefile;
		}
		public WebElement getUpload() {
			return upload;
		}
	}
	 
	

