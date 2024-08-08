package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shifting {
	public Shifting(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[normalize-space()='Example 1: Menu Element']")
	private WebElement example1;
	@FindBy(xpath = "//a[normalize-space()='Example 2: An image']")
	private WebElement image;
	@FindBy(xpath = "//a[normalize-space()='Example 3: List']")
	private WebElement list;
	@FindBy(linkText = "click here")
	private WebElement firstclick;
	@FindBy(xpath = "//p[contains(text(),'To specify a differant numbor of pixels to shift t')]//a[contains(text(),'click here')]")
	private WebElement secondlink;
	@FindBy(css = "a[href='/shifting_content/menu?mode=random&pixel_shift=100']")
	private WebElement lastlink;
	@FindBy(linkText = "click here")
	private WebElement examplelink1;
	@FindBy(xpath = "//p[4]//a[1]")
	private WebElement examplelink2;
	@FindBy(css = "a[href='/shifting_content/image?mode=random&pixel_shift=100']")
	private WebElement examplelink3;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/p[5]/a[1]")
	private WebElement examplelink4;

	public void example1(){
		example1.click();
	}
	public void image(){
		image.click();
	}
	public void list(){
		list.click();
	}
	public void firstclick(){
		firstclick.click();
	}
	public void secondlink(){
		secondlink.click();
	}
	public void lastlink(){
		lastlink.click();
	}
	public void examplelink1(){
		examplelink1.click();
	}
	public void examplelink2(){
		examplelink2.click();
	}
	public void examplelink3(){
		examplelink3.click();
	}
	public void examplelink4() {
		examplelink4.click();

	}



}
