package methosdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handleframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));     
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//using webelement
		//identofy the frame
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
		//switch to the frame
		driver.switchTo().frame(frame1);//passed frame as webelement
		//perform actions
		driver.findElement(By.xpath("//input[@name=\"mytext1\"]")).sendKeys("Welcome");
		//to interact with other fraes first we need to go back to page and then switch to other 
		
		driver.switchTo().defaultContent();
		
		//2nd frame
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name=\"mytext2\"]")).sendKeys("To Selenium");
		driver.switchTo().defaultContent();
		
		//frame3 
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name=\"mytext3\"]")).sendKeys("and Java");
		//now interact frame within frame that is i frame
		//switching to frame using index
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\"i6\"]/div[3]/div")).click();
		driver.switchTo().defaultContent();

	}

}
