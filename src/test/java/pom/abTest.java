package pom;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	 
	public class abTest {
		public abTest(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(linkText = "A/B Test Variation 1")
		private WebElement ABTestControlText;
	 
		
		public WebElement getABTestControlText() {
			return ABTestControlText;
		}
		
		
	 
	}

