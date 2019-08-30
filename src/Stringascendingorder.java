import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Stringascendingorder {

	public static void main(String[] args) {
		//Bydefault it is not in ascending order
		// retrieve all the values of vegetab/fruits from name column
		//create arraylist with all the values
		//copy all the values from arrary list and sort it
		//compare arraylist with the original values (array list)
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		
	List<WebElement> Firstcolumnlist=driver.findElements(By.cssSelector("tr td:nth-child(2)"));
	
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
	Collections.sort(copiedList);
	
	for(String s: copiedList)
	{
		System.out.println(s);
	}
	System.out.println("***************OriginalList*************");
	for(String s: OriginalList)
	{
		System.out.println(s);
	}
	Assert.assertTrue(OriginalList.equals(copiedList));
	
	}


}
