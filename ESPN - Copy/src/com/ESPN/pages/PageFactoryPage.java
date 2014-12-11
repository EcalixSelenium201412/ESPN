package com.ESPN.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ESPN.common.CommonESPN;




public class PageFactoryPage extends CommonESPN{

	
	@FindBy (how = How.XPATH, using = ".//*[@id='menu-nfl']/a")
	private WebElement NFL;
	
    @FindBy (how = How.XPATH, using = ".//*[@id='menu-nfl']/div/div[1]/div/div/ul/li[2]/a")
    private WebElement Score;
	
    @FindBy (how=How.CLASS_NAME,using="section-title")
	private WebElement Title;
	

	
	
	public void VerifyTitle(){
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(Title.getText(),"NFL Scoreboard");
		System.out.println(Title.getText());
		System.out.println("Verified");
		
	}
	
	
	public void MouseOverAndClick(){
		System.out.println("PageObject method working");

		
		Actions action = new Actions(driver);
		WebElement list= driver.findElement(By.xpath("/html/body/div[4]/div[4]/div[8]/div/div/ul/ul/li[2]/a"));
        action.moveToElement(list).perform();
        action.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div[4]/div[8]/div/div/ul/ul/li[2]/div/div[1]/div/div/ul/li[2]/a"))).click().build().perform();
	
	}
	
	
	public void MouseOverBB(){
		//   System.out.println(driver.getCurrentUrl());
		   System.out.println("PageFactory method working");
		   Actions builder = new Actions(driver);    
		   builder.moveToElement(NFL).build().perform();
		   builder.moveToElement(Score).click().build().perform();
		   System.out.println("builder worked");
		   
		//   NFL.click();
		   
		   
		   
	}
	
	
	
	
	
	
}
