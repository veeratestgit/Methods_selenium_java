package methosdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleauthenticatedpopwithunamepassword {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			//use url has https://Username:Password@the-internet.herokuapp.com/basic_auth
			driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
			driver.manage().window().maximize();
			

	}

}
