package TestSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Page.LoginPage;
import io.cucumber.java.en.Given;

public class CommunSteDef {

	@Given("Utilisateur est connecte avec le bon username {string} et le bon login {string}")
	public void utilisateur_est_connecte_avec_le_bon_username_et_le_bon_login(String username, String pwd) throws Exception {
	   Config.driver = new ChromeDriver();
	   Config.confchrome();
	   Config.openurl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   Config.maximizeWindow();
	   LoginPage page = new LoginPage();
	   page.connecte(username, pwd);
	}
}
