package methosdemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//explicit wait
		//declaration
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10)); 
		//now after identifing were the error is comming syncronisation error we need to aplly this
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		//now using my wait we can use the below one to wait
		
		WebElement tuser =mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		tuser.sendKeys("Admin");
		
		WebElement tpass =mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		tpass.sendKeys("admin123");
		
		WebElement loginbtn =mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		loginbtn.click() ;
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		//conditional based  works effectively
		//it will wait for condtion to be true
		//need to write multiple statemnets for multiple ellemnts
		

	}

}
