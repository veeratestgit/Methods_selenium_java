package part2methods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;

public class RunTestIncognitoMode {
		public static void main(String[] args) {

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");//setting for running in incognito modde
		
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

//To deal with excel we have java class
//To read= Fileinputstream
//to write= Fileoutputstream

//to work with sheet,rows,columns, we have  class form apache poi
//XSSF

