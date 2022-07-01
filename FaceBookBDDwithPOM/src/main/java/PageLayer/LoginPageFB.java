package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClassFB;
import UtilsLayer.DropDownFB;

public class LoginPageFB extends BaseClassFB {
	
	@FindBy(name="firstname")
	WebElement uName;
	
	@FindBy(name="lastname")
	WebElement lName;
	
	@FindBy(name="reg_email__")
	WebElement emailID;
	
	@FindBy(name="reg_passwd__")
	WebElement confirmPass;
	
	@FindBy(xpath="//input[@value='1']")
	WebElement Button;
	
	@FindBy(xpath="//button[text()='Sign Up']")
	WebElement Loginbutton;
	
	public LoginPageFB() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void LoginPageFunctionality(String userName, String lastName, String email, String passWord) {
		uName.sendKeys(userName);
		lName.sendKeys(lastName);
		emailID.sendKeys(email);
		confirmPass.sendKeys(passWord);
		Button.click();
		Loginbutton.click();
		
	
			
			
		}
		
		public void validateCheckBox() {
			
			Button.isDisplayed();
			Button.isSelected();
		
			
			
		
		
	}
		
		public void DropDown() {
			
			DropDownFB.selectDropDownByIndex(Button, 19);
			DropDownFB.selectDropDownByVisibleText(Button, "Dec");
			DropDownFB.selectDropDownByVisibleText(Button, "1994");
		}

}
