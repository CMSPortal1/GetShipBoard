package com.testcases.MeetAhsan2022;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Login {
	@Test(description="Valid Login", groups = {"Login"})
	public void ValidLogin() throws InterruptedException {
		
		Configurations.driver.findElement(Locators.Email).sendKeys("first@example.com");
		Configurations.driver.findElement(Locators.Password).sendKeys("secret");
		Configurations.driver.findElement(By.xpath("//button")).click();
		System.out.println("Successfully Logged in");
		Thread.sleep(4000);
	}
	
	
	@Test(description="Invalid Login")
	public void InvalidLogin() throws InterruptedException {
		
		 Configurations.driver.findElement(Locators.Email).sendKeys("invalid_email@example.com");
		 Configurations.driver.findElement(Locators.Password).sendKeys("secret");
		 Configurations.driver.findElement(Locators.Click_Submitbutton).click();
		 Thread.sleep(3000);
		 String Validation_Msg= Configurations.driver.findElement(Locators.Validation_message).getText();
		 System.out.println(Validation_Msg);
		 Thread.sleep(4000);
	}
	
	
	@Test(description="Empty Login FieldsTest")
	public void EmptyLoginFieldsTest() throws InterruptedException {
		WebElement Email= Configurations.driver.findElement(Locators.Email);
		 Email.sendKeys(Keys.CONTROL + "a");
		 Email.sendKeys(Keys.DELETE);
		 WebElement pwd=Configurations.driver.findElement(Locators.Password);
		 pwd.sendKeys(Keys.CONTROL + "a");
		 pwd.sendKeys(Keys.DELETE);
		 Configurations.driver.findElement(Locators.Click_Submitbutton).click();
		 Thread.sleep(3000);

		String Email_Validation_msg= Configurations.driver.findElement(Locators.Validation_message).getText();
		String pwd_Validation_msg= Configurations.driver.findElement(By.xpath("//p[normalize-space()='The password field is required.']")).getText();
		Assert.assertEquals(Email_Validation_msg, "The email field is required.");
		Assert.assertEquals(pwd_Validation_msg, "The password field is required.");
		System.out.println(Email_Validation_msg+ "\n"+ pwd_Validation_msg);
		Thread.sleep(4000);
	}
	
	
	 @Test(description="Empty Email field Test")
	  public void EmptyEmailTest() throws InterruptedException {
	  WebElement Email= Configurations.driver.findElement(Locators.Email);
	  Email.sendKeys(Keys.CONTROL + "a");
	  Email.sendKeys(Keys.DELETE);
	  Configurations.driver.findElement(Locators.Password).sendKeys("secret");
	  Configurations.driver.findElement(Locators.Click_Submitbutton).click();
	  String Validation_msg= Configurations.driver.findElement(Locators.Validation_message).getText();
	  System.out.println(Validation_msg);
	  Configurations.driver.navigate().refresh();
	  Thread.sleep(4000);
	  }
	 
	
	
}
