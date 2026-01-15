package methosdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalmethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		
		driver.manage().window().maximize();
		//isdisplayed
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("Display stauts of logo is: "+logo.isDisplayed());
		
		//also can be written in single line and boolean value
		
		//is enabled
		 boolean status = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		 System.out.println("Enable status: "+status);
		 
		 //is selected
		 WebElement male_rd= driver.findElement(By.xpath("//input[@value='M']"));
		 WebElement female_rd= driver.findElement(By.xpath("//input[@value='F']"));
		 
		 System.out.println("Before selection......");
		 System.out.println("Status of Male: "+male_rd.isSelected());
		 System.out.println("Status of feMale: "+female_rd.isSelected());
		 
		 System.out.println("After selection of male......");
		 male_rd.click();
		 System.out.println("Status of Male: "+male_rd.isSelected());
		 System.out.println("Status of feMale: "+female_rd.isSelected());
		 
		 Thread.sleep(3000);
		 
		 System.out.println("After selection of female......");
		 female_rd.click();
		 System.out.println("Status of Male: "+male_rd.isSelected());
		 System.out.println("Status of feMale: "+female_rd.isSelected());

	}

}
