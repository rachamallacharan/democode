package Day_1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chara\\OneDrive\\Desktop\\Sel_Jars\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://qaclickacademy.com/practice.php");
		  System.out.println(driver.findElements(By.tagName("a")).size());
		  WebElement footdriver = driver.findElement(By.id("gf-BIG"));
		  System.out.println(footdriver.findElements(By.tagName("a")).size());
		  //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 WebElement columndriver = footdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		  System.out.println(columndriver.findElements(By.tagName("a")).size());
   for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
{
	 String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER); 
	 columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
	   Thread.sleep(5000L);
	   Set<String> windowhandles = driver.getWindowHandles();
	   Iterator<String> windows = windowhandles.iterator();
	   while(windows.hasNext())
	   {
		 driver.switchTo().window(windows.next());
		 System.out.println(driver.getTitle());
		  
	   }
	   
	   
	   
	   
}
   
		  
		  
		  
	}

}
