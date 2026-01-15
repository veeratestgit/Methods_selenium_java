package part2methods;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;

public class HandleSSL {
		public static void main(String[] args) {
		
			ChromeOptions options = new ChromeOptions();
			options.setAcceptInsecureCerts(true);
			
			WebDriver driver = new ChromeDriver(options);
			driver.get("https://expired.badssl.com/");
			String actual = driver.getTitle();
			System.out.println(actual);
			driver.quit();
		}
	}
