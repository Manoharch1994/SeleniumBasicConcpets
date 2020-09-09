import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertwithOKbutton {

	public static void main(String[] args) {
		
		//alert with ok button
			System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
	
			WebDriver driver= new ChromeDriver();
			driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		String alerttext=driver.switchTo().alert().getText();

		driver.switchTo().alert().accept();
		System.out.println(alerttext);
		driver.quit();
		

	}

}
