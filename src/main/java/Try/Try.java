package Try;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FirefoxDriver driver = new FirefoxDriver();
		
		
		driver.get("https://the-internet.herokuapp.com/hovers");

	}

}
