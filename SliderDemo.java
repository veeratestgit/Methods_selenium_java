package methosdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		
		WebElement min_slider=	driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		System.out.println("Location of the min slider is: " +min_slider.getLocation());//(X,Y)
		act.dragAndDropBy(min_slider, 100, 249).perform();
		System.out.println("Location of the min slider after moving is: " +min_slider.getLocation());
		
		WebElement max_slider=	driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
		System.out.println("Location of the max slider is: " +max_slider.getLocation());//(X,Y)
		act.dragAndDropBy(max_slider, -100, 249).perform();
		System.out.println("Location of the min slider after moving is: " +max_slider.getLocation());
		
		

	}

}
