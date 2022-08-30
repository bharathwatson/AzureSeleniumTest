package com.runner;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.pagemanager.PageObjectManager;

public class TestRunnerClass extends BaseClass {
	PageObjectManager pom = new PageObjectManager();
	
	@BeforeClass
	public void beforeClass() {
		setUpDriver(getPropertyFileValue("browser"));
		maximize();
		getUrl("https://www.demoblaze.com/index.html");
		implicityWait(20);
	}
	
	@Test(priority=1)
	public void tc_001() {
		pom.getProductStoreLoginPage1().productStoreLogin("userName", "password");
	}
	
	@Test(priority=2)
	public void tc_002() {
		pom.getSonyVaioProductPage2().sonyVaioProduct();
		
	}
	
	@Test(priority=3)
	public void tc_003() throws IOException {
		pom.getPlaceOrderPage3().placeOrder(getDataFromExcel("excel", "blaze", 1, 0),
				getDataFromExcel("excel", "blaze", 1, 1), getDataFromExcel("excel", "blaze", 1, 2), 
				"creditcardno", "expirymonth", "expiryyear");
	}
	
	@AfterClass
	public void afterClass() {
		quit();
	}
	

}
