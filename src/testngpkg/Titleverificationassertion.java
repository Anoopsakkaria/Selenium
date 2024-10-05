package testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Titleverificationassertion {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@Test
	public void test()
	{
		driver.get("https://www.google.com");
		String actualtitle=driver.getTitle();
		String exptitle="Google1";
		System.out.println("title="+actualtitle);
		
		Assert.assertEquals(actualtitle,exptitle,"title verification");
		System.out.println("verified");
	}
	

}
