package Day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chara\\OneDrive\\Desktop\\Sel_Jars\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();  
		  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		  Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		  driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		  boolean status = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
		  System.out.println(status);
		  System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		  Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), "6");
		
		  
		  
		  
		  
		  
	}

}
