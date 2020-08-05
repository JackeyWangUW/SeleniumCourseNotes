package googleSearch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchTest {
	/* Search for "Shanghai" on Google and choose "Shanghai Disneyland Park" */

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\jacke\\OneDrive\\Desktop\\DriversForSelenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Shanghai");
		Thread.sleep(3000);
		List <WebElement> searchlist= driver.findElements(By.xpath("//ul/li/following::div[contains(@class,'sbl1')]"));// bing:   By.xpath("//ul/following::div[@class='sa_tm']")
		//System.out.println(searchlist.size());
		for (int i=0; i<searchlist.size();i++) {
			if(searchlist.get(i).getText().contains("Disney")) {
				searchlist.get(i).click();
			}
		}
		
		
		

	}

}
