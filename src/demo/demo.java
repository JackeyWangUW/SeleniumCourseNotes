package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class demo {

	public static void main(String[] args) {
		WebDriver driver=new HtmlUnitDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
