import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/iframe");
		driver.switchTo().frame("mce_0_ifr");
		driver.findElement(By.id("tinymce")).sendKeys("this is test content");
		Thread.sleep(2000);
		driver.quit();
	}

}
