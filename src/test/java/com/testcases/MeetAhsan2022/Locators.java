package com.testcases.MeetAhsan2022;

import org.openqa.selenium.By;

public class Locators {
	
	//Login locators
	public static By Email=By.xpath("//input[@type='email']");
	public static By Password= By.xpath("//input[@type='password']");
	public static By Click_Submitbutton=By.xpath("//button");
	public static By Validation_message= By.xpath("//p[@class='invalid-feedback']");
	
	
	//Project Locators
	public static By Projects=By.xpath("//div[@id='app']/div[2]/div/div/nav[1]/a[2]");
	public static By MyTask=By.xpath("//div[@id='app']/div[2]/div/div/nav[1]/a[3]");
	//public static String ApplyFilter="//div[@id='app']/div[3]/main/div[2]/div[1]/div/div/div[1]/input";
	public static By SearchFilterFound=By.xpath("//div[@class='bg-white shadow overflow-hidden rounded-md']//ul");
	public static By S_NotFound=By.xpath("//span[@class='text-gray-600']");
	public static By Selectsearchfilter=By.xpath("//body/div[@id='app']/div[@class='flex flex-col w-0 flex-1 overflow-hidden']/main[@class='flex flex-col flex-1 relative z-0 overflow-y-auto pt-6 focus:outline-none']/div[@class='container mx-auto flex flex-col flex-1 px-4 sm:px-6 md:px-8 py-4']/div[@class='bg-white shadow overflow-hidden rounded-md']/ul/li[1]/a[1]/div[1]");
	public static By ClickonFilter=By.xpath("//span[@class='ml-2']");
	public static By F_selectStatus=By.xpath("//div[@class='form-group mb-6']/select/option[3]");
	public static By F_selectvisbility=By.xpath("//div[@class='form-group']/select/option[1]");
	public static By Create_Project=By.xpath("//button[@class='btn btn-indigo']");
	public static By Click_calendar=By.xpath("//div[@id='app']/div[3]/main/div[3]/div/div/div[2]/section/div/div[3]//input");
	public static By Start_date= By.xpath("//div[@class='flatpickr-days']/div/span[@class='flatpickr-day today']");
	public static By End_Date= By.xpath("//div[@class='flatpickr-days']/div/span[@class='flatpickr-day nextMonthDay'][1]");
	public static By ApplyFilter = By.xpath("//input[@placeholder='Search..']");
	public static By Validate_emptyproject_name=By.xpath("//div[@class='flex flex-col px-6 pt-6 pb-6']/div[1]//p");
    public static By Validate_emptydescription=By.xpath("//div[@class='flex flex-col px-6 pt-6 pb-6']/div[2]//p");
    public static By Project_Selection = By.xpath("//div[@id='app']/div[3]/main/div[2]/div[3]/ul/li[1]");
    public static By AddColumn=   By.xpath("//div[@id='app']/div[3]/main/div[2]/div/div/a");
    public static By AddColumn_Name = By.xpath("//input");
    public static By AddColumnTask=By.xpath("//div[@class='column max-w-xs w-full flex-shrink-0 rounded-lg mr-3']/div/div[1]/div/button");
    public static By Add_button = By.xpath("//div[@id='app']/div[3]/main/div[2]/div[1]/div/div[1]/div/button");
	public static By Add_Task = By.xpath("//div[@id='app']/div[3]/main/div[2]/div[1]/div/div[2]/div[1]/input");
	public static By pickitems = By.xpath("//div[@id='app']/div[3]/main/div[2]/div[1]/div/div[2]/div/a");
	// Check mark completed
	public static By Mark_completed=By.xpath("//input[@type='checkbox']");
	public static By Add_comment=By.xpath("//div[@class='bg-white rounded-lg shadow-xl transform transition-all sm:max-w-xl sm:w-full']/div[3]/section/div/div[1]/textarea");
	public static By send_comment=By.xpath("//div[@class='bg-white rounded-lg shadow-xl transform transition-all sm:max-w-xl sm:w-full']/div[3]/section/div/div[1]/div/div[1]/button");
	public static By Close_popup=By.xpath("//div[@id='app']/div[3]/main/div[3]/div/div/div[1]/div[3]/button");
	
	
	
	//Dashboard locators
	public static By Dashboard=By.xpath("//div[@id='app']/div[2]/div/div/nav[1]/a[1]");
	public static By ViewT_projectList=By.xpath("//div[@class='mt-5 grid grid-cols-1 gap-6 sm:grid-cols-2 lg:grid-cols-4 mb-6']/div[1]/div[2]");
	public static By ViewT_Tasks= By.xpath("//div[@class='mt-5 grid grid-cols-1 gap-6 sm:grid-cols-2 lg:grid-cols-4 mb-6']/div[2]/div[2]");
	public static By View_OpenTasks= By.xpath("//div[@class='mt-5 grid grid-cols-1 gap-6 sm:grid-cols-2 lg:grid-cols-4 mb-6']/div[3]/div[2]");
	public static By ViewC_tasks= By.xpath("//div[@class='mt-5 grid grid-cols-1 gap-6 sm:grid-cols-2 lg:grid-cols-4 mb-6']/div[4]/div[2]");
	public static By Completed_projecCount=By.xpath("//div[@class='mt-5 grid grid-cols-1 gap-6 sm:grid-cols-2 lg:grid-cols-4 mb-6']/div[1]/div[1]/div/div[2]/dl/dd/div");
	public static By TotalTask_count =By.xpath("//div[@class='mt-5 grid grid-cols-1 gap-6 sm:grid-cols-2 lg:grid-cols-4 mb-6']/div[2]/div[1]/div/div[2]/dl/dd/div");
	public static By OpenTask_count= By.xpath("//div[@class='mt-5 grid grid-cols-1 gap-6 sm:grid-cols-2 lg:grid-cols-4 mb-6']/div[3]/div[1]/div/div[2]/dl/dd/div");
	public static By Completed_task_count= By.xpath("//div[@class='mt-5 grid grid-cols-1 gap-6 sm:grid-cols-2 lg:grid-cols-4 mb-6']/div[4]/div[1]/div/div[2]/dl/dd/div");
	public static By Loop_count_task=By.xpath("//dl/dd/div");
}
