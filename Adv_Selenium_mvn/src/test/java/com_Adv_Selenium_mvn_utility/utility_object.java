package com_Adv_Selenium_mvn_utility;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class utility_object {
	public static Actions Actions_object(WebDriver driver) {
		Actions act=new Actions(driver);
		return act;
	}
	public static Select select_object(WebElement ele) {
		Select sel= new Select(ele);
		return sel;
	}
	public static JavascriptExecutor javasriptexcuter(WebDriver driver) {
		JavascriptExecutor jss=(JavascriptExecutor)driver;
		return jss;
	}
	public static Robot robot_object() throws AWTException 
	{
		
			Robot r=new Robot();
			return r;
			
	}

}
