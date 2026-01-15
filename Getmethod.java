package methosdemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		//get title
		System.out.println(driver.getTitle()); 
		
		//get current url
		System.out.println(driver.getCurrentUrl());
		
		//get page source
		//System.out.println(driver.getPageSource());
		
		//get window handle
		String windowid=	driver.getWindowHandle();
		System.out.println("Window id is=" +windowid);
		
		//get windows handle id
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //this will open new window
		Set<String> windowids = driver.getWindowHandles(); //using set bcz cant have duplicates
		System.out.println("Windows id is=" +windowids);
		
		//close will close only one window
		//quit will close all windows
		
		

		
	}

}
