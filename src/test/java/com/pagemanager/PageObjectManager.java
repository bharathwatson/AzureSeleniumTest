package com.pagemanager;

import com.pages.PlaceOrderPage3;
import com.pages.ProductStoreLoginPage1;
import com.pages.SonyVaioProductPage2;

public class PageObjectManager {
	
	private ProductStoreLoginPage1 productStoreLoginPage1;
	
	private SonyVaioProductPage2 sonyVaioProductPage2;
	
	private PlaceOrderPage3 placeOrderPage3;


	public ProductStoreLoginPage1 getProductStoreLoginPage1() {
		return (productStoreLoginPage1==null)?new ProductStoreLoginPage1():productStoreLoginPage1;
	}

	public SonyVaioProductPage2 getSonyVaioProductPage2() {
		return (sonyVaioProductPage2==null)? new SonyVaioProductPage2():sonyVaioProductPage2;
	}
	
	public PlaceOrderPage3 getPlaceOrderPage3() {
		return (placeOrderPage3==null)?new PlaceOrderPage3():placeOrderPage3;
	}
	
	
	

}
