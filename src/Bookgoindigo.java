import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bookgoindigo {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.goindigo.in");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.form-control.or-src-city")).click();
		driver.findElement(By.cssSelector("input.form-control.or-src-city")).sendKeys(Keys.BACK_SPACE);
		
		driver.findElement(By.xpath("//input[@name='or-src']")).sendKeys("Vijayawada");
		driver.findElement(By.xpath("//input[@name='or-src']")).sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
        driver.findElement(By.cssSelector("input.form-control.or-dest-city")).sendKeys("Tir");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input.form-control.or-dest-city")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.cssSelector("input.form-control.or-dest-city")).sendKeys(Keys.ENTER);
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("scroll(0,300)");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("a.ui-state-default.ui-state-active")).click();
               
        driver.findElement(By.xpath("//a[contains(text(),'Done')]")).click();
       
        driver.findElement(By.cssSelector("input.form-control.hpBookingForm.passengerInputField.pax-class-count")).click();
        Thread.sleep(1000);
        
        for(int i=1;i<4;i++)
        {
        	driver.findElement(By.cssSelector("button.pax-plus.btn.btn-info")).click();
        }
        
        driver.findElement(By.cssSelector("button.btn.btn-primary.pax-done.btn-pad-y")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='bookFlightTab']/form/div[7]/div[1]/label/label")).click();
        
        driver.findElement(By.cssSelector("span[class='hp-src-btn']")).click();
	}

}
