import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAllValues {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.qaautomated.com/");
		//WebElement selectElement = driver.findElement(By.xpath("//a[contains(text(),'Mobile Test Automation')]"));
		 List<WebElement> allSuggestions = driver.findElements(By.xpath("//a[contains(text(),'Mobile Test Automation')]"));      
        for (WebElement suggestion : allSuggestions)
     {
        System.out.println(suggestion.getText());

        }

	}

}

