package _ActiTimeMain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLoginPage {
	
	//Partially Initialization
		@FindBy(xpath="//input[@id='username']")
		private WebElement Username;
		
		@FindBy(xpath="//input[@class='textField pwdfield']")
		private WebElement Password;
		
		@FindBy(xpath="//a[@id='loginButton']")
		private WebElement LoginButton;
		
		//Complete Initialization
		public ActiTimeLoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//Usage
		public void setActiTimeLoginPageUsername() {
			Username.sendKeys("admin");
		}
		
		public void setActiTimeLoginPagePassword() {
			Password.sendKeys("manager");
		}
		
		public void clickActiTimeLoginButton() {
			LoginButton.click();
		}

}
