package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Challeng {
	private WebDriver driver;
	private Actions actions;

	public Challeng(WebDriver driver) {
		this.driver = driver;
		this.actions = new Actions(driver);
		 PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
	 private WebElement quzbutton;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[2]")
	 private WebElement buzbutton1;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[3]")
	 private WebElement buzbutton2;

	public void ClickOnQuzbutton() {
		actions.click(quzbutton);
	}
	public void ClickOnBuzbutton1() {
		actions.click(buzbutton1);
	}
   public void ClickOnBuzbutton2() {
		actions.click(buzbutton2);
   }
}