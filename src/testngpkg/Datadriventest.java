package testngpkg;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventest {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		FileInputStream ob=new FileInputStream("\"C:\\Users\\anoop\\Desktop\\datadriventest.xlsx\"");
		XSSFWorkbook wb=new XSSFWorkbook(ob);
		XSSFSheet sh=wb.getSheet("Sheet1");
		int rows=sh.getLastRowNum();
		for(int i=1;i<=rows;i++)
		{
			String un=sh.getRow(i).getCell(0).getStringCellValue();
			String pswrd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(un+"-----"+pswrd);
		}
					
		
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(un);
		driver.findElement(By.name("pass")).sendKeys(pswrd);
		driver.findElement(By.name("button")).click();
		
		
	}

}
