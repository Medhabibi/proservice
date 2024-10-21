package Helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Config {
	
	public static WebDriver driver ; 
	public static void confchrome() {
		System.setProperty("webdriver.chrome.driverr", "c:/chromedriver.exe");
	}
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	public static void attente(int s) {
		Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
	}
	public static void openurl(String url) {
		driver.get(url);
	}
public static void closeBrowser() {
	driver.quit();;
}
}
