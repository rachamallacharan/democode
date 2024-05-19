package Day_1;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class synchronisation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chara\\OneDrive\\Desktop\\Sel_Jars\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 // WebDriverWait w =new WebDriverWait(driver,5);
	  //implicity wait 
		  //hey wait for n number of seconds before you throw exception
		 // if it is loaded before 5 sec it shows result
		//performance issues can be neglected by explicit wait
		  //explicit wait
		 // 15 sec---specific to all location hotel search
		  
		  //thread.sleep
		  
		  int j=0;
		  String[] itemsNeeded = {"Cucumber","Brocolli"};
		  driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		  Thread.sleep(3000);
		  addItems(driver,itemsNeeded);
		  //base b= new base();
		 // b.addItems(driver,itemsNeeded);
		  driver.findElement(By.cssSelector("img[alt='cart'[")).click();
		  driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		  driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		  driver.findElement(By.cssSelector("button.promoBtn")).click();
		  //explicit wait
		 
		 // w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		//until visible of promocode this element will b waited this method is only for particular locator for mentioned time)  
		  System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		  
		  //fluent wait //
		  //10 seconds , polling 4 sec,(it will check for every 4th second)
		  //your card is accepted(3sec) , your order is being(7th sec)-processed-confirmation
		 
		  
		  
		
		
		
		

	}
	
	      private static void addItems(WebDriver driver,String[] itemsNeeded)
		// TODO Auto-generated method stub
		//public static void additems(webdriver driver,string[] itemsNeeded)
	      {
	      int j=0;
List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		  
		  for(int i=0;i<products.size();i++)
		  {
			  
			  //brocolli - 1 kg
		  String[] name=products.get(i).getText().split("-");
		  //name[0] will be brocolli
		  //name[1] will be 1 kg because we are separted based on hypen
		  String formattedName=name[0].trim();
		  
		  //conversion of array into arraylist for easy search
		  // check whether name you extracted is present in array list or not
		  List itemsNeededList = Arrays.asList(itemsNeeded);
		 
		  if(itemsNeededList.contains(formattedName))
		  {
			  j++;
		 driver.findElements(By.xpath("//div[@class='product-action/button']")).get(i).click();
			  //intially
			 // break;(as we are using arraylist so we should not use braek statement beacause iteration of itemsneeded is not possible as we have more than 1 product,but with help of j we can follow a break method)			  
			  
			  if(j==itemsNeeded.length)
				  //we use length()method to get size of array and we use size() method to get size of array list
			  {
				  break;
			  }
		  }}}

		  }