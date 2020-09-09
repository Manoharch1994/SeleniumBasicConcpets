import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SslFirefox {

	public static void main(String[] args) {
		DesiredCapabilities cap=DesiredCapabilities.firefox();

		//FirefoxProfile fs=new FirefoxProfile();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.get("https://cacert.org/");		
		
	

	}

}
