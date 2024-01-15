package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class LoginStepDefination {
	
	WebDriver driver;
	
	@Given("^Given user is already on login page$")
	public void user_is_already_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/champ/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	
	
	
	
	
}
	


