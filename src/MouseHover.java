import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@class='_3Ep39l']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Flipkart Plus Zone')]")).click();

		driver.close();
	}

}
