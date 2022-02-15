package com.techbsolutions.testpackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.techbsolutions.frameworkpackage.BrowserFactory;

public class HelperClass {
	
	public static WebDriver driver;
	BrowserFactory obj1;
	
	public HelperClass() {
		
	}
	
	@BeforeSuite
	public void beforeSuite() {
		
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("in @Before class");
	}
	
	@BeforeMethod
	public void beforeMethodClass() {
		System.out.println("in @BeforeMethod");
		HelperClass.driver=BrowserFactory.getDriver("chrome");
	}
	
	@AfterClass
	public void afterClass() {
		
	}
	
	@AfterSuite
	public void afteSuite() throws IOException {
		driver.quit();
	}

}
