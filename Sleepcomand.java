package methosdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sleepcomand {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//it will execute before the mentioned time if it is availabe it will not wait for maximum time
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		//Thread.sleep(5000);//pause activity for 5 seconds
		//to solve syncrohnoisation problem
		//even though element is available it will not go until the mentioned time completes
		//
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

	}

}
