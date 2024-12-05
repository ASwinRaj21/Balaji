package com.fb.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import com.fb.baseclass.BaseClass;
import com.fb.pom.Locators;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login  {
	BaseClass base = new BaseClass();
	Locators loc = new Locators();
	@Given("user launches facebook application")
	public void user_launches_facebook_application() {
	    base.applicationLaunch();
	}

	@Given("user enters username")
	public void user_enters_username() {
	    base.sendText(loc.getUsername(), "Balaji");
	}

	@When("user enters password")
	public void user_enters_password() {
	    base.sendText(loc.getPassword(), "asd123");
	}

	@Then("user clicks login button")
	public void user_clicks_login_button() {
	   base.button(loc.getLogin());
	}
	
	

}
