package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Redifftask {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void logo()
	{
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		boolean b=logo.isDisplayed();
		if(b)
		{
			System.out.println("Logo is displayed");
		}
		else 
		{
			System.out.println("Logo is not displayed");
		}
	}
	@Test
	public void radiobutton()
	{
		WebElement radio=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
		boolean c=radio.isEnabled();
		if(c)
		{
			System.out.println("Radio button is enabled");
		}
		else
		{
			System.out.println("Radio button is not enabled");
		}
	}
	@Test
	public void button()
	{
		WebElement button=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		boolean d=button.isSelected();
		if(d)
		{
		System.out.println("Button is selected");
		}
		else
		{
			System.out.println("Button is not selected");
		}
	}

}
