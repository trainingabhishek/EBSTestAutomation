package com.ebs.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebs.qa.base.TestBase;
import com.ebs.qa.pages.LoginPage;
import com.ebs.qa.util.TestUtil;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;

	
	public LoginPageTest(){
		super();
	}
	
	/*@BeforeClass
	public void loginTest() throws Exception{
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		TestUtil.assertResult("Dashboard", "eBenefitSync");
	}*/
	
	@BeforeClass
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
		loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() throws IOException{
		String title = loginPage.validateLoginPageTitle();
		TestUtil.assertResult(title, "eBenefitSync");
	}
	

	//@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	

}
