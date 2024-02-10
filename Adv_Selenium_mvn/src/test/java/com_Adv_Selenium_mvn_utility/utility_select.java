package com_Adv_Selenium_mvn_utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class utility_select
{
	public static void select_option(WebElement ele,Object data)
	{
		Select sel = utility_object.select_object(ele);
		if (data instanceof Integer)
		{
			sel.selectByIndex((Integer)data);
		}
		else if(data instanceof String)
			try
		{
				sel.selectByValue((String)data);
		}
		catch(Exception e)
		{
			sel.selectByVisibleText((String)data);
		}
	}
	public static void desele_option(WebElement ele,Object data)
	{
		Select sel = utility_object.select_object(ele);
		if (data instanceof Integer)
		{
			sel.deselectByIndex((Integer)data);
		}
		else if(data instanceof String)
			try
		{
				sel.deselectByValue((String)data);
		}
		catch(Exception e)
		{
			sel.deselectByVisibleText((String)data);
		}
	}
	public static void desel_all_opts(WebElement ele) {
		Select sel = utility_object.select_object(ele);
		sel.deselectAll();
	}
	public static Select get_options(WebElement ele) {
		 Select sel = utility_object.select_object(ele);
		 return sel;
		 
	}
	public static void get_all_sel_opts(WebElement ele) {
		Select sel = utility_object.select_object(ele);
		sel.getClass();
	}
	public static WebElement get_frt_sel_opt(WebElement ele) 
	{
		Select sel = utility_object.select_object(ele);
		WebElement f_opt = sel.getFirstSelectedOption();
		return f_opt;

}
}
