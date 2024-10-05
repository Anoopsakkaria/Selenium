package testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Guru99task {
	String url="https://demo.guru99.com/test/simple_context_menu.html";
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
		}
	@Test
	public void test()
	{
		WebElement rightclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		WebElement edit=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]"));

		WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		Actions act=new Actions(driver);
		act.contextClick(rightclick);
		act.perform();
		act.click(edit);
		act.perform();
		Alert a=driver.switchTo().alert();
		a.accept();
		act.doubleClick(doubleclick);
		act.perform();
		String alerttext=a.getText();
		System.out.println(alerttext);
		a.accept();

		}

}
