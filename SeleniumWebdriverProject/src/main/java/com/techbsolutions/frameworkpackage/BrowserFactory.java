package com.techbsolutions.frameworkpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	
	public static WebDriver driver;
	
	public BrowserFactory() {
		
	}
	
	public static WebDriver getDriver() {
		
		if(driver== null) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options= new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
			driver=new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);			
		}
		return driver;
	}
	
	
	public static WebDriver getDriver(String browsername) {
		if(driver==null) {
			if(browsername.equalsIgnoreCase("firefox")) {
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);			
			}
			else if(browsername.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
			}
		}
		return driver;
	}

}
