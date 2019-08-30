import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Sslcertificationscode {

	public static void main(String[] args) {
		// SSL Certificate
		//Desired Capabilities
		//General chrome profile
		DesiredCapabilities ch = DesiredCapabilities.chrome();
        //ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        
        //Below to your local browser
        ChromeOptions c=new ChromeOptions();
        c.merge(ch);
        
        
        
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(c);
		driver.get("");
	}

}
