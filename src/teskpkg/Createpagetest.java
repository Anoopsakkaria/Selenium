package teskpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Createpagetest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
	}
	

}
