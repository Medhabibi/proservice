package TestSuites;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Page.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	@Given("admin is in login page")
	public void admin_is_in_login_page() {
		Config.driver =new ChromeDriver();
		Config.confchrome();
		Config.openurl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Config.maximizeWindow();
		
	   
	}

	@When("amdin enter correct username {string} and correct password {string}")
	public void amdin_enter_correct_username_and_correct_password(String mail, String pwd) throws Exception {
		LoginPage page = new LoginPage();
		page.connecte(mail, pwd);
		
	    
	}

	@Then("admin is directed to the home page")
	public void admin_is_directed_to_the_home_page() {
		
	}

	@When("admin enter incorrect username {string} and incorrect  password {string}")
	public void admin_enter_incorrect_username_and_incorrect_password(String name, String pwd) throws Exception {
		LoginPage page = new LoginPage();
		page.connecte(name, pwd);
		Config.closeBrowser();
		
	    
	}

	@Then("admin is in login page  that containes message {string}")
	public void admin_is_in_login_page_that_containes_message(String expectedtext) throws Exception {
		LoginPage text =  new LoginPage();
		Config.attente(10);
		Assert.assertEquals(expectedtext, text.verifmessage());
		Config.attente(10);
		Config.driver.quit();
		
		
	    
	}
	



	
	




	

}
