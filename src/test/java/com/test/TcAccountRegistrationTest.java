package com.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pom.AccountRegistrationPage;
import com.pom.HomePage;

import junit.framework.Assert;

public class TcAccountRegistrationTest {
	
	public WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	@Test
	public void verify_account_registration()
	{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		
		regpage.setFirstsName("Vaishnavi");
		regpage.setLastName("mutkure");
		regpage.setEmail("vpmutkure@gmail.com");
		regpage.setTelPhonel("7769070868");
		
	
		
		//String password=randomAlphaNumeric();
		
		regpage.setpass("V@12345m");
		regpage.setconpass("V@12345m");
		
		regpage.setPrivacyPolicy();
		
	
	}
}