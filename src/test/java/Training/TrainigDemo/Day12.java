package Training.TrainigDemo;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class Day12 {
	
	//@Test
	public void test_01(){
		
		System.out.println("Launching Chrome browser..");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://test-a3.grouprm.net/index.php");
		
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.pollingEvery(5,  TimeUnit.SECONDS);
		wait.withTimeout(60, TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);
		
		
		Function<WebDriver, WebElement> function = new Function<WebDriver, WebElement>()
				{
					public WebElement apply(WebDriver arg2) {
						System.out.println("Checking for the element!!");
						WebElement element = arg2.findElement(By.id("loginUserName"));
						if(element != null)
						{
							System.out.println("Target element found");
						}
						return element;
					}
				};

		wait.until(function);
		
		
		
		System.out.println("Name attribute value " +driver.findElement(By.id("loginUserName")).getAttribute("name"));
	
		
		
		
	}
	
	
	
	//@Test
	public void test_02(){
		
		System.out.println("Launching Chrome browser..");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		WebDriverWait wait=new WebDriverWait(driver,220);			
		wait.until( ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[src='images/edit.png']")));		

		
		driver.findElement(By.cssSelector("img[src='images/edit.png']")).click();
		
		try{
		driver.switchTo().alert().accept();
		}catch(NoAlertPresentException e){
			
			System.out.println("No alert present");
		}
		
		driver.findElement(By.id("email")).sendKeys("Testing "); 
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try{
		driver.findElement(By.cssSelector("img[src='images/button.png']")).click();
		}catch(NoSuchElementException e){
			
			System.out.println("Button not present");
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		driver.quit();
		
	}
	
	
	@Test
	public void test_03(){
		
		System.out.println("Launching Chrome browser..");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		WebDriverWait wait=new WebDriverWait(driver,220);			
		wait.until( ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[src='images/edit.png']")));		

		
		driver.findElement(By.cssSelector("img[src='images/alert.png']")).click();
		
		
		try{
		wait=new WebDriverWait(driver,30);			
		wait.until( ExpectedConditions.alertIsPresent());		
		}catch(TimeoutException e){
			
			System.out.println("Time out");
		}
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		try {
			Thread.sleep(1000);
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
		
		
		driver.quit();
		
	}


}
