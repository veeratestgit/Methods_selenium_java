package methosdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehoweractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.xpath("//button[@class='dropbtn']"));
		//call th epredefined class of selenium
		//we can access any method from creating actions calss
		Actions act = new Actions(driver);
		//mouse hover actions
		//build will create an action
		//perform will perform an actions
		act.moveToElement(dropdown).click().build().perform();
		

	}

}
