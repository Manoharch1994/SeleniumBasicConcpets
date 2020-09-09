import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
	driver.findElement(By.xpath("//a[@class='black']")).click();
	
	Set<String> handler=driver.getWindowHandles();
	
	Iterator<String> it=handler.iterator();
	String Parentwindowid= 	it.next();
	System.out.println("parent window id:"+Parentwindowid);
	
	String Childwindowid=it.next();
	System.out.println("parent window id:"+Childwindowid);
	
	driver.switchTo().window(Childwindowid);
	System.out.println("child window popup title is"+driver.getTitle());
	driver.close();
	driver.switchTo().window(Parentwindowid);
	System.out.println("child window popup title is"+driver.getTitle());
	driver.close();
	
	
	}

}
