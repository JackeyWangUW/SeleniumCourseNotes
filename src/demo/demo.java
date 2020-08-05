package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\jacke\\OneDrive\\Desktop\\DriversForSelenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");

	}

}
