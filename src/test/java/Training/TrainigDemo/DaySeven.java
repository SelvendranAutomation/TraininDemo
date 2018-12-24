package Training.TrainigDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DaySeven {
	
	//@Test
	public void test_01(){
		
		System.out.println("Launching Chrome browser..");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/table.html");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//table/tbody/tr[4]/td[3]/input")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
	}
	
	
	//@Test
	public void test_02(){
		
		System.out.println("Launching Chrome browser..");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/table.html");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//table/tbody/tr[position()=2]/td[position()=last()]/input")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
	}
	
	//@Test
	public void test_03(){
		
		System.out.println("Launching Chrome browser..");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-table/");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr/td[text()='Taiwan']")).getText());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
	}
	
	
	//@Test
	public void test_04(){
		
		System.out.println("Launching Chrome browser..");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.id("alert")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().alert().accept(); 
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
	
	//@Test
	public void test_05(){
		
		System.out.println("Launching Chrome browser..");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.id("alert")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Alert alt=driver.switchTo().alert(); 
		
		System.out.println(alt.getText());
		
		alt.dismiss();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
	
	
	@Test
		public void test_06(){
			
			System.out.println("Launching Chrome browser..");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			
			driver.get("http://toolsqa.com/automation-practice-switch-windows/");
						
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.navigate().refresh(); 

			
			Actions act=new Actions(driver);
			act.sendKeys(Keys.DOWN);

			driver.findElement(By.id("timingAlert")).click();
			
			WebDriverWait wait=new WebDriverWait(driver,60);
			wait.until(ExpectedConditions.alertIsPresent());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Alert alt=driver.switchTo().alert(); 
			
			System.out.println(alt.getText());
			
			alt.accept();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.close();
		}
}
