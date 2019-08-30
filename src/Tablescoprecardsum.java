import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablescoprecardsum {

	public static void main(String[] args) {
		
		int sum=0;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-slk-2nd-t20i");
             
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowcount=table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
		int columncount=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
	
		for(int i=0;i<columncount-2;i++)
		{
		String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		  int integervalue =Integer.parseInt(value);
		  sum=sum+integervalue;
		}
		
		//System.out.println(sum);
		//traversing to sibling to sibling concept from extras text to 4 runs
		String extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		 int extrasValue=Integer.parseInt(extras);
		 int totalSumValue=sum+extrasValue;
		 System.out.println(totalSumValue);
		String ActualTotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int ActualTotalvalue=Integer.parseInt(ActualTotal);
		
		if (ActualTotalvalue==totalSumValue)
		{
			System.out.println("Count Matches");
		}
		else
		{
			System.out.println("Count fails");
		}
	}

}
