package testngpkg;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
	@BeforeTest
	public void beforetst()
	{
		System.out.println("beforetest");
	}
	@BeforeMethod
	public void beforemthd()
	{
		System.out.println("beforemthd");
	}
	@Test(priority = 4,invocationCount = 4,groups = {"smoke"})
	public void test1()
	{
		System.out.println("test 1 completed");
	}
	@Test(priority = 5,dependsOnMethods = {"test1"},groups = {"sanity"})
	public void test2()
	{
		System.out.println("test 2 completed");
	}
	@Test(priority = 2)
	public void test3()
	{
		System.out.println("test 3 completed");
	}
	@Test(priority = 3)
	public void test4()
	{
		System.out.println("test 4 completed");
	}
	@Test(priority = 1)
	public void test5()
	{
		System.out.println("test 5 completed");
	}
	@AfterMethod
	public void aftermthd()
	{
		System.out.println("Aftermethod");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("Aftertest");
	}

}
