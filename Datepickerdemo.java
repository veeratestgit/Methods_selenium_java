package methosdemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepickerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//switch to frame
		driver.switchTo().frame(0);
		
		//method1 using send keys if input option is avilanle
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2025");
		
		//method 2 using date picker
		String year = "2025";
		String month = "December";
		String day = "21";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		//select month and year
		
		while(true)
		{
			String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			if(currentmonth.equals(month) && currentyear.equals(year))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement dt:alldates)
		{
			if(dt.getText().equals(day))
			{
				dt.click();
				break;
			}
		}
		
		

	}

}
