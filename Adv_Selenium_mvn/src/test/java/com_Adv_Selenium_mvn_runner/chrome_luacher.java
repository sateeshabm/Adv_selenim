package com_Adv_Selenium_mvn_runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chrome_luacher 
{
	@Test
	public void run()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	}
	
	

}
