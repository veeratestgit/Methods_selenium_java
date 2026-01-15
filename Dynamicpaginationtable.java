package methosdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicpaginationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		WebElement uname = driver.findElement(By.xpath("//input[@id='input-username']"));
		uname.clear();
		uname.sendKeys("demo");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='input-password']"));
		pwd.clear();
		pwd.sendKeys("demo");
		
		

}
}
