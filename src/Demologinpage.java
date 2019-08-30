import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demologinpage {

	WebDriver driver;
	/*public void invokebrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		login();
	}
	
	public void login(){
		driver.get("https://www.facebook.com");
		driver.findElement(By.className("inputtext")).sendKeys("test@abc.com");
		driver.findElement(By.id("pass")).sendKeys("pass");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@role='alert']")).getText());
		driver.quit();
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Demologinpage myobj=new Demologinpage();
        //myobj.invokebrowser();
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.className("inputtext")).sendKeys("test@abc.com");
		driver.findElement(By.id("pass")).sendKeys("pass");
		driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.id("identify_email")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//driver.findElement(By.name("reset_action")).click();
		
		//driver.findElement(By.cssSelector("input[value='Log In']")).click();
		//System.out.println(driver.findElement(By.xpath("//div[@role='alert']")).getText());
		//driver.quit();
		
		
	}

}
