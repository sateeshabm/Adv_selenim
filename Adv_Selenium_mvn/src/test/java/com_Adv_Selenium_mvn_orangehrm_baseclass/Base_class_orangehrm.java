package com_Adv_Selenium_mvn_orangehrm_baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Base_class_orangehrm  {
	 public WebDriver driver;
	 WebDriverWait wait;
	 public JavascriptExecutor jss;
	@BeforeMethod
	public void openApp()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	
	
		wait=new WebDriverWait(driver, 10);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 jss = (JavascriptExecutor)driver;
		
	}
	@AfterMethod
	public void closeApp()
	{
		//driver.quit();
	}

}
