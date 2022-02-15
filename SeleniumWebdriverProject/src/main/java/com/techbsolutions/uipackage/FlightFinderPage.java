package com.techbsolutions.uipackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FlightFinderPage {

	WebDriver driver;
	
	public FlightFinderPage() {
		this.driver=driver;
	}
	@FindBy(how=How.XPATH, using="(//input[@name='servClass'])[2]")
	@CacheLookup
		WebElement oneWayTrip;
	@FindBy(how=How.NAME, using="//input[@name='tripType']")
	@CacheLookup
		WebElement roundTrip;
	@FindBy(how=How.NAME, using="passCount")
	@CacheLookup
		WebElement passCount;
	@FindBy(how=How.NAME, using="fromPort")
	@CacheLookup
		WebElement fromPort;
	@FindBy(how=How.NAME, using="fromMonth")
	@CacheLookup
		WebElement fromMonth;
	@FindBy(how=How.NAME, using="fromDay")
	@CacheLookup
		WebElement fromDay;
	@FindBy(how=How.NAME, using="toPort")
	@CacheLookup
		WebElement toPort;
	@FindBy(how=How.NAME, using="toMonth")
	@CacheLookup
		WebElement toMonth;
	@FindBy(how=How.NAME, using="toDay")
	@CacheLookup
		WebElement toDay;
	@FindBy(how=How.NAME, using="airline")
	@CacheLookup
		WebElement airline;
	@FindBy(how=How.NAME, using="findFlights")
	@CacheLookup
		WebElement findFlights;
	@FindBy(how=How.NAME, using=".//*[@value='Business']")
	@CacheLookup
		WebElement serviceClass;
	
	public void continueWordPress(String pCount, String fport, String fMonth,  String fDay, String tPort,String tMonth,String tDay, String servClass, String aline) {
		try {
		Thread.sleep(3000);
		roundTrip.click();
		Thread.sleep(3000);
		passCount.sendKeys(pCount);
		Thread.sleep(3000);
		fromPort.sendKeys(fport);
		Thread.sleep(3000);
		fromMonth.sendKeys(fMonth);
		Thread.sleep(3000);
		fromDay.sendKeys(fDay);
		Thread.sleep(3000);
		toPort.sendKeys(tPort);
		Thread.sleep(3000);
		toMonth.sendKeys(tMonth);
		Thread.sleep(3000);
		toDay.sendKeys(fDay);
		Thread.sleep(3000);
		serviceClass.sendKeys(servClass);
		Thread.sleep(3000);
		airline.sendKeys(aline);
		Thread.sleep(3000);
		findFlights.click();
		Thread.sleep(3000);
				
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
}
