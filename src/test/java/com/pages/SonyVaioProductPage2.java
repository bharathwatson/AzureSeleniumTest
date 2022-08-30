package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class SonyVaioProductPage2 extends BaseClass {
	
	public SonyVaioProductPage2() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[normalize-space()='Add to cart']")
	private WebElement btnAddToCart;

	@FindBy(xpath = "//a[@id='cartur']")
	private WebElement btnCart;

	public WebElement getBtnAddToCart() {
		return btnAddToCart;
	}

	public WebElement getBtnCart() {
		return btnCart;
	}

	public void sonyVaioProduct() {

		click(getBtnAddToCart());
		explicitWaitAlertAccept(10);
		click(getBtnCart());

	}

}
