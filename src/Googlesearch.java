import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Googlesearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		//File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src,new File("C:\\Users\\189602\\Screenshots\\test1.png"));
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("testing documents");
		WebDriverWait d=new WebDriverWait(driver,4);
		d.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("btnK")));
		//d.until(ExpectedConditions.elementToBeClickable(locator))
		//d.until(ExpectedConditions.invisibilityOfElementLocated(locator))
		driver.findElement(By.name("btnK")).click();
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.ellip")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'What is Test Documentation?')]")).click();
		
		driver.findElement(By.linkText("Test Formality")).click();
	}

}
