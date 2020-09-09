import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FIleDownloadUsingRobot {

	public static void main(String[] args) throws AWTException, InterruptedException {
System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/download");
		driver.findElement(By.linkText("upload_test2.rtf")).click();
		Robot rb= new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_DOWN);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		
		

}
}
