package com.inetbanking.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public static WebDriver driver;
	
	@FindBy(name = "uid")
	@CacheLookup
	WebElement userid;
	
	@FindBy(name = "password")
	@CacheLookup
	WebElement password;
	
	@FindBy(name = "btnLogin")
	@CacheLookup
	WebElement clickLoginButton;
	
	@FindBy(xpath = "//*[contains(text(),'Log out')]")
	@CacheLookup
	WebElement clickLogoutButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void EnterUserId(String userID) {
		userid.sendKeys(userID);
	}
	public void EnterPassword(String pass) {
		password.sendKeys(pass);
	}
	public void ClickLogin() {
		clickLoginButton.click();
	}
	public void ClickLogout() {
		clickLogoutButton.click();
	}
}
