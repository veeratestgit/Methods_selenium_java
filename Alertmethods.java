package methosdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertmethods {
	//Alert is not web element we cannot ibspect those elemnts
	//even alert prompt also bcz we cannot get attributes

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
       
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		//1 ST ALERT WINDOW WITH SINGLE BUTTON
		/*

		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(5000);
		Alert mylert = driver.switchTo().alert();
		System.out.println(mylert.getText());
		mylert.accept();
		
		*/
		
		//2nd confirmation alert ok and close button
		
		/*
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(5000);
		Alert mylert = driver.switchTo().alert();
		System.out.println(mylert.getText());
		mylert.accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		mylert.dismiss();
		
		*/
		
		//prompt alert which is having input boxes
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
		Alert mylert = driver.switchTo().alert();
		System.out.println(mylert.getText());
		mylert.sendKeys("Welcome");
		mylert.accept();
		
		
		

	}

}
