package com.inetbanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.PageObject.AddNewCustomer;
import com.inetbanking.PageObject.LoginPage;

public class TC_AddNewCustomer_003 extends BaseClass {
	@Test
	public void LoginTest() throws Exception {
		log.info("URL opened");
		LoginPage lp = new LoginPage(driver);
		lp.EnterUserId(uid);
		log.info("UserID entered");
		lp.EnterPassword(pass);
		log.info("Password Entered");
		lp.ClickLogin();
		Thread.sleep(3000);
		AddNewCustomer cus = new AddNewCustomer(driver);
		cus.clickNewCustomer();
		log.info("Clikced on New Customer");

		Thread.sleep(3000);
		cus.customerName("Ganesh");
		log.info("Customer Name Entered");
		cus.SelectGender("male");
		log.info("Gender Selected");
		cus.dateOfBirth("08", "21", "1997");
		Thread.sleep(3000);
		log.info("Date of Birth Entered");
		cus.enterAddress("Deshmukhwadi");
		log.info("Address Entered");
		cus.enterCity("Pune");
		log.info("City Entered");
		cus.enterState("Maharashtra");
		log.info("State Entered");
		cus.enterPincode("411023");
		log.info("Pincode Entered");
		cus.enterTelephone("12345");
		log.info("Phone Number Entered");
		String email = randomestring() + "@gmail.com";
		cus.enterEmail(email);
		log.info("Random Email Entered");
		String pass = randomeNum();
		cus.enterPassword(pass);
		Thread.sleep(3000);
		cus.clickSubmit();
		Thread.sleep(3000);

		log.info("Validation Started");

		boolean result = driver.getPageSource().contains("Customer Registered Successfully!!!");
		if (result == true) {
			Assert.assertTrue(true);
			log.info("Test Passed");
		} else {
			log.info("Test Failed");
			captureScreen(driver, "AddNewCustomer");
			Assert.assertTrue(false);
		}
	}
}