package methosdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions Act = new Actions(driver);
		//rightclick
		Act.contextClick(rightclick).perform();
		//select from dropdown
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		Thread.sleep(5000);
		//close the alertbox
		driver.switchTo().alert().accept();
		

	}

}
