import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demogetclasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String Currenturl=driver.getCurrentUrl();
		System.out.println(Currenturl);
		
		driver.get("https://www.yahoo.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
		
		//String pagesource=driver.getPageSource();
		//System.out.println(pagesource);
	}
	

}
