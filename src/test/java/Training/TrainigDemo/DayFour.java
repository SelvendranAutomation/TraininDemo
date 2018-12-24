package Training.TrainigDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DayFour {
	
	//@Test
	public void test_01(){
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.leafground.com/");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions act=new Actions(driver);
		WebElement webel= driver.findElement(By.cssSelector("a[href='pages/Edit.html']"));
		
		act.moveToElement(webel ).perform();  //move to the elemnet 
		
		act.click().perform(); // click on element 
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
		driver.quit();
		
		
	}
	
	
	//@Test
	public void test_02(){
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.leafground.com/");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions act=new Actions(driver);
	 
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		 
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		act.sendKeys(Keys.PAGE_UP).perform();
		
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
		
		
	}
	
	
	
	//@Test
	public void test_03(){
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.leafground.com/");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("a[href='pages/drag.html']")).click();
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions act=new Actions(driver); 	 
		 
		//act.moveToElement(driver.findElement(By.id("draggable"))).clickAndHold().perform();
		
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		act.dragAndDropBy(driver.findElement(By.id("draggable")), 100, 200).build().perform();
		
		//driver.quit();
		
		
	}
	
	
	//@Test
	public void test_04(){
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Actions act =new Actions(driver);
		act.contextClick(driver.findElement(By.cssSelector(".context-menu-one"))).perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		String s1=driver.findElement(By.cssSelector(".context-menu-icon-copy")).getText();

		System.out.println(s1);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		act.moveToElement(driver.findElement(By.cssSelector(".context-menu-icon-copy"))).click().build().perform();
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void test_05(){
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://artoftesting.com/sampleSiteForSelenium.html");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Actions act =new Actions(driver);
		act.moveToElement(driver.findElement(By.id("dblClkBtn"))).doubleClick().build().perform();



	
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	

}
