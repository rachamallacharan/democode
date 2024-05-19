package Day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class todaypractise2 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chara\\OneDrive\\Desktop\\Sel_Jars\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://phptravels.com/demo/");	
		  driver.manage().window().maximize();
		  System.out.println(driver.getTitle());
		  
		  //Element locators
		  WebElement Firstname = driver.findElement(By.xpath("//input[@type='text'])[1]"));
		  WebElement Lastname = driver.findElement(By.xpath("//*[contains(@class ,'last_name')]"));
		  WebElement Bussinessname = driver.findElement(By.xpath("//*[contains(@class ,'last_name')]/following-sibling::input[@class='business_name input mb1']"));
		  WebElement Email = driver.findElement(By.cssSelector("div[class='form'] input:nth-child(4)"));
		
		//sendkeys
		  Firstname.sendKeys("charan");
		  Lastname.sendKeys("tej");
		  Bussinessname.sendKeys("Ashacharancompany");
		  Email.sendKeys("Ashacharan@gmail.com");
		  
		  //captcha
		//  int firstletter =Integer.parseInt(driver.findElement(By.id("numb1")));
		 int captcha = Integer.parseInt(driver.findElement(By.xpath("//span[@id='numb1']")).getText());
		 int captchasecond = Integer.parseInt(driver.findElement(By.xpath("//span[@id='numb2']")).getText());
	//	 WebElement captch2= driver.findElement(By.xpath("//span[@id='numb2']"));
//	//	  WebElement captcha = captch1.adds(captch2);
		  int Totalsum = captcha+captchasecond;
		 WebElement box = driver.findElement(By.xpath("//input[@type='text']"));
		 int emptybox = box.sendKeys(Totalsum);
		 
		
	
		
		
		
		
		
		
		
	}

}
