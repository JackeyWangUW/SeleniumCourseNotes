package datePick;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePickerDemo1 {

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jacke\\OneDrive\\Desktop\\DriversForSelenium\\chromedriverwin32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.expedia.com");
		String monthyear="Oct 2020";
		String day="14";
		driver.findElement(By.xpath("//input[@id='hotel-checkin-hp-hotel']")).click();
		
		System.out.println(driver.findElement(By.xpath("//caption[contains(text(),'Aug 2020')]")).getText());
		
//		while (!driver.findElement(By.xpath("//caption[contains(text(),'Aug 2020')]")).getText().equals(monthyear)) {
//			driver.findElement(By.xpath("//button[@class='datepicker-paging datepicker-next btn-paging btn-secondary next']")).click();
//		}
		// Capture all the dates. Need to take a close look at the xpath and figure out how to select all the days.
//		List <WebElement> alldays=driver.findElements(By.xpath("//div[contains(@class,'tabs-container col')]//div[2]//table[1]//tbody[1]//tr//td"));

		//		for(WebElement e:alldays) {
//			e.getText()
//		}
//			
		
	
	}

}
