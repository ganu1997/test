package com.inetbanking.testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.PageObject.LoginPage;
import com.inetbanking.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass {
	@Test(dataProvider = "LoginData")
	public void LoginDDT(String user, String pwd) throws Exception {
		LoginPage lp = new LoginPage(driver);
		lp.EnterUserId(user);
		log.info("user name provided");
		lp.EnterPassword(pwd);
		log.info("password provided");
		lp.ClickLogin();

		Thread.sleep(3000);
		if (isAlertPresent() == true) {
			captureScreen(driver, "TC_LoginDDT_002");
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			log.warn("Login failed");
		} else {
			Assert.assertTrue(true);
			log.info("Login passed");
			lp.ClickLogout();

			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}
	}

	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@DataProvider(name = "LoginData")
	String[][] getData() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/java/com/inetbanking/testData/LoginData.xlsx";
		int rownum = XLUtils.getRowCount(filePath, "Sheet1");
		int colnum = XLUtils.getCellCount(filePath, "Sheet1", 1);

		String logindata[][] = new String[rownum][colnum];
		for (int i = 1; i <= rownum; i++) {
			for (int j = 0; j < colnum; j++) {
				logindata[i - 1][j] = XLUtils.getCellData(filePath, "Sheet1", i, j);
			}
		}
		return logindata;
	}
}
