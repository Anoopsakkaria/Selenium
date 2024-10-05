package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandler {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test() throws InterruptedException
	{
		driver.get("https://demo.guru99.com/popup.php");
		String parentWindow =driver.getWindowHandle();
		System.out.println("parent window title"+driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String>allwindowHandles=driver.getWindowHandles();
		for(String handle:allwindowHandles)
		{
			if(!handle.equals(parentWindow))
			{
				
			driver.switchTo().window(handle);
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abcd123@gmail.com");
			Thread.sleep(3000);
			driver.close();
			
			}
			driver.switchTo().window(parentWindow);
		}
		
	}

}
