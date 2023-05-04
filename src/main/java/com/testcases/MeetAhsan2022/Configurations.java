package com.testcases.MeetAhsan2022;


import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Configurations {
	public static WebDriver driver;
	public static String URL="https://getshipboardsaas.com/login";
	public static Faker faker = new Faker();

	
@Test(groups = {"Browser"})
public void Browser() {
	
	WebDriverManager.chromedriver().setup();
	//To remove Automated text on browser
	ChromeOptions option= new ChromeOptions();
	option.setExperimentalOption("excludeSwitches", new String [] {"enable-automation"});
	driver= new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.get(URL);
	
}

@AfterSuite
public void TearDown() {
	driver.quit();
}
}
	

