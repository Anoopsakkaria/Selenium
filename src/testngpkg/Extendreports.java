package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extendreports {
	WebDriver driver;
	String baseurl="https://www.facebook.com/";
	ExtentSparkReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	
	@BeforeTest
	public void b4test()
	{
		driver=new ChromeDriver();
		reporter=new ExtentSparkReporter("./Reports/myreport1.html");
		reporter.config().setDocumentTitle("Automation report");
		reporter.config().setReportName("Functional testing");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Host name", "Local host");
		extent.setSystemInfo("OS", "Windows 11");
		extent.setSystemInfo("Tester name", "Anoop sakkaria");
		extent.setSystemInfo("Browser name", "Chrome");
	}
	@BeforeMethod
	public void setup()
	{
		driver.get(baseurl);
	}
	
	@Test
	public void fbtitleverification()
	{
		test=extent.createTest("fbtitleverification");
		String exp="facebook";
		String act=driver.getTitle();
		Assert.assertEquals(exp, act);
	}
	
	@Test
	public void buttontxtverification()
	{
		test=extent.createTest("Button text verification");
		WebElement buttontxt=driver.findElement(By.xpath("//*[@id=\"loginbutton\"]"));
		String expe="Log in";
		String actu=buttontxt.getText();
		Assert.assertEquals(expe, actu);
	}
	
	@AfterTest
	public void teardown()
	{
		extent.flush();
	}
	
	@AfterMethod
	public void browserclose(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "Test case failed bcos"+result.getName());
			test.log(Status.FAIL, "Test case failed bcos"+result.getThrowable());
		
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "Test case skipped bcos"+result.getName());	
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "Test case passed bcos"+result.getName());
		}
	}
	
	

}
