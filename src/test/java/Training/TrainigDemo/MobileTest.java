package Training.TrainigDemo;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MobileTest {
	@Test
	public void open(){
		
		
		System.out.println("Mobile Emulator browser..");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\chromedriver.exe");


		WebDriver driver = new ChromeDriver();		
		//WebDriver driver = new ChromeDriver();
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
