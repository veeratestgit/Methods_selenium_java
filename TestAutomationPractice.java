package methosdemo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class TestAutomationPractice {
    public static void main(String[] args) {
        // Setup ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1) Open site
        driver.get("https://testautomationpractice.blogspot.com/");

        // 2) Search for a specific string in page source
        String searchTerm = "Upload Files";
        if (driver.getPageSource().contains(searchTerm)) {
            System.out.println("'" + searchTerm + "' found on the page!");
        } else {
            System.out.println("'" + searchTerm + "' not found on the page!");
        }

        // 3) Count number of links
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links on page: " + links.size());

        // Store original window handle
        String originalWindow = driver.getWindowHandle();

        // 4) Click each link in a loop
        for (int i = 0; i < links.size(); i++) {
            WebElement link = links.get(i);
            String linkText = link.getText().isEmpty() ? link.getAttribute("href") : link.getText();
            System.out.println("Clicking link: " + linkText);

            try {
                link.click();
                Thread.sleep(1000); // Small pause to allow window/tab to open

                Set<String> windowHandles = driver.getWindowHandles();

                // 5) Print all window handles and close new ones
                for (String handle : windowHandles) {
                    if (!handle.equals(originalWindow)) {
                        driver.switchTo().window(handle);
                        System.out.println("New Window Title: " + driver.getTitle());
                        
                        // Example: close a specific window by title
                        if (driver.getTitle().contains("Apple")) {
                            System.out.println("Closing Apple window...");
                            driver.close();
                        } else {
                            driver.close(); // Close all new windows
                        }
                        driver.switchTo().window(originalWindow);
                    }
                }
            } catch (Exception e) {
                System.out.println("Error clicking link: " + e.getMessage());
            }

            // Refresh link list to avoid stale element issue
            links = driver.findElements(By.tagName("a"));
        }

        // Close original window
        // tdriver.quit();
    }
}

