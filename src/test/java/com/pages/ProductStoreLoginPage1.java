package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class ProductStoreLoginPage1 extends BaseClass {
	
	public ProductStoreLoginPage1() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@id='login2']")
	private WebElement btnLogin;
	
	@FindBy(xpath="//input[@id='loginusername']")
	private WebElement txtUserName;
	
	@FindBy(xpath="//input[@id='loginpassword']")
	private WebElement txtPassword;
	
	@FindBy(xpath="//button[normalize-space()='Log in']")
	private WebElement btnLogin1;
	
	@FindBy(xpath="(//a[normalize-space()='Laptops'])[1]")
	private WebElement btnLaptops;
	
	@FindBy(xpath="//a[normalize-space()='Sony vaio i5']")
	private WebElement lnkLaptops;
	
	public WebElement getLnkLaptops() {
		return lnkLaptops;
	}

	public WebElement getBtnLaptops() {
		return btnLaptops;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin1() {
		return btnLogin1;
	}
	
	public void productStoreLogin(String userName,String password) {
		
		click(getBtnLogin());
		enterText(getTxtUserName(), getPropertyFileValue(userName));
		enterText(getTxtPassword(),	getPropertyFileValue(password));
		click(getBtnLogin1());
		explicitWaitInVisibility(getBtnLogin1(), 10);
//		explicitWaitElementVisibility(getBtnLaptops(), 10);
		click(getBtnLaptops());
		click(getLnkLaptops());
		
		
	}
}
