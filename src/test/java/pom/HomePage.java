package pom;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	 
	public class HomePage {
		private WebDriver driver;
		private Action action;

		public HomePage(WebDriver driver) {
			this.driver = driver;
			this.action=new Action(driver);
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(linkText = "A/B Testing")
		private WebElement ABTestingLink;
	    public void clickABTestingLink() {
			action.click(ABTestingLink);
		}


		@FindBy(linkText = "Add/Remove Elements")
		private WebElement  addremovelink;
		public void clickAddremovelink() {
			action.click(addremovelink);
		}

		@FindBy(linkText = "Basic Auth")
		private WebElement authenticlink;
			public void clickAuthenticlink() {
				action.click(authenticlink);}


		@FindBy(linkText = "Broken Images")
		private WebElement brokenpagelink;
		public void clickBrokenpagelink() {
			action.click(brokenpagelink);}


		@FindBy(linkText = "Challenging DOM")
		private WebElement challenglink;
		public void clickChallenglink() {
			action.click(challenglink);}


		@FindBy(linkText = "Checkboxes")
		private WebElement checkbox;
		public void clickCheckbox() {
			action.click(checkbox);
		}


		@FindBy(linkText = "Context Menu")
		private WebElement contectlink;
		public void clickContectlink() {
			action.click(contectlink);
		}



		@FindBy(linkText = "Digest Authentication")
		private WebElement digestlink;
		public void clickDigestlink() {
			action.click(digestlink);
		}


		@FindBy(linkText = "Disappearing Elements")
		private WebElement disappearing;
		public void clickDisappearing() {
			action.click(disappearing);
		}


		@FindBy(linkText = "Dropdown")
		private WebElement dropdown;
		public void clickDropdown() {
			action.click(dropdown);
		}


		@FindBy(linkText = "Drag and Drop")
		private WebElement draganddrop;
		public void clickDraganddrop() {
			action.click(draganddrop);
		}
		 

		
		@FindBy(linkText = "Dynamic Content")
		private WebElement dynamic;
		public void clickDynamic() {
			action.click(dynamic);
		}
		 
		 

		@FindBy(linkText = "Dynamic Controls")
		private WebElement dynamiccontrols;
		public void clickDynamicControls() {
			action.click(dynamiccontrols);
		}
		 

		@FindBy(linkText = "Dynamic Loading")
		private WebElement loading;
		public void clickLoading() {
			action.click(loading);
		}
		 

		@FindBy(linkText = "Exit Intent")
		private WebElement exitintent;
		public void clickExitintent() {
			action.click(exitintent);
		}


				@FindBy(linkText = "File Upload")
		private WebElement FileUpp;
		public void clickFileUpload() {
			action.click(FileUpp);
		}
		 

		@FindBy(linkText = "File Download")
		private WebElement file;
		public void clickFileDownload() {
			action.click(file);

		}
		 

		@FindBy(linkText = "Forgot Password")
		private WebElement forgotpassword;
		public void clickForgotpassword() {
			action.click(forgotpassword);
		}


		@FindBy(linkText = "Floating Menu")
		private WebElement floating;
		public void clickFloatingMenu() {
			action.click(floating);
		}
		 

		@FindBy(linkText = "Frames")
		private WebElement frames;
		public void clickFrames() {
			action.click(frames);
		}


		@FindBy(linkText = "Geolocation")
		private WebElement geolocation;
		public void clickGeolocation() {
			action.click(geolocation);
		}


		@FindBy(linkText = "Hovers")
		private WebElement hoverslink;
		public void clickHoverslink() {
			action.click(hoverslink);
		}


		@FindBy(linkText = "Horizontal Slider")
		private WebElement horizontal;
		public void clickHorizontal() {
			action.click(horizontal);
		}
		 

		@FindBy(linkText = "Form Authentication")
		private WebElement form;
		public void clickForm() {
			action.click(form);
		}
		 

		@FindBy(linkText = "Infinite Scroll")
		private WebElement infinitscrolllink;
		public void clickInfinitscrolllink() {
			action.click(infinitscrolllink);
		}


		@FindBy(linkText = "JQuery UI Menus")
		private WebElement jqueryUImenulink;
		public void clickJQueryUIMenulink() {

			action.click(jqueryUImenulink);
		}


		@FindBy(linkText = "Multiple Windows")
		private WebElement windomultilink;
		public void clickWindomultilink() {
			action.click(windomultilink);
		}


		
		@FindBy(linkText = "Notification Messages")
		private WebElement notificationmessagelink;
		public void clickNotificationmessagelink() {
			action.click(notificationmessagelink);
		}


		@FindBy(linkText = "Redirect Link")
		private WebElement redirectlink;
		public void clickRedirectlink() {
			action.click(redirectlink);
		}


		@FindBy(linkText = "Secure File Download")
		private WebElement securedownloadlink;
		public void clickSecuredownloadlink() {
			action.click(securedownloadlink);
		}


		@FindBy(linkText = "Shadow DOM")
		private WebElement ShadowDOMlink;
		public void clickShadowDOMlink() {
			action.click(ShadowDOMlink);
		}

				


		@FindBy(linkText = "Slow Resources")
		private WebElement Slowresourcelink;
		public void clickSlowresourcelink() {
			action.click(Slowresourcelink);
		}


		@FindBy(linkText = "Sortable Data Tables")
		private WebElement Sortabletableslink;
		public void clickSortabletableslink() {
			action.click(Sortabletableslink);
		}


		
		@FindBy(linkText = "Hovers")
		private WebElement hovers;
		public void clickHovers() {
			action.click(hovers);
		}
		 

		@FindBy(linkText = "Inputs")
		private WebElement input;
		public void clickInput() {
			action.click(input);
		}
		 

		@FindBy(linkText = "JavaScript Alerts")
		private WebElement javascript;
		public void clickJavascript() {
			action.click(javascript);
		}
		 

		@FindBy(linkText = "JavaScript onload event error")
		private WebElement onload;
		public void clickOnload() {
			action.click(onload);
		}
		 

		@FindBy(linkText = "Key Presses")
		private WebElement key;
		public void clickKeyPresses() {
			action.click(key);
		}
		 

		@FindBy(linkText = "Large & Deep DOM")
		private WebElement large;
		public void clickLarge() {
			action.click(large);
		}
		 

		@FindBy(linkText = "Nested Frames")
		private WebElement nested;
		public void clickNested() {
			action.click(nested);
		}
		 

		@FindBy(linkText = "Shifting Content")
		private WebElement shift;
		public void clickShift() {
			action.click(shift);
		}
		 

	}


	

		
		
		
		
		
		
		
		
		
		

		
	

