package Day_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class todapractics3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chara\\OneDrive\\Desktop\\Sel_Jars\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.brandcrowd.com/s/logo-maker?code=25offsem&msclkid=1187bb216ff31680a9ced8d75ce36b06&utm_source=bing&utm_medium=cpc&utm_campaign=India%3A%2004.%20Services%3A%20Logo-GI221121&utm_term=logo%20generator&utm_content=%5BMaker%5D%20Logo%20Generator%5BE%5D");	
		driver.manage().window().maximize();
		Thread.sleep(1000);
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("acceptInsecureCerts", "true");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("marketing",Keys.ENTER);
//		Bussinessname.sendKeys("marketing");
//		Bussinessname.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement logos = driver.findElement(By.id("search-modal-keywords"));
		logos.sendKeys("charangadu");
		Thread.sleep(2000);
		WebElement continuebutton = driver.findElement(By.xpath("(//span[@class='tw-flex']/child::span[@class='tw-text-base tw-py-4 tw-pl-8 tw-pr-4 tw-font-sans tw-mr-auto tw-w-full tw-text-center tw-block'])[2]"));
		continuebutton.click();
		Actions OAction = new Actions(driver);
		OAction.moveToElement(driver.findElement(By.xpath("(//a[@class='menu-link tw-text-white tw-flex tw-items-center tw-text-sm menu-link--has-arrow'])[1]"))).build().perform();
		driver.findElement(By.xpath("(//a[contains(text(),'Doctor')])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//strong[@class='tw-align-middle tw-mr-0.5']")).click();
        Select dropdown = new Select(driver.findElement(By.xpath("//select[name='LogoStyle']")));
		dropdown.selectByIndex(2);
		List<WebElement> productslisting = driver.findElements(By.xpath("(//input[@data-id='js-drop-checkbox'])[1]"));
		WebElement finalproduct = productslisting.stream().filter(product->product.findElement(By.xpath("//input[@id='Modern(Sans)']")).getText().equalsIgnoreCase("Modern(Sans)")).findFirst().orElse(null);
		finalproduct.findElement(By.xpath("//span[@class='checkbox__unchecked']")).click();
//		clicksearchbar clicksearch = new clicksearch();
		 WebElement newbar = driver.findElement(By.xpath("//button[@fdprocessedid='ksdx5k']"));
		 newbar.click();
//		clicksearch.searcbutton(driver);
		
		//span[@class='checkbox']/child::input[@id='Modern(Sans)']
		
//		public void searchbutton(WebElement driver);
//		{
//		  WebElement newbar = driver.findElement(By.xpath("//button[@fdprocessedid='ksdx5k']"));
//		  newbar.click();
//		 return newbar;
//		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
