package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControl {

	public DynamicControl(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "button[onclick='swapCheckbox()']")
	private WebElement remove;
	@FindBy(css = "button[onclick='swapCheckbox()']")
	private WebElement add;
	@FindBy(css = "button[onclick='swapInput()']")
	private WebElement enable;
	@FindBy(css = "button[onclick='swapInput()']")
	private WebElement disable;
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement CheackBox;
 public void remove(){

	 remove.click();
 }
 public void add(){

	 add.click();
 }
 public void enable(){

	 enable.click();
 }
 public void disable(){

	 disable.click();

 }
 public void CheackBox(){

	 CheackBox.click();
 }
}
	 

