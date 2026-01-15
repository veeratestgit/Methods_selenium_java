package part2methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollingpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		//scroll down the page by pixel
		/*
		js.executeScript("window.scrollBy(0,2000)", "");
		System.out.println(js.executeScript("return window.pageYOffSet;"));
		*/
		
		//scroll the oage till particular thing is visible or found
		/*
		WebElement ele = driver.findElement(By.xpath("//span[text()='Zambia']"));
		js.executeScript("arguments[0].scrollIntoView();",ele);
		System.out.println(js.executeScript("return window.pageYOffSet;"));
		*/
		
		//scroll till the end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffSet;"));

	}

}
