package Day_1;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentWait {

	public static void main(String[] args)throws InterruptedException{
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\chara\\OneDrive\\Desktop\\Sel_Jars\\chromedriver_win32\\chromedriver.exe"); 
			  WebDriver driver=new ChromeDriver();
			driver.get("https://the-internet.herokupp.com/dynamic_loading/1");
			driver.findElement(By.cssSelector("[id='start'] button")).click();
			Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3));
			
			WebElement foo = wait.until(new Function<WebDriver,WebElement>() {
			 public WebElement apply(WebDriver driver) {
				 if( driver.findElement(By.cssSelector("[id='finish']h4")).isDisplayed())
				 {
					 return driver.findElement(By.cssSelector("[id='finish']h4"));
				 }
				 else;
				     return null;
			 }
			});
			System.out.println(driver.findElement(By.cssSelector("[id='finish']h4")).isDisplayed());
	}
		
		
		
		
		

	}


