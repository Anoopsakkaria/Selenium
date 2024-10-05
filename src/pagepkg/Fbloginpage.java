package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpage {
	WebDriver driver;
	
	By fbmail=By.id("email");
	By fbpswd=By.id("pass");
	By loginbutton=By.name("login");
	
	
	//@FindBy(id="email")
	//WebElement fbmail;
	//@FindBy(id="pass")
//	WebElement fbpswd;
//	@FindBy(name="login")
//	WebElement loginbutton;
	
	public Fbloginpage(WebDriver driver)
	{
		this.driver=driver;
		//PageFactory.initElements(driver, this);
	}
	public void setvalues(String email,String pswd)
	{
		driver.findElement(fbmail).sendKeys(email);
		driver.findElement(fbpswd).sendKeys(pswd);
		//fbmail.sendKeys(email);
		//fbpswd.sendKeys(pswd);
	}
	public void loginclick()
	{
		driver.findElement(loginbutton).click();
		//loginbutton.click();
	}

}
