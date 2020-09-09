import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WIndowScrolling {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://demo.guru99.com/test/guru99home/");
	driver.manage().window().maximize();
	WebElement element=driver.findElement(By.xpath("//a[text()='LIVE TESTING']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	Thread.sleep(2000);
	element.click();
	 
	
	
	
	


	}

}
