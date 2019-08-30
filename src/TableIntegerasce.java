import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableIntegerasce {

	public static void main(String[] args) {
		//Bydefault it is not in ascending order
		
		
		// retrieve all the values of vegetab/fruits from name column
		//create arraylist with all the values
		//copy all the values from arrary list and sort it
		//compare arraylist with the original values (array list)
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("tr th:nth-child(3)")).click();
		driver.findElement(By.cssSelector("tr th:nth-child(3)")).click();
		
	List<WebElement> Firstcolumnlist=driver.findElements(By.cssSelector("tr td:nth-child(3)"));
	sortcolumn(Firstcolumnlist,"asce","integers");
	}
	
	public static void sortcolumn(List<WebElement> Firstcolumnlist, String order, String format)
	{
		
		
		ArrayList<String> OriginalList=new ArrayList<String>();
		for(int i=0;i<Firstcolumnlist.size();i++)
			
		{
			//to add the values in to original lsit we will use Originallist.add()method.
			//System.out.println(Firstcolumnlist.get(i).getText());
			OriginalList.add(Firstcolumnlist.get(i).getText());
		}
		
		ArrayList<String> copiedList=new ArrayList<String>();
		
		for(int i=0;i<OriginalList.size();i++)
		{
			copiedList.add(OriginalList.get(i));
		}
		System.out.println("*******************************");
		
		if(format.equalsIgnoreCase("integer"))
		{
			Arrays.sort(copiedList.toArray());
		}
		
		else
		{
			Collections.sort(copiedList);
		}
		
		
		if(order.equalsIgnoreCase("desc"))
		{
		
		}
		else
		{
			
			Collections.sort(copiedList);
			if(order.equalsIgnoreCase("desc"))
			{
				
			Collections.reverse(copiedList);		
			
			}
		}
		
				
				
		
		
		Assert.assertTrue(OriginalList.equals(copiedList));
		
	}


}

