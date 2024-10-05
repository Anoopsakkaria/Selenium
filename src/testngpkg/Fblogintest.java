package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fblogintest {
	ChromeDriver driver;
	@BeforeTest
	public void setup() 
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("anoopsunny1994@gamil.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Kr@tos03");
		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
		String expkw="https://www.facebook.com";
		String acturl=driver.getCurrentUrl();
		if(expkw.equals(acturl))
		{
			System.out.println("Login successfull");
		}
		else
		{
			System.out.println("Login failed");
		}
	}

}
