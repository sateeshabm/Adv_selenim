package com_Adv_Selenium_mvn_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_facebook {
	//stage1
	@FindBy(id="email")
	private WebElement UN_txt;
	//stage2
	public Pom_facebook(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	//stage3
//	public void getUN() {
//		UN_txt.sendKeys("hiii");
//		
//	}
    //TYpe2
//	public void getUN(String un)
//	{
//		UN_txt.sendKeys(un);
//	}
	//type 3
	public WebElement getUN()
	{
		return UN_txt;
	}
}
