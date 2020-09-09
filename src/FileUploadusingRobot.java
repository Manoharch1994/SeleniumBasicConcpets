import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadusingRobot {

	public static void main(String[] args) throws AWTException {
System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		// Specify the file location with extension
		StringSelection sel=new StringSelection("‪C:\\Users\\MANOHAR CH\\Desktop\\data.txt.txt");
		 // Copy to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		 System.out.println("selection" +sel);
		 
		
		

	}

}
