package com.fb.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.baseclass.BaseClass;

public class Locators {

	public Locators() {
		
	PageFactory.initElements(BaseClass.driver, this);
	
	}
	
	@FindBy(name = "email")
	private WebElement username;
	
	@FindBy(name = "pass")
	private WebElement password;
	
	@FindBy(name = "login")
	private WebElement login;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
}
