package RobotAPI;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class robotAPIdemo {

	public static void main(String[] args) throws AWTException {
		// Use DOWN ARROW, TAB and ENTER button to download file
		// Only can be used in firefox browser
		System.setProperty("webdriver.gecko.driver","C:\\Users\\jacke\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://spreadsheetpage.com/index.php/site/file/yearly_calendar_workbook");//404
		driver.findElement(By.xpath("")); //select "download file"
		// Let the keyboard do something
		Robot robot=new Robot();
		// press down arrow in keyboard
		robot.keyPress(KeyEvent.VK_DOWN);
		// press 3 times TAB botton
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		// press ENTER button
		robot.keyPress(KeyEvent.VK_ENTER);
	
		
		
		
		
		
		
		
		
		
	}

}
