package com.selenium.part2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.basicRequirements.PathProperties;


public class MouseKeyboardActions {

	public static void main(String args[]) throws Exception
	{
		
		PathProperties pp = new PathProperties();
		System.setProperty("webdriver.chrome.driver",pp.obj.getProperty("chromeDriverLocation"));
		WebDriver driver = new ChromeDriver();
		driver.get("newtours.demoaut.com/mercurywelcome.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
}
