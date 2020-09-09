import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Tooltip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
	
		driver.get("http://demo.guru99.com/test/social-icon.html");
		
		String expectedtooltip="Github";
	WebElement github=	driver.findElement(By.xpath("//div[@class='soc-ico show-round']/a[4]"));
	
    String actualTooltip = github.getAttribute("title");	
    System.out.println(actualTooltip);
    
Assert.assertEquals(actualTooltip, expectedtooltip);
	
	
	
	
	
		
	
	}

}
