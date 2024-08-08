package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Check {
public Check(WebDriver driver) {
PageFactory.initElements(driver, this);
}
@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/input[1]")
private WebElement checkbox1;

@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/input[2]")
private WebElement checkbox2;

public void clickonCheckbox1() {
	checkbox1.click();
}
public void clickonCheckbox2() {
	checkbox2.isSelected();
}

}
