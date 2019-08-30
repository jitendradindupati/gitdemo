import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertmessage3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Alert alert =driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		//To click on cancel button driver.switchTo().alert().dismiss();
		//driver.switchTo().alert().sendKeys("test");
		//driver.switchTo().alert().dismiss();
		
	}

}
