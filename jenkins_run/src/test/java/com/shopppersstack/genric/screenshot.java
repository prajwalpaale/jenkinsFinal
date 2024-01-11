package com.shopppersstack.genric;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	public static String getphoto(WebDriver driver)

	{
		Date d = new Date();
		String dat = d.toString().replaceAll(":", "-");
		String path = "./photo/" + dat + ".jpg";
		TakesScreenshot tss = (TakesScreenshot) driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dst = new File(path);
		try {
			FileHandler.copy(src, dst);
		} catch (IOException e) {
			System.out.println("file not copied");
		}
		return "."+path;
	}
}
