package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SortableTable {
	public SortableTable(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/a[1]")
	 private WebElement edit;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/a[2]")
	 private WebElement delet;
	public void edit() {
		edit.click();
	}
	public void delet() {
		delet.click();
	}
}
