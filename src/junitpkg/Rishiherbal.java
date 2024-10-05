package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rishiherbal {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://rishiherbalindia.linker.store/");
	}
	@Test
	public void title()
	{
		String actualtitle=driver.getTitle();
		String expectedtitle="Rishi Herbals";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("Title test passed");
		}
		else
		{
			System.out.println("Title test failed");
		}
	}
		@Test
		public void linkcount()
		{
		List<WebElement>li=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links in the webpage = "+li.size());
		
		String expectedlinkcount="100";
		if(li.equals(expectedlinkcount))
		{
			System.out.println("Total number of links are correct according to the test document");
		}
		else {
			System.out.println("Total number of links are not correct as per the test document");
		}
	}
		
		@Test
		public void textverification() 
		{
			String src=driver.getPageSource();
			if(src.contains("FOOD"))
			{
				System.out.println("Text found");
			}
			else
			{
				System.out.println("Text not found");
			}
			}
		
		@Test
		public void click()
		{
			driver.findElement(By.xpath("//div[@id='menu']/ul/li[2]/a")).click();
		}

}
