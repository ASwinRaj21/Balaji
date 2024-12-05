package com.fb.baseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	public void browserLaunch() {
		WebDriverManager.edgedriver().setup();
		EdgeOptions option =new EdgeOptions();
		option.addArguments("--start-maximized");
		option.addArguments("--disable-popups");
		option.addArguments("--disable-notifications");
		
		
		driver = new EdgeDriver(option);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	public void applicationLaunch() {
		driver.get("https://www.facebook.com");
	}
	
	public void sendText(WebElement ele,String text) {
		ele.sendKeys(text);
	}
	
	public void button(WebElement ele) {
		ele.click();
	}
}
