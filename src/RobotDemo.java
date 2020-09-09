import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotDemo {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.findElement(By.id("target"));
		Robot r =new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_UP);
		
	
		
		

	}

}
