import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Enabledisbleracalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com");
		
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isEnabled());
		
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		
		
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isEnabled());
	
	    System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));                
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style")); 
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("It is enabled");
			Assert.assertTrue(true);
		}
		//True() inside it expecting true value but returned false.
		else
		{
			Assert.assertTrue(false);
		}
	
	}

}
