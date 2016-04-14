package com.paytm.homepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileAndAccessoriesPage {
	
	    @Test
	    public void mobileAndAccessoriespage(){
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement mobileAndAccessories = driver.findElement(By.xpath("//a[text()='Mobile & Accessories']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(mobileAndAccessories).build().perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	    WebElement mobiles =	driver.findElement(By.partialLinkText("Mobiles"));
		mobiles.click();
		WebElement featurePhones = driver.findElement(By.linkText("Feature Phones"));
		featurePhones.click();
		WebElement feature = driver.findElement(By.xpath("//span[text()='Feature Phones']"));
	
		
		String actual = feature.getText();
		String expected  = "Feature Phones";
		
		Assert.assertEquals(actual, expected);
		
		driver.close();
		
		
	
	
	    }
}
