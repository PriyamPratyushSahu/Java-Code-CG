//Enter details and login into Orange HRM and log out

package com.selenium.part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.basicRequirements.PathProperties;

public class NavigateBack {
	
	public static void main(String args[]) throws Exception
	{
		
		PathProperties pp = new PathProperties();
		System.setProperty("webdriver.chrome.driver",pp.obj.getProperty("chromeDriverLocation"));
	WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("#gb > div > div:nth-child(1) > div > div:nth-child(1) > a")).click();
		System.out.println("Gmail clicked successfully");
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("Navigate Backward  successfully");
		Thread.sleep(3000);
		driver.navigate().forward();
		System.out.println("Navigate forward  successfully");
		Thread.sleep(3000);
		driver.close();
		System.out.println("Driver closed successfully");
		
	}
	

}
