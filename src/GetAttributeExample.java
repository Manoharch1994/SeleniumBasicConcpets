import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement searchTextBox=driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']"));
		String searchboxvalue=searchTextBox.getAttribute("name");
		System.out.println("the button name is:"+searchboxvalue);
		

		

}
}
	