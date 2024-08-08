package pom;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	 
	public class DragAndDrop {
	 
		public DragAndDrop(WebDriver driver)
			 {
				 PageFactory.initElements(driver, this);
			}
		@FindBy(id = "column-a")
		private WebElement abox;
		@FindBy(id = "column-b")
		private WebElement bbox;
		/**
		 * @return the abox
		 */
		public WebElement getAbox() {
			return abox;
		}
		/**
		 * @return the bbox
		 */
		public WebElement getBbox() {
			return bbox;
		}
		
		@FindBy(xpath = "//header[text()='A']")
		private WebElement HeaderA;
		
		@FindBy(xpath = "//header[text()='B']")
		private WebElement HeaderB;
		
		public WebElement getHeaderA() {
			return HeaderA;
		}
		
		public WebElement getHeaderB() {
			return HeaderB;
		}
		
	}
	 

