package automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Textverification {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		String src=driver.getPageSource();
		if(src.contains("images"))
		{
			System.out.println("Text found");
		}
		else
		{
			System.out.println("Text not found");
		}
		driver.quit();
	}

}
