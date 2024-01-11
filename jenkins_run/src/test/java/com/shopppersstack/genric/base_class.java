package com.shopppersstack.genric;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base_class {
	public WebDriver driver;
	public ExtentTest test;
	public ExtentSparkReporter reporter;
	public ExtentReports reports;

	@BeforeClass
	public void report() {
		reporter = new ExtentSparkReporter("./report/extent1.html");
		reports = new ExtentReports();
		reports.attachReporter(reporter);
		test = reports.createTest("frameWork").assignAuthor("Prajwal");
	}

	@BeforeMethod
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeApp(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {

			test.addScreenCaptureFromPath(screenshot.getphoto(driver));
		}
		reports.flush();

		driver.close();
	}
}
