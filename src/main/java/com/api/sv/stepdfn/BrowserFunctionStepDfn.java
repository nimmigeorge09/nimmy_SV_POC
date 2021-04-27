package com.api.sv.stepdfn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.api.sv.helper.BrowserHelper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BrowserFunctionStepDfn {
	private WebDriver driver;
	private WebDriver.Navigation navigate;
	private BrowserHelper BH;
	
	 @Given("^BrowserFunction_1 I have a chrome driver instance$")
	    public void browserfunction1_i_have_a_chrome_driver_instance() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "/home/nimmy/Nimmy/chromedriver_linux64/chromedriver");
		 ChromeOptions options = new ChromeOptions();
		   options.addArguments("start-maximized"); // open Browser in maximized mode
		   options.addArguments("disable-infobars"); // disabling infobars
		   options.addArguments("--disable-extensions"); // disabling extensions
		   options.addArguments("--disable-gpu"); // applicable to windows os only
		   options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		   options.addArguments("--no-sandbox"); // Bypass OS security model
		   driver = new ChromeDriver(options);
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   BH=BrowserHelper.getInstance(driver);
	       
	    }
	 	@And("^BrowserFunction_1 call the get with url \"([^\"]*)\" and it should open the page$")
	    public void browserfunction1_call_the_get_with_url_something_and_it_should_open_the_page(String url) throws Throwable {
	 		driver.get(url);
	       
	    }

	    @When("^BrowserFunction_1 call the quit method the browser will close$")
	    public void browserfunction1_call_the_quit_method_the_browser_will_close() throws Throwable {
	    	driver.quit();
	       
	    }
	    
	    @Then("^BrowserFunction_1 call the back api which makes the brower to navigate backwards$")
	    public void browserfunction1_call_the_back_api_which_makes_the_brower_to_navigate_backwards() throws Throwable {
	        /*navigate=driver.navigate();
	        navigate.back();*/
	    	BH.moveBackward();
	        
	    }

	    @Then("^BrowserFunction_1 call the forward api which makes the browser to move forward$")
	    public void browserfunction1_call_the_forward_api_which_makes_the_browser_to_move_forward() throws Throwable {
	      //  navigate.forward();
	    	BH.moveForward();
	    }

	    @Then("^BrowserFunction_1 call the refresh api which refreshes the current page in browser$")
	    public void browserfunction1_call_the_refresh_api_which_refreshes_the_current_page_in_browser() throws Throwable {
	        //navigate.refresh();
	    	BH.refresh();
	    }

	    
}
