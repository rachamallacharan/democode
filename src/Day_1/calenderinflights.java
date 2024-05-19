package Day_1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderinflights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chara\\OneDrive\\Desktop\\Sel_Jars\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.path2usa.com/travel-companions");
		  //August 23
		  WebElement calender = driver.findElement(By.xpath("//*[@id='travel_date']"));
		  calender.click();
		  while(!driver.findElement(By.cssSelector("[class='date-picker-days'][class='datepicker-switch']")).getText().contains("April"))
			  //while loop keeps onexecuting until it becomes false simillarly in above step we have used !false=true
		  {
		   driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']").click();
		  }
		  List<WebElement> dates = driver.findElements(By.className(".day"));
		  //grab the common attribute and put into list and itearate
		  int count=driver.findElements(By.className("day")).size();
		  for(int i=0;i<count;i++)
		  {
			  String text=driver.findElements(By.className("day")).get(i).getText();
			  if(text.equalsIgnoreCase("23"))
			  {
				  driver.findElements(By.className(".day")).get(i).click();
                  break;
			  }
		  }
		  
		  
		  
		  
	}
		
		
		
		
		
		
		
		
		

	}

}
