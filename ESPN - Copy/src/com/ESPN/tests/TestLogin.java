package com.ESPN.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import com.ESPN.common.CommonESPN;
import com.ESPN.pages.PageFactoryPage;




public class TestLogin extends CommonESPN{

public PageFactoryPage PF;

	
	@BeforeTest
	public void SetUp(){
	
		openBrowser();
		GoToUrl();
			
	}

	@Test
	public void VerifyTitleTest01(){
	//	System.out.println(driver.getCurrentUrl()+"1");
		PageFactoryPage PF=PageFactory.initElements(driver, PageFactoryPage.class);  
	//	System.out.println(driver.getCurrentUrl()+"2");
		PF.MouseOverBB();
		
//		PF=new PageFactoryPage();
//		PF.MouseOverAndClick();
		PF.VerifyTitle();
		
		
		
		
	}




	
	@AfterTest
	public void Close(){
		
		closeBrowser();
		
	}
	
	
	
	
	
	
	
	
	
}
