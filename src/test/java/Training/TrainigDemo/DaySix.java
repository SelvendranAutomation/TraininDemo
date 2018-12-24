package Training.TrainigDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DaySix {
	
	//@Test
	public void test_01(){
		
		System.out.println("Launching Chrome browser..");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		List<WebElement> str=driver.findElements(By.tagName("a"));
		
		for(int i=0;i<str.size();i++){
		System.out.println(str.get(i).getText());
		}
		
	
	}
	
	
	//@Test
	public void test_02(){
		
		System.out.println("Launching Chrome browser..");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.findElement(By.id("email")).sendKeys("examle@gmail.com");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String emailV=driver.findElement(By.id("email")).getAttribute("value");
		
	
		String appendV=driver.findElement(By.cssSelector("input[value='Append ']")).getAttribute("value");
	
		
		System.out.println("Entered value "+emailV);
		
		System.out.println("Append value "+appendV);
	}
	
	
	//@Test
	public void test_03(){
		
		System.out.println("Launching Chrome browser..");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.findElement(By.id("email")).sendKeys("examle@gmail.com");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String emailV=driver.findElement(By.id("email")).getAttribute("value");
		
	
		String appendV=driver.findElement(By.cssSelector("input[value='Append ']")).getAttribute("style");
	
		
		System.out.println("Entered value "+emailV);
		
		System.out.println("Style Attribute value "+appendV);
	}
	//@Test
	public void test_04(){
		
		System.out.println("Launching Chrome browser..");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/radio.html");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean yes,no;
		
		yes=driver.findElement(By.id("yes")).isSelected();
		no=driver.findElement(By.id("no")).isSelected();
		
		if(yes){
			System.out.println("Yes selected ");
		}else{
			System.out.println("Yes not selected ");
		}
		if(no){
			System.out.println("no selected ");
		}else{
			System.out.println("no not selected ");
		}
		
		
	}
	
	
	//@Test
	public void test_05(){
		
		System.out.println("Launching Chrome browser..");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Calendar.html");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.id("datepicker")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Is Enabled " +driver.findElement(By.cssSelector("a[title='Prev']")).isEnabled());
		
		driver.close();
		
		
	}
	
	
	@Test
	public void test_06(){
		
		System.out.println("Launching Chrome browser..");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Calendar.html");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.id("datepicker")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("a[title='Prev']")).click();
		//driver.findElement(By.cssSelector("a[title='Prev']")).click();
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try{
			System.out.println("31 is displayed : " +driver.findElement(By.linkText("31")).isDisplayed());
		}catch(NoSuchElementException e){
			System.out.println("Element is not displayed ");
		}
		
		
		driver.close();
		
		
	}
	
}
