package com.testcases.MeetAhsan2022;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Frame;

import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Projects {
	@Test(groups = {"Project"})
	public void ProjectMenu() throws InterruptedException {
		Configurations.driver.findElement(Locators.Projects).click();
		Thread.sleep(3000);

	}
	
	@Test(description = "Apply search Filter",dependsOnMethods = {"ProjectMenu"})
	public void ApplysearchFilter() throws InterruptedException {
		WebElement filter= Configurations.driver.findElement(Locators.ApplyFilter);
		filter.sendKeys("ep");
		 Thread.sleep(6000);
			  
	    //Take input from user to apply
	    //Scanner s = new Scanner(System.in);
	   //System.out.println("Enter value search data in filter"); 
	   //String s_filter= s.nextLine();
	   //search.sendKeys(GenerateRandomString.getSaltString(),Keys.ENTER);
	      List<WebElement> dynamicElement=Configurations.driver.findElements(Locators.SearchFilterFound);
		  if(dynamicElement.size() != 0) {
		  System.out.println("List of filter results are displayed");
		  //Configurations.driver.findElement(Locators.Selectsearchfilter).click(); 
		  System.out.println("Filter result found");
		  } 
		  else { WebElement S_notfound=
		  Configurations.driver.findElement(Locators.S_NotFound); String
		  ResultNotFound = S_notfound.getText(); System.out.println(ResultNotFound);
		  
		  }
		 
	  }
	 

		@Test(description = "Create Project", groups = {"Project"})
		public void CreateProject() throws InterruptedException {
		Configurations.driver.findElement(Locators.Create_Project).click();
		Configurations.driver.findElement(By.xpath("//input[@id='project-name']")).sendKeys("Shipboard 1");
		Configurations.driver.findElement(By.xpath("(//input[@id='project-description'])")).sendKeys("Project created for testing purpose");
		Configurations.driver.findElement(Locators.Click_calendar).click();
		Thread.sleep(3000);
		Configurations.driver.findElement(Locators.Start_date).click();
		Thread.sleep(3000);
		Configurations.driver.findElement(Locators.End_Date).click();
		Configurations.driver.findElement(By.xpath("//button[normalize-space()='Save Project']")).click();
		System.out.println("The project has been created successfully");
		Thread.sleep(3000);
		Configurations.driver.findElement(Locators.Project_Selection).click();
		Thread.sleep(3000);
		 
}
	
		
		@Test(description = "Add Column")
		public void AddColumns() throws InterruptedException {
			
			Configurations.driver.findElement(Locators.Add_Task).sendKeys("Selenium",Keys.ENTER);
			for(int i=1;i<=10;i++) {
				Configurations.driver.findElement(Locators.Add_button).click();
				Configurations.driver.findElement(Locators.Add_Task).sendKeys(Configurations.faker.name().fullName(),Keys.ENTER);
				Thread.sleep(3000);
				Components.JustAddColumn();
				
				
			}
			
		}
		
		@Test(description = "Check mark completed")
		public void MarkComplete() throws InterruptedException {
		    for(int i=1;i<=10;i++) {
				Configurations.driver.findElement(By.xpath("//div[@id='app']/div[3]/main/div[2]/div[1]/div/div[2]/div/a["+i+"]")).click();
				Thread.sleep(4000);
				Configurations.driver.findElement(Locators.Mark_completed).click();
				Thread.sleep(4000);
				Configurations.driver.findElement(Locators.Add_comment).sendKeys("Testing" +i);
				Thread.sleep(4000);
				Configurations.driver.findElement(Locators.send_comment).click();
				Thread.sleep(3000);
				Configurations.driver.findElement(Locators.Close_popup).click();
				Thread.sleep(3000);
				
			}
		}
		
		
		@Test(description = "Check Validation on save Project with empty fields")
		public void Validate_SaveProject() throws InterruptedException {
		Configurations.driver.findElement(Locators.Create_Project).click();
		Configurations.driver.findElement(By.xpath("//input[@id='project-name']"));
		Configurations.driver.findElement(By.xpath("(//input[@id='project-description'])"));
		Configurations.driver.findElement(By.xpath("//button[normalize-space()='Save Project']")).click();
		Thread.sleep(3000);
		String validate_projectname=  Configurations.driver.findElement(Locators.Validate_emptyproject_name).getText();
		String validate_description=  Configurations.driver.findElement(Locators.Validate_emptydescription).getText();
		System.out.println(validate_projectname+" ," +validate_description);
		Configurations.driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();
	    Thread.sleep(3000);

	}
	
	

	
	@Test(description = "Cancel Project")
	public void CancelProject() throws InterruptedException {
	  Thread.sleep(3000);
	  Configurations.driver.findElement(Locators.Create_Project).click();
	  Configurations.driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
	  System.out.println("Created project cancelled successfully");
	  Thread.sleep(3000);

	  }
	  
		
	 @Test(description = "Advance Filters",dependsOnMethods = {"ProjectMenu"})
	 public void AdvanceFilters() throws InterruptedException {
	 Thread.sleep(3000); 
	 WebElement clearsearch =Configurations.driver.findElement(Locators.ApplyFilter);
	 clearsearch.sendKeys(Keys.CONTROL + "a"); clearsearch.sendKeys(Keys.DELETE);
	 Configurations.driver.findElement(Locators.ClickonFilter).click();
	 Configurations.driver.findElement(Locators.F_selectStatus).click();
	 System.out.println("Advance Filters applied successfully ");
	 Thread.sleep(6000); 
	}
		
}