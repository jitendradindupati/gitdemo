import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmailloginpage1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.yahoo.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("uh-signin")).click();
		driver.findElement(By.id("login-username")).sendKeys("jitendradindupati@yahoo.com");
		driver.findElement(By.name("signin")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("login-passwd")).sendKeys("143indra");
		driver.findElement(By.xpath("//button[@name='verifyPassword']")).click();
		driver.findElement(By.cssSelector("span[class='Mstart(2px)']")).click();
		driver.findElement(By.cssSelector("span[class='o_h G_e J_x em_N']")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@href='https://cricket.yahoo.com/']")).click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0,5000)");

	}

}
