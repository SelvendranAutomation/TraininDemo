package Training.TrainigDemo;





import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class FluentWaitTest {
	
	//@Test
	public void test_01(){
		
		
		System.out.println("Launching Chrome browser..");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://test-a3.grouprm.net/index.php");
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(5,  TimeUnit.SECONDS);
		wait.withTimeout(60, TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);

		Function<WebDriver, WebElement> function = new Function<WebDriver, WebElement>()
				{
					public WebElement apply(WebDriver arg0) {
						System.out.println("Checking for the element!!");
						WebElement element = arg0.findElement(By.id("loginUserName"));
						if(element != null)
						{
							System.out.println("Target element found");
						}
						return element;
					}
				};

		wait.until(function);
	 
		
	System.out.println("Title is : "+driver.findElement(By.id("loginUserName")).getAttribute("name"));
			
			driver.close();
	
	}
	@Test
	public void test_02(){
		
		
		System.out.println("Launching Chrome browser..");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://test-a3.grouprm.net/index.php");
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(5,  TimeUnit.SECONDS);
		wait.withTimeout(60, TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);

		Function<WebDriver, WebElement> function = new Function<WebDriver, WebElement>()
				{
					public WebElement apply(WebDriver arg0) {
						System.out.println("Checking for the element!!");
						WebElement element = arg0.findElement(By.id("loginUserName6"));
						if(element != null)
						{
							System.out.println("Target element found");
						}
						return element;
					}
				};

		wait.until(function);
	 
		
	System.out.println("Title is : "+driver.findElement(By.id("loginUserName")).getAttribute("name"));
			
			driver.close();
	
	}
	

}
