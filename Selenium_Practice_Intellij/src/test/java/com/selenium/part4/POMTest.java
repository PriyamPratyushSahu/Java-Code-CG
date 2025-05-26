package com.selenium.part4;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.basicRequirements.PathProperties;

public class POMTest {
	
	static POMPage pompage;
	
	public static void main(String args[]) throws Exception
	{
		
		PathProperties pp = new PathProperties();
		System.setProperty("webdriver.chrome.driver",pp.obj.getProperty("chromeDriverLocation"));
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		pompage = new POMPage(driver);
		
		pompage.loginOpertaion("admin","admin123");
		pompage.logoutOperation();
		
		driver.close();
		System.out.println("Driver closed successfully");
		
		
			
			
	}

}
