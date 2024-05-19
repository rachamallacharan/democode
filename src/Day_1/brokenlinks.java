package Day_1;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class brokenlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chara\\OneDrive\\Desktop\\Sel_Jars\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();	
		  driver.get("htpps://rahulshettyacademy.com/AutomationPractice/");
		  List<WebElement> linkTotals = driver.findElements(By.tagName("a"));
		 for(WebElement URL : linkTotals);	  
		 String ALLlinks=URL.getAttribute("href");
		 HttpURLConnection conn= (HttpURLConnection)new URL(ALLlinks).openConnection();
		 conn.setRequestMethod("HEAD");
		 conn.connect();
		 System.out.println(conn.getResponseCode());
		 {
		  if(conn.getResponseCode()>400)
			 {
			  System.outprintln(URL.getText()+"is not a valid link+" +conn.getResponseCode());
			 }
		  else {
			 	System.out.println(URL.getText()+"is a valid link" +conn.getResponseCode());
		 }
		  
				  
		private static Object getResponseCode(WebElement link) {		  
			return null;
		
		
		
		
		
		
		

	}

}
