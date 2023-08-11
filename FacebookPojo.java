package org.tes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FacebookPojo extends Baseclass {

	public FacebookPojo() {
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBys({
		@FindBy(xpath = "//input[@id='email']"),
		@FindBy(xpath = "//input[@name='email']"),
		@FindBy(xpath = "//input[@data-testid='royal_email']")
	})
	private WebElement email;
	
	@FindAll({
		@FindBy(xpath = "//input[@id='pass']"),
		@FindBy(xpath = "//input[@name='pass']"),
		@FindBy(xpath = "//input[@data-testid='royal_pas']")
		
	})
	private WebElement password;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	

	
}
