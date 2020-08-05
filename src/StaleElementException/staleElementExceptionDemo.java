package StaleElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staleElementExceptionDemo {

	public static void main(String[] args) throws InterruptedException {
		// When we go back and click the button again, the element become
		// stale element, so we need to use try and catch
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jacke\\OneDrive\\Desktop\\DriversForSelenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.pavantestingtools.com/");
		driver.manage().window().maximize();
		WebElement link=driver.findElement(By.linkText("TRAINING"));
		link.click();
		Thread.sleep(5000);
		driver.navigate().back();
		
		try {
			link.click();//the statement caluse the StaleElementReferenceException

		}
		catch(StaleElementReferenceException e) {
			link=driver.findElement(By.linkText("TRAINING"));
			link.click();
		}
		
		System.out.println("done");
	}

}
