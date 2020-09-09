import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginationHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://datatables.net/");
		
		int paginationsize=driver.findElements(By.xpath("//a[@class='paginate_button ']")).size();
	    
		List<String> names= new ArrayList<String>();
		for(int i=1;i<=paginationsize;i++) {
			String paginationselector="//a[@class='paginate_button ']";
			driver.findElement(By.xpath(paginationselector)).click();
			WebElement Names=driver.findElement(By.xpath("//table[@id='example']/tbody/tr/td[1]"));
		}
		
		}
		
	}

