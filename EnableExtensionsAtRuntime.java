package part2methods;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;

public class EnableExtensionsAtRuntime {

			public static void main(String[] args) {

				ChromeOptions options = new ChromeOptions();
				options.addArguments("--incognito");//setting for running in incognito modde
			
				WebDriver driver = new ChromeDriver(options);
				driver.get("https://www.amazon.in/");
				
			}
		}
