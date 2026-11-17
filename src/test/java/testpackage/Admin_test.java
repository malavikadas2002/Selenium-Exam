package testpackage;

import org.testng.annotations.Test;

import basepackage.Base_class;

public class Admin_test extends Base_class{
	
	@Test
	public void ssmthd() throws Exception
	{
		adminobj.searchmthd();
		adminobj.screenshotmthd();
	}
	
	

}
