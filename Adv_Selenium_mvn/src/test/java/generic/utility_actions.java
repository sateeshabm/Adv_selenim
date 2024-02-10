package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com_Adv_Selenium_mvn_utility.utility_object;

public class utility_actions {
	public static void mouse_hover(WebDriver driver,WebElement ele) 
	{
		utility_object.Actions_object(driver).moveToElement(ele).perform();
	}
	public static void mouse_hover_click(WebDriver driver,WebElement ele)
	{
		utility_object.Actions_object(driver).moveToElement(ele).click(ele).perform();
		
	}
	public static void right_click(WebDriver driver,WebElement ele)
	{
		utility_object.Actions_object(driver).contextClick(ele).perform();
	}
	public static void doube_clk(WebDriver driver,WebElement ele)
	{
		utility_object.Actions_object(driver).doubleClick(ele).perform();
	}
	public static void drag_drop(WebDriver driver,WebElement ele1,WebElement ele2)
	{
		utility_object.Actions_object(driver).dragAndDrop(ele1, ele2).perform();
	}
}
