package com.testcases.MeetAhsan2022;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateProject {
	
		
		@Test(description = "Create Project")
		public void ProjectMenu() throws InterruptedException {
		Configurations.driver.findElement(Locators.Projects).click();
		Thread.sleep(3000);
		}
		
		@Test(description = "Create Project")
		public WebElement Create() throws InterruptedException {
			Configurations.driver.findElement(Locators.Create_Project).click();;
			WebElement name= Configurations.driver.findElement(By.xpath("//input[@id='project-name']"));
			WebElement description=Configurations.driver.findElement(By.xpath("(//input[@id='project-description'])"));
			
			Thread.sleep(3000);
			return name;

		}

	public void TestArray() throws InterruptedException {
	Thread.sleep(7000);	
	 List<WebElement> categories = Configurations.driver.findElements(By.xpath("//div[@class='wp-block-group__inner-container']/ul/li/a"));
		//for(int i=0; i<categories.size();i++)
		for (WebElement data:categories) {
			
			System.out.println(data.getText());
			
			
		}
		
	}

public void array() {
	ArrayList<String> arlTest = new ArrayList<String>();
	 //Size of array
	 System.out.println("Size of ArrayList at creation: " + arlTest.size());
	 
	 //Lets add some elements to it
	 arlTest.add("Selenium");
	 arlTest.add("Mobile");
	 arlTest.add("Web Services");
	 arlTest.add("Security");
	 //Recheck the size after adding elements
	 System.out.println("Size of ArrayList after adding elements: " + arlTest.size());
	 //Display all contents of ArrayList
	 System.out.println("List of all elements: " + arlTest);
	 //Remove some elements from the list
	 arlTest.remove("Mobile");
	 System.out.println("See contents after removing one element: " + arlTest);
	 //Remove element by index
	 arlTest.remove(2);
	 System.out.println("See contents after removing element by index: " + arlTest);
	 //Check size after removing elements
	 System.out.println("Size of arrayList after removing elements: " + arlTest.size());
	 System.out.println("List of all elements after removing elements: " + arlTest);
	 //Check if the list contains "K"
	 System.out.println(arlTest.contains("Security"));
}






		
}
