package part2methods;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturescreenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1.capture full page ss
		
		/*
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		//File trgfile = new File("C:\\Users\\GoVe150\\eclipse-workspace\\demowebdriver\\Scrrenshots\\fullpage.PNG");
		//INSTEAD OF TYPING ALL THE PATH WE CAN DIRECTLY GET DIROF CURRENT PROJECT
		File trgfile = new File(System.getProperty("user.dir")+"\\Scrrenshots\\fullpage.PNG");
		//copies source file to target files
		srcfile.renameTo(trgfile);
		*/
		
		//2 CAPTURE FOR SPECIFIC SECTION
		/*
		WebElement specificsection = driver.findElement(By.xpath("//div[@class='fauxborder-left header-fauxborder-left']"));
		File srcfile = specificsection.getScreenshotAs(OutputType.FILE);
		File trgfile = new File(System.getProperty("user.dir")+"\\Scrrenshots\\specificsection.PNG");
		srcfile.renameTo(trgfile);
		*/
		
		//3/capture the ss of specific web element
		
		WebElement specificelement = driver.findElement(By.xpath("//button[@name='start']"));
		File srcfile = specificelement.getScreenshotAs(OutputType.FILE);
		File trgfile = new File(System.getProperty("user.dir")+"\\Scrrenshots\\specificelement.PNG");
		srcfile.renameTo(trgfile);
	}

}
