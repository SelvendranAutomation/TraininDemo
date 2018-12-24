package Training.TrainigDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DayEight {
	
	
	//@Test
	public void test_01(){
		
		System.out.println("Launching Chrome browser..");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/frame.html");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<WebElement> frameList=driver.findElements(By.tagName("iframe"));
		
		System.out.println("No of frames are :"+frameList.size());
		
		
		driver.switchTo().frame(0);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.id("Click")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(driver.findElement(By.id("Click")).getText());
	
	}
	//@Test
	public void test_02(){
		
		System.out.println("Launching Chrome browser..");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://toolsqa.com/iframe-practice-page/");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
		List<WebElement> frameList=driver.findElements(By.tagName("iframe"));
		
		System.out.println("No of frames are :"+frameList.size());
		
		
		driver.switchTo().frame("IF1");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions act=new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		 
		
		driver.findElement(By.name("firstname")).sendKeys("Test name ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(driver.findElement(By.name("firstname")).getAttribute("value"));
	
	}
	
	
	
	@Test
	public void test_03(){
		
		System.out.println("Launching Chrome browser..");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://toolsqa.com/iframe-practice-page/");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
		List<WebElement> frameList=driver.findElements(By.tagName("iframe"));
		
		System.out.println("No of frames are :"+frameList.size());
		
		
		driver.switchTo().frame("IF1");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions act=new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		 
		
		driver.findElement(By.name("firstname")).sendKeys("Test name ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(driver.findElement(By.name("firstname")).getAttribute("value"));
		
		
		driver.switchTo().defaultContent();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.name("email")).sendKeys("test@test.com");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("input[value='Subscribe']")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
