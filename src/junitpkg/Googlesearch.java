package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {
	ChromeDriver driver;
	@Before
	public void chrome()
	{
		driver=new ChromeDriver();
		driver.get("https://google.com");
	}
	@Test
	public void Search()
	{
		WebElement searchfield=driver.findElement(By.name("q"));
		searchfield.sendKeys("Mustang",Keys.ENTER);
	}

}
