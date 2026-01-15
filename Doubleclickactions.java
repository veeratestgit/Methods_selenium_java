package methosdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclickactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		WebElement field1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement field2 = driver.findElement(By.xpath("//input[@id='field2']"));
		
		field1.clear();
		field1.sendKeys("Selenium_java");
		//double click actions on the button
		Actions act = new Actions(driver);
		act.doubleClick(doubleclick).perform();
		//to validate the same is present in field2
		String text1 = field1.getAttribute("Value");
		
		//get text returns inner text of the web element
		//get attribute returns value of the attributes
		
		if(text1.equals("Selenium_java"))
		{
			System.out.println("Text copied");
		}
		else
		{
			System.out.println("Text did not copied");
		}
		
	

	}

}
