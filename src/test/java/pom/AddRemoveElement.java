package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRemoveElement {
    private WebDriver driver;
    private Action action;

  public AddRemoveElement(WebDriver driver) {
	 this.driver = driver;
     this.action= new Action(driver);
      PageFactory.initElements(driver, this);
  }
 
 @FindBy(xpath = "//button['Add Element']")
 private WebElement addElement;

  public void clickonaddelement() {
      action.click(addElement);
  }
 
 @FindBy(id = "elements")
 private WebElement delete;

  public void RemoveElement(){
      action.click(delete);
  }


 
}
