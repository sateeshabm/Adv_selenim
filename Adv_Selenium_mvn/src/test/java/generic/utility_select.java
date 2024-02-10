package generic;

import org.openqa.selenium.WebElement;

import com_Adv_Selenium_mvn_utility.utility_object;

public class utility_select 
{
	public static void selectbyindex(WebElement ele,int index) 
	{
		utility_object.select_object(ele).selectByIndex(index);
	}
	public static void selectbyvalue(WebElement ele,String str) 
	{
		utility_object.select_object(ele).selectByValue(str);
	}
	public static void selectbyvisibletxt(WebElement ele,String str) 
	{
		utility_object.select_object(ele).selectByVisibleText(str);
	}
	public static void deselectall(WebElement ele) 
	{
		utility_object.select_object(ele).deselectAll();
	}
	public static void deselectbyindex(WebElement ele,int id) 
	{
		utility_object.select_object(ele).deselectByIndex(id);
	}
	public static void deselectbyvalue(WebElement ele,String str) 
	{
		utility_object.select_object(ele).deselectByValue(str);
	}
	public static void deselectbyvisibletxt(WebElement ele,String str) 
	{
		utility_object.select_object(ele).deselectByVisibleText(str);
	}
	public static void getoptions(WebElement ele) 
	{
		utility_object.select_object(ele).getOptions();
	}
	public static void getfirstselectedoption(WebElement ele) 
	{
		utility_object.select_object(ele).getFirstSelectedOption();
	}
	public static void getallselectedoptions(WebElement ele) 
	{
		utility_object.select_object(ele).getAllSelectedOptions();
	}
	public static void getwrapped(WebElement ele) 
	{
		utility_object.select_object(ele).getWrappedElement();
	}

}
