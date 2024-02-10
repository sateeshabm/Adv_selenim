package com_Adv_Selenium_mvn_orangehrm_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_orangehrm {
	@FindBy(name = "username")
	private WebElement un_txt;
	@FindBy(name = "password")
	private WebElement pass_txt;
	@FindBy(xpath = " //button[text()=' Login ']")
	private WebElement login_btn;
	@FindBy(xpath = "//div[@class='emp-distrib-chart'][1]")
	private WebElement chart;
	
	public Pom_orangehrm(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getun() {
		return un_txt;
	}
	public WebElement getpass()
	{
		return pass_txt;
	}
	public WebElement getlog() 
	{
		return login_btn;
	}
	public WebElement getchart()
	{
	return chart;
		
	}

	


}
