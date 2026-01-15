package part2methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		//singlefile upload
		/*
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\GoVe150\\Desktop\\Autolaunch_rameses\\txt1.txt");
		//validate after update
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("txt1.txt"))
		{
			System.out.println("File is uploaded successfully");
		}
		else
		{
			System.out.println("File not uploaded");
		}
		*/
		//upload multiple files
		String file1 = "C:\\Users\\GoVe150\\Desktop\\Autolaunch_rameses\\txt1.txt";
		String file2 = "C:\\Users\\GoVe150\\Desktop\\Autolaunch_rameses\\txt2.txt";
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(file1+"\n"+file2);
		int noffiles = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		if(noffiles==2)
		{
			System.out.println("All files are uploaded");
		}
		else
		{
			System.out.println("some File not uploaded");
		}
	}

}
