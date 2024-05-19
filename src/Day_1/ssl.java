package Day_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ssl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		//options.addExtensions("") for extensions
		proxy proxy = new proxy();
		proxy.setHttpProxy("ipaddress:4444");
		options.setCapability("Proxy",proxy);
		options.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chara\\OneDrive\\Desktop\\Sel_Jars\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver(options);
		  driver.get("https://expired.badssl.com/");
		  System.out.println(driver.getTitle());
		  
			  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
