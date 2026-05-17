package com.simplilearn.Goibibo_Selenium_Project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.simplilearn.Goibibo_Selenium_Project.utils.Log;

public class LoginPage extends BasePage{
	
	//Define all login page elements
	@FindBy(name="username")                   // locators username
	public WebElement login_username;
	
	@FindBy(name="password")                    // locator for password
	public WebElement login_password;
	
	@FindBy(tagName="button")                     // locator for login button
	public WebElement login_button;
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}	

}