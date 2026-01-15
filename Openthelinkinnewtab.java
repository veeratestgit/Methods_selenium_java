package methosdemo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Openthelinkinnewtab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement reglink = driver.findElement(By.xpath("//a[text()='Register']"));
		Actions act = new Actions(driver);
		//ctrl+register link
		act.keyDown(Keys.CONTROL).click(reglink).keyUp(Keys.CONTROL).perform();
		//switch to registration page
		List<String> ids =new ArrayList(driver.getWindowHandles());
		//switch to reg page
		driver.switchTo().window(ids.get(1));
		//perform action
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("ME");
		//SWITCH TO HOME PAGE
		driver.switchTo().window(ids.get(0));
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Tshirts");
		
		

	}

}
