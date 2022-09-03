package com.inetbanking.testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.PageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	@Test
	public void LoginTest() throws Exception {
		log.info("URL opened");
		LoginPage lp = new LoginPage(driver);
		lp.EnterUserId(uid);
		log.info("UserID entered");
		lp.EnterPassword(pass);
		log.info("Password Entered");
		lp.ClickLogin();
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			log.info("Test Passed");
		}else {
			captureScreen(driver, "TC_LoginTest_001");
			Assert.assertTrue(false);
			log.info("Test Failed");
		}
	}
}
