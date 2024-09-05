package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	
	WebDriver driver;
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtFirstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtLastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txtTelphone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPass;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtConPass;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement ChkPolicy;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;
	
	public void setFirstsName(String fname) {
		txtFirstname.sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		txtLastname.sendKeys(lname);
	}
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void setTelPhonel(String telphone) {
		txtTelphone.sendKeys(telphone);
}
	public void setpass(String pass) {
		txtPass.sendKeys(pass);
}
	
	public void setconpass(String conpass) {
		txtConPass.sendKeys(conpass);
}
	
	public void setPrivacyPolicy() {
		ChkPolicy.click();
}
	
	public void clickContinue() {
		btnContinue.click();
	}
	
	
	
}
