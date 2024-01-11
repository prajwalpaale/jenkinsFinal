package com.shoppersstack.runner;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.shoppersstack.pom.shopper_pom;
import com.shopppersstack.genric.base_class;

public class loginscript extends base_class{
@Test(dataProvider = "cred")
public void login(String un,String pas) throws InterruptedException
{
	test.log(Status.INFO, "clicked on login");
	shopper_pom p=new shopper_pom(driver);
	p.get_login().click();
	Thread.sleep(1000);
	p.get_un().sendKeys(un);
	test.log(Status.INFO, "Enterted Username as:"+un);
	Thread.sleep(1000);
	test.log(Status.INFO, "Entered Password as :"+pas);
	p.get_pass().sendKeys(pas,Keys.ENTER);
//	Assert.fail();
}
@DataProvider(name = "cred")
public Object[][] data()
{
	return new  Object[][] {
		{"prajwalpaale@gmail.com","Admin@123"}
	};
}
}
