package com.shoppersstack.pom;

import org.apache.poi.POIDocument;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shopper_pom {
@FindBy(id = "loginBtn")
private WebElement login;
@FindBy(id = "Email")
private WebElement un_txt;
@FindBy(id = "Password")
private WebElement pass_txt;
@FindBy(xpath = "//button[@aria-label='Account settings']")
private WebElement logout;
public shopper_pom(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public WebElement get_login()
{
	return login;
}
public WebElement get_un()
{
	return un_txt;
}
public WebElement get_pass()
{
	return pass_txt;
}
public WebElement get_logout()
{
	return logout;
}
}
