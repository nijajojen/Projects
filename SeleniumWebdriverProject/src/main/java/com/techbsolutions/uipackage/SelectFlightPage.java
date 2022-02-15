package com.techbsolutions.uipackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class SelectFlightPage {

WebDriver driver;
	
	public SelectFlightPage(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(how=How.XPATH, using="//select[@name='airline']")
	@CacheLookup
		Select flightName;
	@FindBy(how=How.XPATH, using="//input[@name='findFlights']")
	@CacheLookup
		WebElement cont;
	
	public void departAirlineWordPress(String departAirline) {
		try {
		if(departAirline.equalsIgnoreCase("Blue Skies Airlines")) {
			flightName.selectByVisibleText("Blue Skies Airlines");
			Thread.sleep(3000);
		}
		if(departAirline.equalsIgnoreCase("Unified Airlines")) {
			flightName.selectByVisibleText("Unified Airlines");
			Thread.sleep(3000);
		}
		
		if(departAirline.equalsIgnoreCase("Pangea Airlines")) {
			flightName.selectByVisibleText("Pangea Airlines");
			Thread.sleep(3000);
		}
		cont.click();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void continu() {
		cont.click();
		try {
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
