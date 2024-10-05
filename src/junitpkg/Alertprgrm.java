package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprgrm {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/anoop/Desktop/Alert.html");
	}
	@Test
	public void alert()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println(alerttext);
		a.accept();
		//a.dismiss();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Anoop");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("Sakkaria");
		driver.findElement(By.xpath("/html/body/input[4]")).click();

		
		
		
	}
	

}
