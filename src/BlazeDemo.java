import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BlazeDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://blazedemo.com/");
		 
		 Select sel = new Select(driver.findElement(By.name("fromPort")));
		 
		 sel.selectByVisibleText("Boston");
		 
		 Select des = new Select(driver.findElement(By.name("toPort")));
		 
		 des.selectByVisibleText("London");
		 
		 driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		 
		 
		
		
		
		}
		 
		 
		 
		 
		 
		 
		 
		
		 
		 
		 

	}


