package StaleElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaleElementExceptionDemo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\jacke\\OneDrive\\Desktop\\DriversForSelenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("txtUsername"));
		WebElement password=driver.findElement(By.id("txtPassword"));
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		driver.navigate().refresh();
		try {
		username.sendKeys("Admin");     //this is the step that cause stale element and throw the StaleElementReferenceException 
		password.sendKeys("admin123");  //this is the step that cause stale element and throw the StaleElementReferenceException 
		
		}
		catch(StaleElementReferenceException e) {
			username=driver.findElement(By.id("txtUsername"));
			password=driver.findElement(By.id("txtPassword"));
			username.sendKeys("Admin");
			password.sendKeys("admin123");	
		}

		
		
		
		
		
		

	}

}
