package _ActiTimeMain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeUsersMenu {
	
	@FindBy(xpath="//td[@class='navItem relative'][4]")
	private WebElement Users;
	
	@FindBy(xpath="//div[@id=\"ext-gen6\"]")
	private WebElement UserButton;
	
	@FindBy(xpath="//input[@class='firstNameField inputFieldWithPlaceholder']")
	private WebElement Firstname;
	
	@FindBy(xpath="//input[@class='lastNameField inputFieldWithPlaceholder']")
	private WebElement Lastname;
	
	@FindBy(xpath="//input[@class='emailField inputFieldWithPlaceholder']")
	private WebElement EmailId;
	
	@FindBy(xpath="//input[@class='usernameField inputFieldWithPlaceholder']")
	private WebElement Username;
	
	@FindBy(xpath="//input[@class='passwordField inputFieldWithPlaceholder']")
	private WebElement Password;

	@FindBy(xpath="//input[@class='passwordCopyField inputFieldWithPlaceholder']")
	private WebElement RetypePassword;
	
	@FindBy(xpath="//div[@id='userDataLightBox_commitBtn']")
	private WebElement CreateUser;
	
	
	
	public ActiTimeUsersMenu(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void homePageUsersMenu() {
		Users.click();
	}
	
	public void userButtonOnUsersMenu() {
		UserButton.click();
	}
	
	public void userFirstname() {
		Firstname.sendKeys("Sudhir");
	}
	
	public void userLastname() {
		Lastname.sendKeys("Lakhapati");
	}
	
	public void userEmailID() {
		EmailId.sendKeys("slakhapati@gmail.com");
	}
	
	public void userUsername() {
		Username.sendKeys("sudhir");
	}
	
	public void userPassword() {
		Password.sendKeys("12345");
	}
	
	public void retypePassword() {
		RetypePassword.sendKeys("12345");
	}
	
	
	public void createUser() {
		boolean button = CreateUser.isDisplayed();
		
		if(button == true) {
			System.out.println("Third Scenario = To Verify User can created in system or not? ");
			CreateUser.click();
			System.out.println("User created Successfully!");
		}
		else {
			System.out.println("Sorry! User Can not Created");
		}
	}
	
	
	
}
