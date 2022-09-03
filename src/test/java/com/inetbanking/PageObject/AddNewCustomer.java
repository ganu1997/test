package com.inetbanking.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomer {
	public static WebDriver driver;
	@FindBy(xpath = "//*[contains(text(),'New Customer')]")
	@CacheLookup
	WebElement newCustomer;
	@FindBy(name = "name")
	@CacheLookup
	WebElement customerName;
	@FindBy(xpath = "//input[@type='radio'][1]")
	@CacheLookup
	WebElement gender;
	@FindBy(name = "dob")
	@CacheLookup
	WebElement dob;
	@FindBy(name = "addr")
	@CacheLookup
	WebElement address;
	@FindBy(name = "city")
	@CacheLookup
	WebElement city;
	@FindBy(name = "state")
	@CacheLookup
	WebElement state;

	@FindBy(name = "pinno")
	@CacheLookup
	WebElement pincode;
	@FindBy(name = "telephoneno")
	@CacheLookup
	WebElement telephone;
	@FindBy(name = "emailid")
	@CacheLookup
	WebElement emailId;
	@FindBy(name = "password")
	@CacheLookup
	WebElement password;
	@FindBy(name = "sub")
	@CacheLookup
	WebElement clickSubmit;
	
	public AddNewCustomer(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickNewCustomer() {
		newCustomer.click();
	}
	public void customerName(String name) {
		customerName.sendKeys(name);
	}
	public void SelectGender(String genderType) {
		gender.click();
	}
	public void dateOfBirth(String mm, String dd, String yy) {
		dob.sendKeys(mm);
		dob.sendKeys(dd);
		dob.sendKeys(yy);
	}
	
	public void enterAddress(String add) {
		address.sendKeys(add);
	}
	public void enterCity(String cityName) {
		city.sendKeys(cityName);
	}
	public void enterState(String stateName) {
		state.sendKeys(stateName);
	}
	public void enterPincode(String pin) {
		pincode.sendKeys(pin);
	}
	public void enterTelephone(String telephoneNo) {
		telephone.sendKeys(telephoneNo);
	}
	public void enterEmail(String email) {
		emailId.sendKeys(email);
	}
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	public void clickSubmit() {
		clickSubmit.click();
	}
}
