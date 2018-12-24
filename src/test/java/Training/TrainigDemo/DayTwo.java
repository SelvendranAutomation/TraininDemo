package Training.TrainigDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DayTwo {
	
	//@Test
	public void test_01()
	{
		System.out.println("Launching Firefox browser..");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.id("user-message")).sendKeys("Test Enter value ");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		
	}
	
	//@Test
	public void test_02()
	{
		System.out.println("Launching Firefox browser..");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://dev-ps.grouprm.net/index.php");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.name("loginUserName")).sendKeys("usr Name enter");

	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		
	}
	
	
	//@Test
	public void test_3()
	{
		System.out.println("Launching Firefox browser..");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.className("inputLogin")).sendKeys("Test Entered value IS ");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	driver.close();
	}

	
	// @Test
		public void test_04()
		{
			System.out.println("Launching Firefox browser..");
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.findElement(By.id("user-message")).sendKeys("Test Enter value ");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			List<WebElement> li=driver.findElements(By.tagName("button"));
			
			
			li.get(1).click();
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			driver.close();
			
		}
		
		
		 // @Test
				public void test_05()
				{
					System.out.println("Launching Firefox browser..");
					System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\geckodriver.exe");
					WebDriver driver = new FirefoxDriver();
					driver.get("https://www.google.com/");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					String s1=driver.findElement( By.linkText("Control your data in Google Search")).getText();
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println(s1);
					
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					driver.close();
					
				}
				
				
				
				 // @Test
					public void test_06()
					{
						System.out.println("Launching Firefox browser..");
						System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\geckodriver.exe");
						WebDriver driver = new FirefoxDriver();
						driver.get("https://www.google.com/");
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						 driver.findElement( By.partialLinkText("Control your")).click();
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}


						
						
						driver.close();
						
					}
					
					
				 
					
					
				 // @Test
					public void test_07()
					{
						System.out.println("Launching Firefox browser..");
						System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\BackupDriver\\geckodriver.exe");
						WebDriver driver = new FirefoxDriver();
						driver.get("http://dev-ps.grouprm.net/index.php");
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						 driver.findElement( By.cssSelector("input[id='loginUserName']")).sendKeys("userName"); 
						 driver.findElement( By.cssSelector("#loginUserPassword")).sendKeys("Password"); 
						 driver.findElement( By.cssSelector("input[value='Login']")).sendKeys(Keys.ENTER); 
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}


						
						
						driver.close();
						
					}	  
				  
				  
				  
				  
				 
}
