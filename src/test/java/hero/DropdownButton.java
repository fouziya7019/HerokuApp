package hero;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Action;
import pom.Dropdown;
import pom.HomePage;

public class DropdownButton {
	private WebDriver driver;
	private Action action;

	@BeforeMethod
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		action = new Action(driver);
		action.implicitwait();
		action.Browsermax();
		action.getUrl("https://the-internet.herokuapp.com/");
	}
	@Test
	public void exedropdown() {

			HomePage homepage=new HomePage(driver);
			homepage.clickDropdown();
			Dropdown	 d5=new Dropdown(driver);
			d5.getDropdownmenu().click();
			Select s=new Select(d5.getDropdownmenu());
			s.selectByVisibleText("Option 1");
			s.selectByVisibleText("Option 2");
		action.Quit();
}

}