package steps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.LoginPage;
import util.BrowserFactory;

public class LoginStepDef {
	WebDriver driver;
	LoginPage loginpage;

	@Before
	public void startBrowser() {
		
	}
	@Given("^User is on the \"([^\"]*)\" login page$")
	public void user_is_on_the_login_page(String test) {
		if(test.equalsIgnoreCase("Techfios")) {
			//startBrowser();
			//driver = BrowserFactory.init();
			//driver.get("https://techfios.com/billing/?ng=admin/");
			}else if(test.equalsIgnoreCase("TechfiosNewAccount"))
				startBrowser();
		driver = BrowserFactory.init();
			}
		
		//  driver.get("https://techfios.com/billing/?ng=admin/");
		/*if(page.equalsIgnoreCase("Techfios")) {
		driver.get("https://techfios.com/billing/?ng=admin/");
	} else if (page.equalsIgnoreCase("Google")) {
		driver.get("https://google.com");
	}*/
	
	@When("^user enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username)  {
		
	
		loginpage.enterUsername(username);
	}

	@When("^user enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password)  {
		loginpage.enterPassword(password);
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_username_and_paasword(String username, String password) {
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.enterCredentials(username, password);
		
	}

	@When("^user clicks signin button$")
	public void user_clicks_signin_button()  {
		loginpage.signInButtonToLogin();
	}

	

	@Then("^User should land on Dashboard page$")
	public void user_should_land_on_Dashboard_page() throws Throwable {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginpage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		//loginpage.takeScreenshotAtEndOfTest(driver);
	}


	//@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
