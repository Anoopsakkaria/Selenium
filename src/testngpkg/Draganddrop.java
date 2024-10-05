package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
		WebElement debitaccount=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement debitamount=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		WebElement creditaccount=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		WebElement creditamount=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		WebElement fivethousand=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement perfect=driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(fivethousand, debitamount).perform();
		act.dragAndDrop(bank,debitaccount ).perform();
		act.dragAndDrop(fivethousand, creditamount).perform();
		act.dragAndDrop(sales, creditaccount).perform();
		//button text display
		String button=perfect.getText();
		System.out.println(button);
		//check whether the button is displayed
		boolean a=perfect.isDisplayed();
		if(a)
		{
			System.out.println("The button is displayed");
		}
		else
		{
			System.out.println("The button is not displayed");
		}
		
		
		

	}
	

}
