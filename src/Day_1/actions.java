package Day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chara\\OneDrive\\Desktop\\Sel_Jars\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.amazon.com/");
		  Actions a=new Actions(driver);
		  a.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		  a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		  a.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).contextClick().build().perform();
		  //Drag and drop handles
		  
		  

	}

}