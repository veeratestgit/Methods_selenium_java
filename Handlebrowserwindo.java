package methosdemo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlebrowserwindo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//it will execute before the mentioned time if it is availabe it will not wait for maximum time
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Set<String> Windowid= driver.getWindowHandles();
		
		//approach1
		//converted set into list bcz we cannot have get method
		List<String> wids= new ArrayList(Windowid);
		String Parrent = wids.get(0);
		String child = wids.get(1);
		
		//switch to child window
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		
		//switch to Parent window
		driver.switchTo().window(Parrent);
		System.out.println(driver.getTitle());
		
		//approach2 using for loop enhanced for loop
		
		

	}

}
