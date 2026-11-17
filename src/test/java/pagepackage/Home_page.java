package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	
	WebDriver driver;
	
	@FindBy (xpath ="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6") WebElement dashboard;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span") WebElement admin;
	
	public Home_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String textlocating()
	{
		String text = driver.getTitle();
		return text;
	}
	
	public void adminmthd()
	{
		admin.click();
	}

}
