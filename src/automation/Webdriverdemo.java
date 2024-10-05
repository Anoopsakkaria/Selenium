package automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverdemo {
	
	//ChromeDriver
	//EdgeDriver
	//FireFoxDriver
	//SafariDriver

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();  //open browser
		driver.get("https://www.google.com");    //open google
		String actualtitle=driver.getTitle();
		String expectedtitle="Google";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("Title pass");
		}
		else
		{
			System.out.println("Title fail");
		}
		driver.close();
	}

}
