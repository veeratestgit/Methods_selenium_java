package methosdemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dealingwithdropdown {
	//three types dropdown
	//select
	//bootstarp
	//hidden

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//to handle select type of dropdown we can use slect class
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='country']"));
		//now using select class onject we can interact
		Select drcountry = new Select(dropdown);
		//now select options from the dropdown 
		//differnet methods
		drcountry.selectByVisibleText("India");
		drcountry.selectByValue("japan");
		drcountry.selectByIndex(2);
		
		//capture the all options from dropdown
		List <WebElement> options = drcountry.getOptions();
		System.out.println("Total number of options in dropdown are: "+options.size());
		
		//printitng the options
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
			
		}
		
		//using enhance for loop
		for(WebElement op : options)
		{
			System.out.println(op.getText());
		}
		
		
		

	}

}
