package Page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePage {
	@FindBy(xpath="/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li/a/span")
	List<WebElement> menus ;
	
	@FindBy(tagName="h6")
	WebElement verifmenu ;
	
	
	 public HomePage() {
		 PageFactory.initElements(Config.driver, this);
	 }
	 
    public void CliqueOnMenuByName(String menuname) throws Exception {
    	try {
    		Thread.sleep(3000);
    		for(WebElement menunamee:menus ) {
    			Config.attente(10);
    			if(menunamee.getText().contains(menuname)) {
    				menunamee.click();
    				
    			}
    			
    		}
    		
    	}catch (Exception e) {
			// TODO: handle exception
		}
    }


    public String verifnamemenu() {
    	String actueltext = verifmenu.getText();
		return actueltext;
    	
    }
}
