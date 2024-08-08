package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Action {
private WebDriver driver;
public Action(WebDriver driver) {
    this.driver = driver;
}
public void click(WebElement element) {
    element.click();
}
public void Sendkeys(WebElement element , String text) {
    element.sendKeys(text);
}
public void implicitwait(){
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
    public void Browsermax(){
    driver.manage().window().maximize();
    }
    public void Browsermini(){
    driver.manage().window().maximize();
}
    public void Quit(){
    driver.quit();
    }
public void  getUrl(String url){
    driver.get(url);
}
public void navigateback(){
    driver.navigate().back();
}
public void navigateforward(){
    driver.navigate().forward();
}
   public void isSelected(WebElement element){
    element.isSelected();
}
public void Refresh(){
    driver.navigate().refresh();
}
}
