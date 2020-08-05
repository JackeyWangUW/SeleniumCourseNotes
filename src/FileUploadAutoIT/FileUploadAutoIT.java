package FileUploadAutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadAutoIT {

	public static void main(String[] args) throws IOException, InterruptedException {
		/* TEST CASE: add new employee under "PIM"-->"Add Employee"
		 * Use AutoIT !!!
		  */
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jacke\\OneDrive\\Desktop\\DriversForSelenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\jacke\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		Actions action=new Actions(driver);
		WebElement pim=driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/a/b"));
		WebElement addEmp=driver.findElement(By.xpath("//*[@id=\"menu_pim_addEmployee\"]"));
		action.moveToElement(pim).moveToElement(addEmp).click().build().perform();
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Jackey");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Claiborne");
		driver.findElement(By.xpath("//*[@id=\"employeeId\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"employeeId\"]")).sendKeys("21");
		
		WebElement choosefile=driver.findElement(By.xpath("//*[@id=\"photofile\"]"));
		action.click(choosefile).build().perform(); //Don't forget the build().perform()!!!!!!!!!!!!!!!!!!
		
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C://Users//jacke//OneDrive//Desktop//AutoITFile//imployee.exe");

	
	
		
     
		
		

		
		
		
		
		
		
		

	}

}
