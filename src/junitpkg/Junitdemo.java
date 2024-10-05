package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void Titleverification()
	{
		String actualtitle=driver.getTitle();
		String expectedtitle="Google";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("Title found");
		}
		else
		{
			System.out.println("Title not found");
		}
	}
		
		@Test
		public void textverification()
		{
			String src=driver.getPageSource();
			if(src.contains("Images"))
			{
				System.out.println("Textfound");
			}
			else
			{
				System.out.println("Text not found");
			}
		}
			@After
			public void end()
			{
			driver.quit();
			}
		}
		
	
	


