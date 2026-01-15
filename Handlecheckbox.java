package methosdemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlecheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        // 1) Open site
	        driver.get("https://testautomationpractice.blogspot.com/");
	        
	       //1st check box
	       // driver.findElement(By.xpath("//input[@id='monday']")).click();
	        
	       //select all check boxes
	    List<WebElement> checkboxes =  driver.findElements(By.xpath("//input[@class='form-check-input'][@type='checkbox']"));

	   /*
	    for(int i=0; i<checkboxes.size();i++)
	    {
	    	checkboxes.get(i).click(); 	
	    }
	    */
	    /*
	    for(WebElement checkbox:checkboxes)
	    {
	    	checkbox.click();	
	    }
	    */
	    
	    //select specific check box last 3
	    // formula is total no of check box - how many we want to select
	   /*
	    for(int i=4; i<checkboxes.size();i++)
	    {
	    	checkboxes.get(i).click();
	    }
	    */
	    
	    
	    
	}

}
