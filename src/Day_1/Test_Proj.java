package Day_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Proj {
	
	  public static void main(String[] args)throws InterruptedException {  
	        
		    // declaration and instantiation of objects/variables  
		   // System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");  
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\chara\\OneDrive\\Desktop\\Sel_Jars\\chromedriver_win32\\chromedriver.exe");
  
		  WebDriver driver=new ChromeDriver();  
		      
		// Launch website  
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		   driver.get("http://rahulshettyacademy.com/locatorspractice/");
		   driver.findElement(By.id("inputUsername")).sendKeys("charan");
		   driver.findElement(By.name("inputPassword")).sendKeys("charan@205");
		   driver.findElement(By.name("chkboxOne")).click();
		   driver.findElement(By.id("chkboxTwo")).click();
		   driver.findElement(By.className("signInBtn")).click();
		   ///for classname locators half name is enough but for other than this we need to mention both names like for css , xpath etc ( submit signbtn)
		   String Text = driver.findElement(By.cssSelector("p.error")).getText();
		   System.out.println(Text);
		   driver.findElement(By.linkText("Forgot your password?")).click();
		   //for link text the tag name will be "a"
		   //along with parent to child tags you can use attribute = value also -- //div[@class='forgot-pwd-btn-container']/button[1]
		   Thread.sleep(3000);
		   WebElement Name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		   Name.sendKeys("charanteja");
		   WebElement Email = driver.findElement(By.xpath("//input[@placeholder='Email']"));
		  // //  or  //input[@type='text'][2] this is the one of the method by index or for css - input[type='text']:nth-child[2] -- indexing method
		   Email.sendKeys("charanroyaleee@gmail.com");
		   WebElement Mblenumber = driver.findElement(By.xpath("//input[@placeholder='Phone Number']"));
		   // "//form/input[3]" (//parentTagname/childTagName)-- parent to child tags for Xpath , for css path parentTagname childTagname
		   Mblenumber.sendKeys("789888888888");
		  // WebElement Mblenumber = driver.findElement(By.xpath("//form/input[3]"));
		  // Mblenumber.sendKeys("789888888888");
		  driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		  driver.findElement(By.className("infoMsg")).getText();
		  System.out.println(driver.getTitle());
		  driver.findElement(By.className("go-to-login-btn")).click();
		  Thread.sleep(1000);
		   driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		   driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		   //// other method is input[type* = "pass"]-- if star is kept for attribute with simple word like - with the help of half word like pass for password we can able to identify the term
		   //driver.findElement(By.name("chkboxOne")).click();
		   //driver.findElement(By.id("chkboxTwo")).click();
		   driver.findElement(By.className("signInBtn")).click();
		   //   //button[contains(@class,'submit')] button is tagname
		   driver.findElement(By.xpath("//div/h2")).getText();
		   
		          
		      
		      
		    }  

}
