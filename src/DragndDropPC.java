import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragndDropPC {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://react-dropzone.js.org/");
		driver.manage().window().maximize();
		//Actions action= new Actions(driver);
		
		WebElement droparea=driver.findElement(By.xpath("//body[@class='rsg--body-0']//section[@class='rsg--root-8']//section[@class='rsg--root-8']"
				+ "//section[1]//article[1]//div[2]//div[1]//div[1]//section[1]//div[1]"));
	
		
		
		
		
		
		
	}

}
