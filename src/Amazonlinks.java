import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonlinks {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		//no of links on amazon page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//no of links on footerpage
		WebElement footerdriver =driver.findElement(By.cssSelector("div.navFooterVerticalRow.navAccessibility"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//no of links in secondcolumn
		WebElement columndriver=footerdriver.findElement(By.xpath("//div[@class='navFooterVerticalRow navAccessibility']/div[3]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		for(int i=0;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonlinks=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinks);
			Thread.sleep(5000);
		}
		
		Set<String> abc=driver.getWindowHandles();
		Iterator<String> it =abc.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
      
	}

}
