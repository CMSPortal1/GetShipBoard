package com.testcases.MeetAhsan2022;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MyTask {
	
	@Test
	public void TaskMenu() throws InterruptedException {
		Configurations.driver.findElement(Locators.MyTask).click();
		Thread.sleep(3000);
	

	}

}
