package com.api.sv.stepdfn;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.api.sv.helper.BrowserHelper;
import com.api.sv.helper.TextboxHelper;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WebelementStepDfn {
	
	private WebDriver driver;	
	private BrowserHelper BH;
	private TextboxHelper TH;
	private WebElement element;
	private List<WebElement> elementlist;
	
	
	
	@Given("^open the facebook page \"([^\"]*)\"$")
    public void open_the_facebook_page_something(String url) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/home/nimmy/Nimmy/chromedriver_linux64/chromedriver");
		 ChromeOptions options = new ChromeOptions();
		   options.addArguments("start-maximized"); // open Browser in maximized mode
		   options.addArguments("disable-infobars"); // disabling infobars
		   options.addArguments("--disable-extensions"); // disabling extensions
		   options.addArguments("--disable-gpu"); // applicable to windows os only
		   options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		   options.addArguments("--no-sandbox"); // Bypass OS security model
		   driver = new ChromeDriver(options);
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		   BH=BrowserHelper.getInstance(driver);
		   TH=TextboxHelper.getinstance(driver);
		   driver.get(url);
       
    }

	
		@When("^i use locators to find a webelement and pass a text \"([^\"]*)\"$")
		public void i_use_locators_to_find_a_webelement_and_pass_a_text_something(String val) throws Throwable {
		// element=driver.findElement(By.id("email"));
		 //element.sendKeys(val);
		TH.setText(By.cssSelector("#email"), val);
		}
		

	    @Then("^Webelement is identified and text is displayed$")
	    public void webelement_is_identified() throws Throwable {
	       //System.out.println(element.toString());
	    	System.out.println(TH.getText(By.cssSelector("#email")));
	    }
	    @Then("^clear the text field$")
	    public void clear_the_text_field() throws Throwable {
	       TH.clear(By.cssSelector("#email"));
	       
	       /*element=driver.findElement(By.cssSelector("[name='login']"));
	       element.click();
	       Thread.sleep(3000);
	       BH.moveBackward();
	       Thread.sleep(3000);
	       element=driver.findElement(By.cssSelector("[data-testid='open-registration-form-button']"));
	       element.click();
	       Thread.sleep(4000);
	       element=driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
	       element.click();
	       
	  
	       element =driver.findElement(By.cssSelector("#month"));
	       Select ss=new Select(element);
	       ss.selectByIndex(3);
	       Thread.sleep(4000);
	       ss.selectByVisibleText("Dec");
	       Thread.sleep(4000);
	       ss.selectByValue("11");*/
	       
	    }
	    

@When("^i click on the login button and performs click action$")
public void i_click_on_the_login_button_and_performs_click_action() throws Throwable {
	element=driver.findElement(By.cssSelector("[name='login']"));
    element.click();
    Thread.sleep(3000);
    BH.moveBackward();
    Thread.sleep(3000);
}

@When("^i click on radio button it should select the radio button$")
public void i_click_on_radio_button_it_should_select_the_radio_button() throws Throwable {
	element=driver.findElement(By.cssSelector("[data-testid='open-registration-form-button']"));
    element.click();
    Thread.sleep(4000);
    element=driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
    element.click();
    element=driver.findElement(By.xpath("//img[src='https://static.xx.fbcdn.net/rsrc.php/v3/y2/r/__geKiQnSG-.png']"));
    

}

@When("^i click on hyperlink it should take me to new page$")
public void i_click_on_hyperlink_it_should_take_me_to_new_page() throws Throwable {
	element = driver.findElement(By.linkText("Create a Page"));
	element.click();
	Thread.sleep(3000);
	BH.moveBackward();
	Thread.sleep(3000);
}


	    @When("^call the quit method the browser will close$")
	    public void browserfunction1_call_the_quit_method_the_browser_will_close() throws Throwable {
	    	driver.quit();
	       
	    }
	    @When("^i use locator for finding multiple elements$")
	    public void i_use_locator_for_finding_multiple_elements() throws Throwable {
	    	elementlist= driver.findElements(By.xpath("//input"));
	    }

	    @Then("^it should return a list of multiple elements$")
	    public void it_should_return_a_list_of_multiple_elements() throws Throwable {
	    	System.out.println(elementlist.size());
	    }


}
