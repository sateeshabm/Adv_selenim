package com_Adv_Selenium_mvn_runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com_Adv_Selenium_mvn_pom.Pom_inta;

public class Insta_runner {
	@Test
	public void run()
	{
		System.setProperty("webdriver.chrome.driver", "./Softweres/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Pom_inta p=new Pom_inta(driver);
		p.getun();
		p.getpwd();
		p.get_log();
		
		
	}

}