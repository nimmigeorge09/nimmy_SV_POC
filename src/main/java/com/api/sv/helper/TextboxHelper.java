package com.api.sv.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextboxHelper {
	
	
	private static TextboxHelper textboxhelper;
	private static WebDriver Wdriver;
	private WebElement element;
	
	
	
	private TextboxHelper(WebDriver driver){
		Wdriver=driver;		
	}
	
	public static TextboxHelper getinstance(WebDriver driver)
		{
		if(textboxhelper==null||Wdriver.hashCode()!=driver.hashCode())
			textboxhelper=new TextboxHelper(driver);
			return textboxhelper;
	}
	public void setText(By locator,String value) {
		element= Wdriver.findElement(locator);
		element.sendKeys(value);		
	}
	public String getText(By locator) {
		element=Wdriver.findElement(locator);
		String value=element.getText();
		return value;
	}
	public void clear(By locator) {
		element=Wdriver.findElement(locator);
		element.clear();
	}
	

}
