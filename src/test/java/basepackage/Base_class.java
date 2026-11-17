package basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pagepackage.Admin_page;
import pagepackage.Home_page;
import pagepackage.Login_page;

public class Base_class {
	
	public static WebDriver driver;
	public Login_page obj;
	public Home_page homeobj;
	public Admin_page adminobj;
	
	@BeforeTest
	public void browsersetup()
	{
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void objectmethod()
	{
		obj = new Login_page(driver);
		homeobj = new Home_page(driver);
		adminobj = new Admin_page(driver);
	}
	
	@AfterTest
	public void closingmthd()
	{
		driver.quit();
	}
}
