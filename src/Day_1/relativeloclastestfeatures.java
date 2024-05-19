package Day_1;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class relativeloclastestfeatures {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chara\\OneDrive\\Desktop\\Sel_Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://rahulshettyacademy.com/angularpractice/");
		WebElement nameEditBox=driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		//same as for below
		WebElement rdb = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());
		//switching windows
		driver.switchTo().newWindow(WindowType.TAB);
		
		//separte window or tab is opened and it will be empty like without url like child window
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentWindowid = it.next();
        String childWindow = it.next();
        driver.switchTo().window(childWindow);
        driver.get("https://rahulshettyacademy.com/");
        String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p]")).get(1).getText();
        driver.switchTo().window(parentWindowid);
       WebElement Name = driver.findElement(By.cssSelector("[name='name']"));
       Name.sendKeys(courseName);
        // screenshot
        File file = Name.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("D:\\"));
        
        //Getheight and width
        System.out.println(Name.getRect().getDimension().getWidth());
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
