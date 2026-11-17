package testpackage;

import org.testng.annotations.Test;

import basepackage.Base_class;


public class Login_test extends Base_class{

	@Test
	public void login()
	{
		obj.loginmthd();
	}
}
