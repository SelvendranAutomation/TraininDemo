package Training.TrainigDemo;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DayEleven {
 
	
	
	 @Test
		public void test_01(){
			
			
			System.out.println("Launching Chrome browser..");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			
			driver.navigate().to("http://test-a3.grouprm.net/index.php");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	

			System.out.println("Title is : "+driver.getTitle());
			
			driver.close();
			
			
			
		}
	

	// @Test
	public void test_02(){
		
		
		System.out.println("Launching Chrome browser..");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://test-a3.grouprm.net/index.php");
		

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	

		System.out.println("Title is : "+driver.getTitle());
		
		driver.close();
		
		
		
	}
	
	 //@Test
		public void test_03(){
			
			
			System.out.println("Launching Chrome browser..");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			
			driver.get("http://test-a3.grouprm.net/index.php");
			

			WebDriverWait wait=new WebDriverWait(driver,220);			
			wait.until( ExpectedConditions.visibilityOfElementLocated(By.id("loginUserName")));		

			System.out.println("Title is : "+driver.findElement(By.id("loginUserName")).getAttribute("name"));
			
			driver.close();
			
			
			
		}

	 @Test
		public void test_04(){
			
			
			System.out.println("Launching Chrome browser..");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			
			driver.get("http://test-a3.grouprm.net/index.php");
			


			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
			wait.pollingEvery(250, TimeUnit.MILLISECONDS);
			wait.withTimeout(2, TimeUnit.MINUTES);
			wait.ignoring(NoSuchElementException.class);



			 




			
			 
			System.out.println("Title is : "+driver.findElement(By.id("loginUserName")).getAttribute("name"));
			
			driver.close();
			
			
			
		}

}
