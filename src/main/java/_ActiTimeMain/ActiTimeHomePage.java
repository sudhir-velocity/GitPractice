package _ActiTimeMain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeHomePage {

	@FindBy(xpath="//img[@src='/img/default/top_nav/default-logo.png?hash=274618146']")
	private WebElement Logo;

	@FindBy(xpath="//a[@id='logoutLink']")
	private WebElement Logout;
	
	
	@FindBy (xpath="//a[@href='/tasks/otasklist.do']")
	private WebElement TasksMenu;
	
	@FindBy (xpath="//a[@href='/reports/reports.do']")
	private WebElement ReportsMenu;
	
	
	
	public ActiTimeHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public void checkHomePageLogo() {
		boolean main = Logo.isDisplayed();
		if(main == true) {
			
			System.out.println("Result = Yes! Logo is Present, Test Passed :)");
		}
		else {
			System.out.println("Test Failed :(");
		}

	}

	public void clickHomePageLogout() {
		Logout.click();
	}

	public void clickonTasksMenu() {
		
		TasksMenu.click();
	}

	
	public void clickonReportsMenu() {
		ReportsMenu.click();
	}
	

	
	
//	public void createTasksButton() {
//		CreateTasksButton.click();
//	}
//	
////	public void newCustomer() {
////		SelectCustomerDropDown.click();
////		NewCustomer.click();
////	}
//	
//	public void firsttaskname() {
//		firstTaskname.sendKeys("firsttaskname");
//	}
//	
//	public void checkBox() {
//		CheckBox.click();
//	}

//	@FindBy (xpath="//div[@id='ext-gen32']")
//	private WebElement CreateTasksButton;
	
	
//	@FindBy (xpath="//button[@id='ext-gen234']")
//	private WebElement SelectCustomerDropDown;
//
//	
//	@FindBy (xpath="//a[@id='ext-gen178']")
//	private WebElement NewCustomer;
	
//	@FindBy (xpath="/html/body/div[1]/div[6]/div/div/div[1]/div[3]/table/tbody/tr[2]/td[1]")
//	private WebElement firstTaskname;
//	
//	@FindBy(xpath= "//input[@id='createTasksPopup_addAllToTasksCheckbox']")
//	private WebElement CheckBox;
	

}

