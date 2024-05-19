package Day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chara\\OneDrive\\Desktop\\Sel_Jars\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();  
		  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		  WebElement element = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
		  Select dropdown = new Select(element);
		  dropdown.selectByIndex(2);
		  //System.out.println(dropdown.getFirstSelectedOption().getText()); /// - getfirstselectedoption means need to know what option have selected in the dropdown
		 driver.findElement(By.id("divpaxinfo")).click();
		 Thread.sleep(1000);
		 //driver.findElement(By.id("hrefIncAdt")).click();
		 //driver.findElement(By.id("hrefIncAdt")).click();
		 // or 
		 // int i = 1;
		// while(i<5)
		 {
			 driver.findElement(By.id("hrefIncAdt")).click(); 
		//	 i++;
		 }
		 for(int i = 1;i<5;i++);
				 {
					 driver.findElement(By.id("hrefIncAdt")).click(); 
				 }
		   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());	 
		   driver.findElement(By.id("btnclosepaxoption")).click();
		  //WebElement calender = driver.findElement(By.className("ui-datepicker-trigger"));
		  //calender.click();
		  //WebElement datepicker = driver.findElement(By.partialLinkText("#"));
		 // datepicker.click();
		  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		  driver.findElement(By.xpath("//a[@value ='BLR']")).click();
		  Thread.sleep(1000);
		 driver.findElement(By.xpath("(//a[@value ='MAA'])[2]")).click();
		 //driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value ='MAA']")).click();
		 
		 
		// driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		  
		  
		 
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
