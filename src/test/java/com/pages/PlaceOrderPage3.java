package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class PlaceOrderPage3 extends BaseClass {

	public PlaceOrderPage3() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[normalize-space()='Place Order']")
	private WebElement btnPlaceOrder;

	@FindBy(xpath = "//input[@id='name']")
	private WebElement txtName;

	@FindBy(xpath = "//input[@id='country']")
	private WebElement txtCountry;

	@FindBy(xpath = "//input[@id='city']")
	private WebElement txtCity;

	@FindBy(xpath = "//input[@id='card']")
	private WebElement txtCreditCard;

	@FindBy(xpath = "//input[@id='month']")
	private WebElement txtExpiryMonth;

	@FindBy(xpath = "//input[@id='year']")
	private WebElement txtExpiryYear;

	@FindBy(xpath = "//button[normalize-space()='Purchase']")
	private WebElement btnPurchase;

	@FindBy(xpath = "//p[@class='lead text-muted ']")
	private WebElement txtOrderID;

	public WebElement getBtnPlaceOrder() {
		return btnPlaceOrder;
	}

	public WebElement getTxtName() {
		return txtName;
	}

	public WebElement getTxtCountry() {
		return txtCountry;
	}

	public WebElement getTxtCity() {
		return txtCity;
	}

	public WebElement getTxtCreditCard() {
		return txtCreditCard;
	}

	public WebElement getTxtExpiryMonth() {
		return txtExpiryMonth;
	}

	public WebElement getTxtExpiryYear() {
		return txtExpiryYear;
	}

	public WebElement getBtnPurchase() {
		return btnPurchase;
	}

	public WebElement getTxtOrderID() {
		return txtOrderID;
	}

	public void placeOrder(String name, String country, String city, String creditcardno, String expirymonth,
			String expiryyear) {
		click(getBtnPlaceOrder());
		enterText(getTxtName(), name);
		enterTextEnter(getTxtCountry(), country);
		enterText(getTxtCity(), city);
		enterText(getTxtCreditCard(), getPropertyFileValue(creditcardno));
		enterText(getTxtExpiryMonth(), getPropertyFileValue(expirymonth));
		enterText(getTxtExpiryYear(), getPropertyFileValue(expiryyear));
		click(getBtnPurchase());

		String text = getText(getTxtOrderID());
		String[] split = text.split(" ");
		String[] split2 = split[1].split("\n");
		String data = String.valueOf(split2[0]);
		System.out.println(data);
		try {
			
			insertValueInCreateCell("excel", "blaze", 1	, 3, data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
