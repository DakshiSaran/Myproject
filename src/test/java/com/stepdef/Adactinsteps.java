package com.stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.global.in.facebookpagepojo;

import base.com.Base;
import cucumber.api.java.en.*;

public class Adactinsteps extends Base {
	
	@Given("User launch the browser and navigates to facebook app")
	public void user_launch_the_browser_and_navigates_to_facebook_app() {
	   System.setProperty("webdriver.chrome.driver", "C:\\saran\\facebook\\driver\\chromedriver.exe");
	   getDriver();
	   driver.get("https://www.facebook.com/");
	}

	@When("User enters the Credentials in facebook app")
	public void user_enters_the_Credentials_in_facebook_app() {
		facebookpagepojo a=new facebookpagepojo();
	    insertType(a.getTxtUserName(),"8124719678");
	    insertType(a.getTxtPass(),"161973");
	  	    
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		facebookpagepojo a=new facebookpagepojo();
	Click(a.getBtnLogin());
	}
	 @When("^User enters the \"([^\"]*)\" and \"([^\"]*)\"in facebook app$")
	    public void user_enters_the_something_and_something_in_facebook_app(String username, String password) 
	    		throws Throwable {
		 facebookpagepojo a=new facebookpagepojo();
		 insertType(a.getTxtUserName(),username);
		 insertType(a.getTxtPass(),password);
		   
	 }
	@Then("User validates the error message")
	public void user_validates_the_error_message() {
	    WebElement authMsg=driver.findElement(By.xpath("//div[@class='_9ay7']"));
	    Assert.assertTrue("Auth error message is not displayed",authMsg.isDisplayed());
	    CloseBrowser();
	    
	}




}
