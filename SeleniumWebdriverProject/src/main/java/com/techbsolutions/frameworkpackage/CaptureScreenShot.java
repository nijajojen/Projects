package com.techbsolutions.frameworkpackage;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class CaptureScreenShot {
	
	public CaptureScreenShot() {
		
	}
	
	public static void getScreenShot(WebDriver driver,String filepath) {
		try {
			System.out.println("in getScreenShot method");
			TakesScreenshot tkSrnSht=(TakesScreenshot) driver;
			System.out.println("before getscreeen shot as");
			File source = tkSrnSht.getScreenshotAs(OutputType.FILE);
			System.out.println("After getScreenshotAs");
			try {
				FileUtils.copyFile(source, new File(filepath));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		catch (WebDriverException e) {
			// TODO: handle exception
		}
			
		
	}
	
	public static String getDateTimeStamp() {
		Date odate;
		String[] sDatePart;
		String sDateStamp;
		odate= new Date();
		System.out.println(odate.toString());
		sDatePart= odate.toString().split(" ");
		sDateStamp= sDatePart[5]+"_"+sDatePart[1]+"_"+sDatePart[2]+"_"+sDatePart[3];
		sDateStamp= sDateStamp.replace(":", "_");
		System.out.println(sDateStamp);
		return sDateStamp;
	}

}
