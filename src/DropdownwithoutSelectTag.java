import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownwithoutSelectTag {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();

		driver.manage().window().maximize();
	List<WebElement> alloptions=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu'] /li"));
		System.out.println(alloptions);
			
	for(WebElement option : alloptions) {
	    if (option.getText().equals("Java")) {
	        option.click();
	    
	    }
	    
	    
	    
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	










}
}







