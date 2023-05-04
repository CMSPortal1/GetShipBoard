package com.testcases.MeetAhsan2022;

import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Components {
	
	@Test
	public static void JustAddColumn() throws InterruptedException {
		Configurations.driver.findElement(Locators.AddColumn).click();
		Thread.sleep(3000);
		Configurations.driver.findElement(Locators.AddColumn_Name).sendKeys("Trainings",Keys.ENTER);
		Thread.sleep(6000);
		Configurations.driver.findElement(Locators.Add_button).click();
		Thread.sleep(3000);
	}
	
}
