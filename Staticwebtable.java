package methosdemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticwebtable {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//find total number of row in a tables 
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Number of rows: "+rows);
		
		//find total number of collumns in a tables 
		int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Number of columns: "+columns);
		
		//read data from specific row and column-ex= 5 th row and 1st column
		String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println("Data from specific row and column is : "+bookname);
		
		//read data from all rows and colums
		/*
		for(int r=2;r<= rows;r++)
		{
			for(int c=1;c<=columns;c++)
			{
				//synatx for passing parameter into xpath is inside "+variable+"
				String data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(data+"\t");
			}
			System.out.println();
		}
		// print data with certain conditions
		//ex- print books written by author mukesh
		for(int j=2;j<= rows;j++)
		{
			String authname = driver.findElement(By.xpath("//table[@name='BookTable']//tr[\"+j+\"]//td[2]")).getText();
			if(authname.equals("Mukesh"))
			{
				String booknam = driver.findElement(By.xpath("//table[@name='BookTable']//tr[\"+j+\"]//td[1]")).getText();
				System.out.println(booknam+"\t"+authname);
			}
		}
		*/
		//find total price of all books
		int total =0;
		for(int j=2;j<= rows;j++)
		{
			String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr[\"+j+\"]//td[4]")).getText();
			total = total+Integer.parseInt(price);
		}
		System.out.println(total);
		

}
}
