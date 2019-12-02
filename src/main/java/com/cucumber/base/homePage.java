package com.cucumber.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	public WebDriver driver;
	public homePage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(id="username")
	private WebElement emailField;
	
	public WebElement getEmailField() {
		return emailField;
	}
	
	@FindBy(id="password")
	private WebElement passwordField;
	
	public WebElement getPasswordField() {
		return passwordField;
	}
	
	
	@FindBy(id="login")
	private WebElement loginBtn;
	
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
}
