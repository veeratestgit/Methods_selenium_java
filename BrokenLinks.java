package part2methods;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Step-1
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
	    List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+ links.size());
		
		for(WebElement linkElement:links)	
		{
			String Hrefv=linkElement.getAttribute("href");
			if(Hrefv==null||Hrefv.isEmpty())
			{
				System.out.println("It is empty so not possible to check");
				continue;
			}
			//hit the url to server
			//convert string to url
		try 
		{
			URL linkurl = new URL(Hrefv);//converted href value from string to url format
			URLConnection connlinkurl = linkurl.openConnection();//open connevtion to the server
			connlinkurl.connect();//connect to server and sent request the server
			if(((HttpURLConnection) connlinkurl).getResponseCode()>=400)
			{
				System.out.println("Broken link");
				
			}
			else
			{
				System.out.println("Not broken");
			}
		}
			catch(Exception e)
		{
				
		}
	}
	}

}
