package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class securefiledownload {
	public securefiledownload(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/a[1]")
	private WebElement file1;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/a[6]")
	private WebElement file2;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/a[16]")
	private WebElement file3;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/a[20]")
	private WebElement file4;

	public void file1() {
		file1.click();
	}
	public void file2() {
		file2.click();
	}
	public void file3() {
		file3.click();
	}
	public void file4() {
		file4.click();
	}
	
	
	
	
	
	
}
