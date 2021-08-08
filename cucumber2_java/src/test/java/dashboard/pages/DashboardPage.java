package dashboard.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class DashboardPage {

	public DashboardPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}	
	
	
	
	
	@FindBy (how = How.XPATH,using = "//*[@name='txtUsername']")	
	private static WebElement username;

	@FindBy (how = How.XPATH,using = "//*[@name='txtPassword']")	
	private static WebElement password;

	@FindBy (how = How.XPATH,using = "//*[@type='submit']")	
	private static WebElement LoginBtn;

	@FindBy (how = How.XPATH,using = "//*[@class='panelTrigger']")	
	private static WebElement welcomeWord;



	@FindBy (how =How.XPATH, using ="//*[contains(text(),'Logout')]")
		private static WebElement logoutBtn;






	public  void enterUsernameAndPassword() {
		   
		   
			username.sendKeys("Admin");
			password.sendKeys("admin123");
		 }


	 public void clickOnLoginButton() {
	 	
	 	
	 	LoginBtn.click();
	 	 
	 	 
	 }
	 
	 
	 
	 public void verifyWelcomeWord() {
	 	
	 	    String expected = "Welcome";
			String actual = welcomeWord.getText().trim();
			Assert.assertTrue("Word does not match", actual.contains(expected));

	 }


		public void verifyUserName() {
		
			
				String expected = "Paul";
				String actual = welcomeWord.getText().trim();
				Assert.assertTrue("Word does not match", actual.contains(expected));
			
		}
		

			public void logOut() {
				welcomeWord.click();
				logoutBtn.click();
				
				
			}


			public void clickOnLoginButton(WebDriver driver) {
				
				
			}


			
			
			
	 
	}
		


//
//package dashboard.steps;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.PageFactory;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import dashboard.pages.DashboardPage;
//
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//
//public class DashStepDef {
//	WebDriver driver;
//	DashboardPage dashPage;
//	
//	
//
//	@Given("^user go to Orange Hrm home page$")
//	public void user_go_to_Orange_Hrm_home_page() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
//
//		driver = new ChromeDriver();
//
//		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
//		driver.manage().window().maximize();
//
//	}
//
//	@When("^user enter valid username and password$")
//	public void user_enter_valid_username_and_password() throws Throwable {
//		dashPage = new DashboardPage(driver);
//		dashPage.enterUsernameAndPassword();
//
//	}
//
//	@When("^user click on the log in button$")
//	public void user_click_on_the_log_in_button() throws Throwable {
//		dashPage.clickOnLoginButton();
//	}
//
//	@Then("^user navigate to the welcome page$")
//	public void user_navigate_to_the_welcome_page() throws Throwable {
//		dashPage.verifyWelcomeWord();
//	}
//
//	@Then("^user verify the page title as \"([^\"]*)\"$")
//	public void user_verify_the_page_title_as(String title) throws Throwable {
//		String expected = title;
//		String actual = driver.getTitle();
//		Assert.assertTrue("Title does not match", actual.contains(expected));
//	}
//
//	@Then("^user verify user name is displays at top right$")
//	public void user_verify_user_name_is_displays_at_top_right() throws Throwable {
//		dashPage.verifyUserName();
//	}
//	
//	@Then("^user log out$")
//	public void user_log_out() throws Throwable {
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	    dashPage.logOut();
//	}
//
//	@Then("^user close browser$")
//	public void user_close_browser() throws Throwable {
//		driver.close();
//		driver.quit();
//	    
//	}
//






