package hero;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Action;
import pom.HomePage;

public class Frames {
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
    public void exeframes() throws InterruptedException
	{

       HomePage homepage=new HomePage(driver);
       homepage.clickFrames();
       pom.Frames f4=new pom.Frames(driver);
       f4.nested();
       action.navigateback();
       f4.iFrame();
        action.Quit();
}}
