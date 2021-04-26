package com.inetBanking.testCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_Login_001 extends BaseClass 
{
	
	
	@Test
	public void loginTest() throws IOException
	{
	   
	  logger.info("URL is Opened");
	  LoginPage lp = new LoginPage(driver);
	  lp.setUserName(username);
	  logger.info("Entered username");
	  lp.setPassword(password);
	  logger.info("Entered Password");
	  lp.clickSubmit();
	  
	  if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	  {
		  Assert.assertTrue(true);
	  } else
	  {
		  captureScreen(driver,"loginTest");
		  Assert.assertTrue(false);
	  }
		
	}
	
	
	
	
}
