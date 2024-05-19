package Day_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Proj_1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chara\\OneDrive\\Desktop\\Sel_Jars\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://selenium.dev");
		driver.navigate().to("www.javatpoint.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
