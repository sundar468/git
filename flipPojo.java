package org.tes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipPojo extends Baseclass {
	
	public flipPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement email;
	
	@FindBy(className = "_2KpZ6l _2HKlqd _3AWRsL")
	private WebElement button;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getButton() {
		return button;
	}

	

}
