package Training.TrainigDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void open(){
		System.out.println("Launching Firefox browser..");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\geckodriver.exe");
		//DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		//capabilities.setCapability("marionette", true);
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

}
