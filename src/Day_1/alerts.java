package Day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chara\\OneDrive\\Desktop\\Sel_Jars\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();  
		  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		  Thread.sleep(1000);
		  driver.findElement(By.id("name")).sendKeys("charan");
		  driver.findElement(By.id("alertbtn")).click();
		  System.out.println(driver.switchTo().alert().getText());
		  Thread.sleep(1000);
		  driver.switchTo().alert().dismiss();
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
