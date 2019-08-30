import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazonwindowhandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.co.in");
		Actions a =new Actions(driver);
        a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
        driver.findElement(By.cssSelector("span[class='nav-action-inner']")).click();
        System.out.println(driver.getTitle());
        driver.navigate().back();
        driver.findElement(By.id("searchDropdownBox")).click();
        Select s=new Select(driver.findElement(By.id("searchDropdownBox")));
        s.selectByIndex(8);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dresses");
        
        driver.findElement(By.cssSelector("input[value='Go']")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.cssSelector("input[value='Go']")).sendKeys(Keys.ENTER);
        
        driver.findElement(By.cssSelector("span[class='a-size-base-plus a-color-base a-text-normal']")).click();
        System.out.println(driver.getTitle());
        
        Set<String> ids=driver.getWindowHandles();
        Iterator<String> it=ids.iterator();
        String Parentid=it.next();
        String childid=it.next();
        driver.switchTo().window(childid);
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
        driver.findElement(By.id("add-to-cart-button")).click();
        driver.findElement(By.id("hlb-ptc-btn-native")).click();
        driver.findElement(By.id("ap_email")).sendKeys("jitendra.dindupati@gmail.com");
        driver.findElement(By.cssSelector("input[class='a-button-input']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("ap_password")).sendKeys("Test@123");
        driver.findElement(By.id("signInSubmit")).click();
        driver.findElement(By.id("account-fixup-phone-number")).sendKeys("7204797181");
        driver.findElement(By.cssSelector("input.a-button-input")).click();
        System.out.println(driver.findElement(By.xpath("//h4[text()='There was a problem']")).getText());
                          
        
        
        
        
        
       
        //driver.findElement(By.id("createAccountSubmit")).click();
        //System.out.println(driver.getTitle());
	}

}
