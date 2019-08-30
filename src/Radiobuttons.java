import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.findElement(By.xpath("//input[@value='Butter']")).click();
		
		//get the count of raido buttons
		//System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());
		
		int count=driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		/*for(int i=0;i<count;i++)
		{
			driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		}*/
		
		/*for(int i=0;i<count-1;i++)
		{
			driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		}*/
		
		
		for(int i=0;i<count;i++)
		{
			
			String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
		
		
		if(text.equals("Cheese"))
		{
			driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		}
	}
		}
		

}
