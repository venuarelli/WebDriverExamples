package com.apipracticeexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.paytm.pages.BasePage;

public class MultiWindowHandling  extends BasePage{

	public MultiWindowHandling(WebDriver driver) {
		super(driver);
	}
	
	@FindBy()
	WebElement facebook;

}
