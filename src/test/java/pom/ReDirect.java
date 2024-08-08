package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReDirect {
	public ReDirect(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/p[1]/a[1]")
	 private WebElement click1;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/p[1]/a[1]")
	 private WebElement click2;
	@FindBy(xpath="/html[1]/body[1]/article[1]/dl[1]/dd[2]/a[3]/img[1]")
	 private WebElement planetext;

	public void click1() {
		click1.click();
	}
	public void click2() {
		click2.click();
	}
	public void planetext() {
		planetext.click();
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
