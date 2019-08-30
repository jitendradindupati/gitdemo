import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestivehiddenwebelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://ksrtc.in/");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		//driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());
		
		//Javascript DOM(Document object model) w3school.com-- > DOM Document can extract hidden elements
		//Selenium can not identify Ajax or hidden elements
		//How to identify it, investigae property if it has any hidden elements when we are not able to get the output with gettext() 
		//JavaScriptExecutor()
		//https://www.w3schools.com/js/js_htmldom_document.asp
		//document.getElementById(id)	Find an element by element id
		//document.getElementsByTagName(name)	Find elements by tag name
		//document.getElementsByClassName(name)	Find elements by class name
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		String script= "return document.getElementById(\"fromPlaceName\").value;";
		String text=(String) js.executeScript(script);
		System.out.println(text);
		//BENGULURU INTERNATION AIPORT
		int i=0;
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
		{
			i++;
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		    text=(String) js.executeScript(script);
			System.out.println(text);
			if (i>10)
			{
				break;
			}
		
		}
	
		if(i>10)
		{
			System.out.println("element not found");
		}
		else
		{
			System.out.println("element  found");
		}
		
		
	}

}
