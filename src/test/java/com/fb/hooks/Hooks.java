package com.fb.hooks;

import com.fb.baseclass.BaseClass;

import io.cucumber.java.Before;

public class Hooks {
	BaseClass base = new BaseClass();
	
	@Before
	public void launchBrowser() {
		base.browserLaunch();
	}
}
