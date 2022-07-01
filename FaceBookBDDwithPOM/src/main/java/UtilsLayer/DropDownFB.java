package UtilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClassFB;

public class DropDownFB extends BaseClassFB{
	public static Select sel;
	
	public static void selectDropDownByVisibleText(WebElement wb, String value) {
		
		  new Select(wb).selectByVisibleText(value);
		
		
	}
	
	public static void selectDropDownByIndex(WebElement wb,int index) {
		new Select(wb).selectByIndex(index);
		
		
		
	}
	
	public  static String selecDropDownByvalue(WebElement wb) {
		return new Select(wb).getFirstSelectedOption().getText();
		
	}

}
