package Day_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class locator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name = "Rahul";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chara\\OneDrive\\Desktop\\Sel_Jars\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();  
		      
		// Launch website  
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			try {
				String password = getpassword(driver);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		   driver.get("http://rahulshettyacademy.com/locatorspractice/");
		   driver.findElement(By.id("inputUsername")).sendKeys("Name");
		   driver.findElement(By.name("inputPassword")).sendKeys("password");
		   driver.findElement(By.name("chkboxOne")).click();
		   driver.findElement(By.id("chkboxTwo")).click();
		   driver.findElement(By.className("signInBtn")).click();
		   try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   System.out.println(driver.findElement(By.tagName("p")).getText());
		   String Text = driver.findElement(By.tagName("p")).getText();
		   //Assert.assertEquals(Text, "You are successfully logged in.");
		   //Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+Name+",");
		   driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		   driver.close();
	}     
	
           public static String getpassword(WebDriver driver) throws InterruptedException
    {
           
           driver.get("http://rahulshettyacademy.com/locatorspractice/");
           driver.findElement(By.linkText("Forgot your password?")).click();
           Thread.sleep(3000);
           driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
 		   String passwordtext = driver.findElement(By.className("infoMsg")).getText(); 
 		   //Please use temporary password 'rahulshettyacademy' to Login.
 		   String[] passwordArray = passwordtext.split("'");
 		  //0th index - please use temporary password
 		  //1st index - rahulshettyacademy' to login.
 		  //String[] passwordArray2 = passwordArray[1].split("'");
 		  //oth index - rahulshetty cademy
 		  //1st index = to login.
 		  //String password = passwordArray2[0];
 		  String password = passwordArray[1].split("'")[0];
 		  
 		  return password; 
 		  
    } }     

           
           
           
           
           
