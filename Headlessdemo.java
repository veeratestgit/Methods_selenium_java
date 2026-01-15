package part2methods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;


public class Headlessdemo {
	public static void main(String[] args) {
		
		//step-1 launch the browser
		//headless testing
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");//setting for headless mode actions
		// advantages
			//can do multiple task can be done any task parallel as execution is in backend
			//faster execution performance
		//Disadvantages
			//cannot see so beginners cannot understand the process
			//SSL handling can't be done
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		String actual = driver.getTitle();
		System.out.println(actual);
		if(actual.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		driver.quit();
	}
}
