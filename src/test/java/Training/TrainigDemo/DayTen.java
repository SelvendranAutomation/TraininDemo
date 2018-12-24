package Training.TrainigDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DayTen {
 

	//@Test
	public void test_01(){
		
		
		System.out.println("Launching Chrome browser..");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://test-a3.grouprm.net/index.php");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait=new WebDriverWait(driver,300);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id=loginUserName]")));
		
		
		driver.findElement(By.cssSelector("input[id=loginUserName]")).sendKeys("selvendranr@gmail.com");
		driver.findElement(By.cssSelector("input[id=loginUserPassword]")).sendKeys("Infi@123456");
		driver.findElement(By.cssSelector("input[id=login]")).click();
	
		wait=new WebDriverWait(driver,300);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p[class=welcome]")));
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.id("newbooking")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Adhoc group request")).click();
		
		
		wait=new WebDriverWait(driver,300);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("requestGroupName")));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("travelDateDisplay0")).click();
		 
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<WebElement> li=driver.findElements(By.cssSelector("table[class='ui-datepicker-calendar'] tr td"));
		
		for(WebElement we:li){
			
			if(we.getText().equals("15")){
				driver.findElement(By.linkText("15")).click();
				break;
			}
			
		}
		
		
		
		
	}
	
	
	@Test
	public void test_02(){
		
		
		System.out.println("Launching Chrome browser..");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://b2clbtest.agencyauto.net/#/aG9tankwRWVQYWdlMw==");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait=new WebDriverWait(driver,300);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id='depFrom0']")));
		
			
		driver.findElement(By.id("depFrom0")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("depFrom0")).sendKeys("Chennai");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[contains(.,'"+"Chennai"+"')]")).click();
		
		driver.findElement(By.id("depTo0")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("depTo0")).sendKeys("Delhi");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[contains(.,'"+"Delhi"+"')]")).click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.id("onwardDate0")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select select=new Select(driver.findElement(By.className("ui-datepicker-year")));
			
			select.selectByValue("2019");
	
		 
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		select=new Select(driver.findElement(By.className("ui-datepicker-month")));
		
		select.selectByVisibleText("May");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		List<WebElement> li=driver.findElements(By.cssSelector("table[class='ui-datepicker-calendar'] tr td"));
		
		for(WebElement we:li){
			
			if(we.getText().equals("15")){
				driver.findElement(By.linkText("15")).click();
				break;
			}
			
		}
		
		
		
		
	}

}
