package hero;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Action;
import pom.HomePage;
import pom.SortableTable;

public class SORTEDTABLES {
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
	public void exeCheckbox() throws InterruptedException {

HomePage homePage=new HomePage(driver);
homePage.clickSortabletableslink();
SortableTable s1=new SortableTable(driver);
s1.edit();
Thread.sleep(2000);
s1.delet();
action.Quit();








}}
