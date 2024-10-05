package junitpkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/anoop/Desktop/Alert.html");
	}
	@Test
	public void ss() throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\Users\\anoop\\Desktop\\Screenshot\\ss.png"));
		
		WebElement ele=driver.findElement(By.xpath("/html/body/input[1]"));
		File src1=ele.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, new File("./Screenshot/Button.png"));
	}

}
