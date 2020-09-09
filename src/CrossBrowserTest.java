import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class CrossBrowserTest {
	public WebDriver driver;

	public void TestCase1(String browser) {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");

	}
	
	
	
	
}

