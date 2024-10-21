package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class LoginPage {
	@FindBy(name="username")
	WebElement usernamee ;
	@FindBy(name="password")
	WebElement pwd;
	@FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement btnlogin;
	@FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
	              
	WebElement veriflogin;
	
	public LoginPage() {
		PageFactory.initElements(Config.driver, this);
	}
	 public void connecte(String name, String password) throws Exception {
		 Thread.sleep(3000);
		 usernamee.sendKeys(name);
		 Thread.sleep(2000);
		 pwd.sendKeys(password);
		 Thread.sleep(2000);
		 btnlogin.click();
		 
	 }
	 public String verifmessage() throws Exception {
		 Thread.sleep(3000);
		 String actualtext =veriflogin.getText();
		return actualtext;
		 
	 }

}
