package pom;



	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	 
	public class FileDownload {
		public FileDownload(WebDriver driver)
		 {
			 PageFactory.initElements(driver, this);
		}
		@FindBy(linkText = "Love.JPG")
		private WebElement tc;
		@FindBy(linkText = "TC005_UploadFile.txt")
		private WebElement tc1;
		@FindBy(linkText= "hello.txt")
		private WebElement tc2;
		@FindBy(linkText = "Baianat.png")
		private WebElement tc3;
		@FindBy(linkText = "tc005File.txt")
		private WebElement tc4;
		 public void tc(){

			 tc.click();
		}
		public void t1(){
			 tc1.click();

		}
		public void t2(){
			 tc2.click();
		}
		public void t3(){
			 tc3.click();

		}
		public void t4(){
			 tc4.click();
		}
	}
	 
	 

