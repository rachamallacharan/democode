package Day_1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class practiceofrahulshettyacademy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chara\\OneDrive\\Desktop\\Sel_Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//System.out.println(driver.findElement(By.xpath("//h1(contains[text(),'practice page'])")).getText());
		driver.findElement(By.cssSelector("label[for='radio1']")).click();
		
		//Autosuggestive
		driver.findElement(By.id("autocomplete")).sendKeys("INDiA");
		
		//select dropdown
		WebElement dropdown = driver.findElement(By.id("autocomplete"));
		Select select = new Select (dropdown);
		select.selectByIndex(1);
		
		//checkbox
		driver.findElement(By.cssSelector("label[for='bmw']")).click();
		////div/fieldset/label[@for='bmw']/input
		
		//window handles
		driver.findElement(By.id("openwindow")).click();
		 Set<String> windows = driver.getWindowHandles();
		 Iterator<String>it = windows.iterator();
		 String parentId = it.next();
		 String childId = it.next();
		 
		 //Tab handles
		 driver.findElement(By.id("opentab")).click();
		 Set<String> Tabs = driver.getWindowHandles();
		 Iterator<String>Tab = Tabs.iterator();
		 String parentId1 = Tab.next();
		 String childId2 = Tab.next();
		 
		 //ALerts
		 driver.findElement(By.id("name")).sendKeys("charan");
		 driver.findElement(By.id("alertbtn")).click();
		 Alert Alert = driver.switchTo().alert();
		 Alert.accept();
		 
		 //show and hide button
		 driver.findElement(By.id("displayed-text")).sendKeys("charan");
		 driver.findElement(By.id("hide-textbox")).click();
		 System.out.println(driver.findElement(By.id("displayed-text")).isDisplayed());
		 driver.findElement(By.id("show-textbox")).click();
		 System.out.println(driver.findElement(By.id("show-textbox")).isDisplayed());
		 
		 //javascript executor
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,500)", "");
		 
		 //table
		 WebElement table = driver.findElement(By.id("product"));
		List<WebElement> tr = table.findElements(By.xpath("//tr/td[3]"));
		{
			for(int i=0;i<tr.size();i++);
		}
		System.out.println(tr.get(i).getText());
					break;
		 
		
		//mouse hover
		WebElement mousehover = driver.findElement(By.id("mousehover"));
		Actions OActions = new Actions(driver);
		
		OActions.moveToElement(mousehover).build().perform();
		OActions.getFirstSelectedOption();
		
		
		
		 
		 
		 
		 
		
		
		
		
		
	}

}
