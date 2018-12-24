package Training.TrainigDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DayFive {
	
	
	//@Test
	public void test_01(){
		
		System.out.println("Launching Chrome browser..");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://test-tr.grouprm.net/index.php");
		
		String s1=driver.getTitle();
		
		if("Group bookings | Flyscoot".equals(s1)){
			System.out.println("Titile is true");
		}else{
			System.out.println("Title is not true");
		}
	
	
	}
	
	//@Test
	public void test_02(){
		
		System.out.println("Launching Chrome browser..");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/home.html");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String homeURL=driver.getCurrentUrl();
		
		driver.findElement(By.cssSelector("a[href='pages/Button.html']")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		String currentURL=driver.getCurrentUrl();
		
		System.out.println("Home page URL"+homeURL);
		System.out.println("Current page URL"+currentURL);
		
		if(!homeURL.equals(currentURL)){
			
			
			System.out.println("URL Redirected");
		}else{
			System.out.println("URL Not redirected ");
		}
	
	
	}
	
	//@Test
	public void test_03(){
		
		System.out.println("Launching Chrome browser..");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/home.html");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(driver.getPageSource());


	}
	
	
	//@Test
	public void test_04(){
		
		System.out.println("Launching Chrome browser..");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/home.html");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String window=driver.getWindowHandle();
		
		System.out.println(window);
		


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
		driver.findElement(By.id("button1")).click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Set<String> s1=driver.getWindowHandles();
		
		for(String s:s1)
		System.out.println(s);


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
		String parentWindow=driver.getWindowHandle();
		
		driver.findElement(By.id("button1")).click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Set<String> s1=driver.getWindowHandles();
		
		
		for(String s:driver.getWindowHandles()){
			
			driver.switchTo().window(s);
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.switchTo().window(parentWindow);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		


	}
	
	
	
}
