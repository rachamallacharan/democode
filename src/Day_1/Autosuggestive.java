package Day_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chara\\OneDrive\\Desktop\\Sel_Jars\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();  
		  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		  WebElement Autosuggest = driver.findElement(By.id("autosuggest"));
		  Autosuggest.sendKeys("ind");
		  Thread.sleep(3000);
		  List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		  
		  for(WebElement data :options)
		  {
			 if(data.getText().equalsIgnoreCase("india"))
			 {
				 data.click();
				 break;
		  }}
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
