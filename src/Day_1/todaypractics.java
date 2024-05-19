package Day_1;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.http.ConnectionFailedException;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class todaypractics {

	public static void main(String[] args) throws InterruptedException, WebDriverException, IOException,JavascriptException ,ConnectionFailedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chara\\OneDrive\\Desktop\\Sel_Jars\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
//		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.website.com/sign-in/?source=SC&country=IN");	
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
//		  System.out.println(driver.findElement(By.xpath("//a[@title='Website.com Website Builder']")));
		  System.out.println(driver.getTitle());
//		  JavascriptExecutor js = (JavascriptExecutor)driver;
//		  js.executeScript("document.getElementByID('username').value ='Ashacharan@gmail.com';");
		  driver.findElement(By.id("webmailFunction")).click();
		  WebElement Username = driver.findElement(By.xpath("//input[contains(@type,'text')]"));
		  Username.sendKeys("charantej@gmail.com");
		  WebElement Password = driver.findElement(By.xpath("//input[starts-with(@class,'mdl') and @type='password']"));
		  Password.sendKeys("charantej");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//a[@id='support-contactus']")).click();
          driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
          driver.findElement(By.xpath("//a[@id='support-contactus']")).click();
          JavascriptExecutor js1 = (JavascriptExecutor)driver;
          js1.executeScript("window.scrollBy(0,2000)");
          Thread.sleep(2000);
          List<WebElement>Footerlinks = driver.findElements(By.xpath("//li[@class='columns col1']"));
		  for(WebElement suggestedlinks : Footerlinks){
		 String adjustedlinks = suggestedlinks.getText();  
		 System.out.println(adjustedlinks);
		  }
		  Thread.sleep(1000);
		  Actions oaction = new Actions(driver);
		  oaction.moveToElement(driver.findElement(By.xpath("//ul[@id='site-menu']/child::li[6]"))).build().perform();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//div[@class='img i2']")).click();
		  // windows used for youtube redirect
		  Set<String> window =driver.getWindowHandles();
		  Iterator<String> Nextwindow = window.iterator();
		  String Parentwindow = Nextwindow.next();
		  String childwindow = Nextwindow.next();
		  driver.switchTo().window(childwindow);
//		  String mainWindowHandle = driver.getWindowHandle();
//	      Set<String> allWindowHandles = driver.getWindowHandles();
//	      Iterator<String> iterator = allWindowHandles.iterator();

//	        // Here we will check if child window has other child windows and will fetch the heading of the child window
//	        while (iterator.hasNext()) {
//	            String ChildWindow = iterator.next();
//	                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
//	                driver.switchTo().window(ChildWindow);
		  Thread.sleep(5000);
		  System.out.println(driver.getTitle());
//		  WebDriverWait wait = new WebDriverWait(driver,20);
//		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@role='combobox']")));
		  WebElement Searchbar = driver.findElement(By.xpath("//input[@id='search']"));
		  Thread.sleep(1000);
//		  Searchbar.click();
		  Searchbar.sendKeys("HYR");
		  Thread.sleep(2000);
//		  WebElement searchicon = driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-searchbox'])[1]"));
//		  searchicon.click();
		  Thread.sleep(2000);
		  WebElement threedots = driver.findElement(By.id("guide-icon"));
		  threedots.click();
		  Thread.sleep(2000);
		 WebElement home = driver.findElement(By.xpath("(//yt-icon[contains(@class,'guide-icon style-scope ytd-guide-entry-renderer')])[1]"));
		 home.click();
		 Thread.sleep(2000);
		 driver.switchTo().window(Parentwindow);
		 System.out.println(driver.getTitle());
		 driver.findElement(By.xpath("(//a[@title='Register a Domain Name'])[2]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='domain-name']")).sendKeys("Ashaandcharan");
		 driver.findElement(By.xpath("(//button[@id='domain-search-button'])[1]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[@id='support-contactus']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@class='button']/child::a[contains(@href,'https://www.website.com/case-tracker/new-case/')]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@name='SenderName']")).sendKeys("Ashabangaram");
		 oaction.moveToElement(driver.findElement(By.xpath("//ul[@id='site-menu']/child::li[6]"))).build().perform();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@title='Learn How To Track Site Traffic']")).click();
		 Thread.sleep(1000);
		 TakesScreenshot srcfile = (TakesScreenshot)driver;
		 FileUtils.copyFile(srcfile.getScreenshotAs(OutputType.FILE),new File("D:\\.png"));	 
		 driver.findElement(By.cssSelector("a[href='https://www.google.com/analytics/#?modal_active=none']")).click();
		 System.out.println(driver.getTitle());
		  
		 
				 
			  
          
          
		
		
		
		

	}

	

}
