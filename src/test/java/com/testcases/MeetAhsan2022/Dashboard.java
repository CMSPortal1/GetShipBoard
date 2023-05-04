package com.testcases.MeetAhsan2022;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Dashboard {

	@Test(description = "Dashboard menu")
	public void DashboardMenu() throws InterruptedException {
		Configurations.driver.findElement(Locators.Dashboard).click();
		System.out.println("Dashboard clicked successfully");
		Thread.sleep(3000);
	}
	
	@Test(description = "View Total Project List",dependsOnMethods = {"DashboardMenu"})
	public void ViewTotalProjects() {
		String Count= Configurations.driver.findElement(Locators.Completed_projecCount).getText();
		Configurations.driver.findElement(Locators.ViewT_projectList).click();
		System.out.println("Total Project View list is opened successfully"+ " "+ Count);
		
	}
	
	@Test(description = "View Total Task List",dependsOnMethods = {"DashboardMenu"})
	public void ViewTotalTasks() throws InterruptedException {
		Dashboard D_board=new Dashboard();
		D_board.DashboardMenu();
		String Count= Configurations.driver.findElement(Locators.TotalTask_count).getText();
		Configurations.driver.findElement(Locators.ViewT_Tasks).click();
		System.out.println("Total Tasks View list is opened successfully"+ " "+ Count);
		
	}
	
	@Test(description = "View Open Task List",dependsOnMethods = {"DashboardMenu"})
	public void ViewOpenTasks() throws InterruptedException {
		Dashboard D_board=new Dashboard();
		D_board.DashboardMenu();
		String Count= Configurations.driver.findElement(Locators.OpenTask_count).getText();
		Configurations.driver.findElement(Locators.View_OpenTasks).click();
		System.out.println("Total open task View list is opened successfully"+ " "+ Count);
	}
	
	@Test(description = "View Completed Task List",dependsOnMethods = {"DashboardMenu"})
	public void ViewCompletedTasks() throws InterruptedException {
		Dashboard D_board=new Dashboard();
		D_board.DashboardMenu();
		String Count= Configurations.driver.findElement(Locators.Completed_task_count).getText();
		Configurations.driver.findElement(Locators.ViewC_tasks).click();
		System.out.println("Total completed Tasks View list is opened successfully"+ " "+ Count);
}
	
	@Test(description="LoopCount to find project")
	public void Count_project_taskinloop() throws InterruptedException {
		Dashboard D_board=new Dashboard();
		D_board.DashboardMenu();
		 List<WebElement> Task_count=Configurations.driver.findElements(Locators.Loop_count_task);
		 for (WebElement data:Task_count) {
				
				System.out.println(data.getText());
			}

		
		
	}
	

	
}
