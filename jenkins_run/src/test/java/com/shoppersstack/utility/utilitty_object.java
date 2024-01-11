package com.shoppersstack.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class utilitty_object {
public static Select select_object(WebElement element)
{
	Select sel=new Select(element);
	return sel;
}
public static Actions action_object(WebDriver driver)
{
	Actions act=new Actions(driver);
	return act;
}
}
