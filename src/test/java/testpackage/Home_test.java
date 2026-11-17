package testpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepackage.Base_class;

public class Home_test extends Base_class{

	@Test(priority = 1)
	public void textverification()
	{
		String title = homeobj.textlocating();
		Assert.assertEquals(title, "Dashboard");
	}
	
	@Test(priority = 2)
	public void clickmthd()
	{
		homeobj.adminmthd();
	}
}
