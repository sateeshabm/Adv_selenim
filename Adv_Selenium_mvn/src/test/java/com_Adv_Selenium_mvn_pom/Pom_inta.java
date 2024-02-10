package com_Adv_Selenium_mvn_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Pom_inta {
	@FindBy(name = "username")
	private WebElement un_txt;
	@FindBy(name = "password")
	private WebElement pwd_txt;
	@FindBy(xpath = "//div[text()='Log in']")
	private WebElement log;
	
	public Pom_inta(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		
	}
	public void getun()
	{
		un_txt.sendKeys("hii");
//		pwd_txt.sendKeys("hiii");
//		log.click();
	}
	public void getpwd()
	{
	pwd_txt.sendKeys("hiiiiiiiiii");	
	}
	public void get_log() {
		log.click();
	}
	

}
