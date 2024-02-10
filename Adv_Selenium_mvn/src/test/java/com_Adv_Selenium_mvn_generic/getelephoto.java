package com_Adv_Selenium_mvn_generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class getelephoto {
	public static void captureScreenshot(WebElement ele) 
	{
		Date d=new Date();
		String da=d.toString().replaceAll(":", "-");
		File src=ele.getScreenshotAs(OutputType.FILE);
		File drt = new File("./elephoto/"+da+".png");
		try {
			FileHandler.copy(src, drt);
		} catch (IOException e) {

System.out.println("element is not found");
		}
		
		
	}
	

}
