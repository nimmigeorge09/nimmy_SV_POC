package com.api.sv.stepdfn;

import com.api.sv.cucumber.BaseClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostStepDfn {
	
	private BaseClass baseclass;
	public  PostStepDfn(BaseClass baseClass) {
		// TODO Auto-generated constructor stub
		this.baseclass=baseClass;
	}
	@Given("^user should be logged in$")
    public void user_should_be_logged_in() throws Throwable {
        System.out.println("user should be logged in"+baseclass.getFeaturename());
        System.out.println("user should be logged in"+baseclass.getScenarioname());
    }

    @When("^i type the text as \"([^\"]*)\" in the textbox$")
    public void i_type_the_text_as_something_in_the_textbox(String strArg1) throws Throwable {
    	System.out.println("User entered valid text as"+strArg1+" and it appeared ");
    }

    @When("^user supply youtube link as \"([^\"]*)\" in the textbox$")
    public void user_supply_youtube_link_as_something_in_the_textbox(String strArg1) throws Throwable {
    	System.out.println("user supply the following youtube link "+strArg1+" and the link is active");
    }

    @Then("^the message should get posted$")
    public void the_message_should_get_posted() throws Throwable {
    	System.out.println("he message should get posted");
    }

    @Then("^video should get posted on the user wall$")
    public void video_should_get_posted_on_the_user_wall() throws Throwable {
    	System.out.println("video should get posted on the user wall");
    }

    @And("^should be present at its own wall$")
    public void should_be_present_at_its_own_wall() throws Throwable {
    	System.out.println("should be present at its own wall");
    }

    @And("^click on post button$")
    public void click_on_post_button() throws Throwable {
    	System.out.println("click on post button");
    }

    @And("^the video should have proper thumpnail$")
    public void the_video_should_have_proper_thumpnail() throws Throwable {
    	System.out.println("the video should have proper thumpnail");
    }
}
