package Day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chara\\OneDrive\\Desktop\\Sel_Jars\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();  
		  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		  driver.findElement(By.className("ui-datepicker-trigger")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		  //for css of class name if there is space in the value remove the space and keep the dot
		  
		  
		  
		  
		  
		  
		  

	}

}
