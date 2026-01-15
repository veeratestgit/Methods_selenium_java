package methosdemo;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fluentwaitmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		//fluent wait declaration
		Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10)) // Maximum wait time
				.pollingEvery(Duration.ofSeconds(2)) // Frequency of condition checks
				.ignoring(NoSuchElementException.class); // Exceptions to ignore (e.g., NoSuchElementException)
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement tusername = mywait.until(new Function<WebDriver, WebElement>() {
		    public WebElement apply(WebDriver driver) {
		        return driver.findElement(By.xpath("//input[@placeholder='Username']")); // Replace with your locator
		    }
		});
		tusername.sendKeys("Admin");
			
		}
	
}
