package com_Adv_Selenium_mvn_Runner_class_orange;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import com_Adv_Selenium_mvn_orangehrm_baseclass.Base_class_orangehrm;
import com_Adv_Selenium_mvn_orangehrm_pom.Pom_orangehrm;


public class Runner_orangehrm extends Base_class_orangehrm
{
	@Test
	public void run() throws InterruptedException
	{
		Pom_orangehrm p=new Pom_orangehrm(driver);
		 p.getun().sendKeys("Admin");
	
		Thread.sleep(4000);
		p.getpass().sendKeys("admin123");
		Thread.sleep(4000);
		p.getlog().click();
		Thread.sleep(4000);
		 WebElement ele = p.getchart();
		 Point loc = ele.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		jss.executeScript("window.scrollBy("+x+","+y+")");
		
	}

}

