package com.ESPN.common;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonESPN {
public static WebDriver driver;
String URL="http://espn.go.com/";


	public void openBrowser(){
		
	    driver=new FirefoxDriver();
	    driver.manage().window().maximize();
		System.out.println("open Firefox");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	

	public void closeBrowser(){
		
		driver.manage().deleteAllCookies();
		driver.quit();
		System.out.println("close FF");
	}
	
	
	public void GoToUrl(){
		
		driver.get(URL);
		
		
	}	
	

	//public WebDriver getDriver(){
		//return driver;
	//}

	
}
