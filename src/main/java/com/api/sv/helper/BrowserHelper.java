package com.api.sv.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariTechPreviewDriverInfo;

public class BrowserHelper {
	
	private static BrowserHelper browserhelper;
	private static WebDriver wdriver;
	
	
	private BrowserHelper(WebDriver driver) {
		wdriver=driver;
		
	}
	
	
	public static BrowserHelper getInstance(WebDriver driver) {
		if(browserhelper==null ||wdriver.hashCode()!=driver.hashCode())
			browserhelper=new BrowserHelper(driver);
		return browserhelper;
		
	}
	public void moveForward() {
		wdriver.navigate().forward();	
		
	}
	public void moveBackward() {
		wdriver.navigate().back();
		
	}
	public void refresh() {
		wdriver.navigate().refresh();
		
	}

}
