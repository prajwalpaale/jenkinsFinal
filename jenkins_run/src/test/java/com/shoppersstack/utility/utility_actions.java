package com.shoppersstack.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class utility_actions {
public void mouseHover(WebDriver driver,WebElement targ)
{
	utilitty_object.action_object(driver).moveToElement(targ);
}
}
