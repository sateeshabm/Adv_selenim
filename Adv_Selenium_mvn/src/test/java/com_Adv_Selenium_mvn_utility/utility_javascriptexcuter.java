package com_Adv_Selenium_mvn_utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class utility_javascriptexcuter 
{
	public static void scrool_actions(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor jss = utility_object.javasriptexcuter(driver);
		jss.executeScript("arguments.scrollIntoView()", ele);
	}
	
	public static void disabaled_ele(WebDriver driver,String value, WebElement ele)
	{
		JavascriptExecutor jss = utility_object.javasriptexcuter(driver);
		jss.executeScript("arguments[0].value='"+value+"'",ele);
	}
	

}
