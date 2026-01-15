package methosdemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://www.google.com/?zx=1756527021578&no_sw_cr=1");
		driver.manage().window().maximize();
		//Click on search biox
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(4000);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		
		System.out.println("Size of auto suggest box is "+list.size());
		//use for loop
		for(int i =0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("selenium"))
			{
				list.get(i).click();
				break;
				
			}
		}
		
		

	}

}
