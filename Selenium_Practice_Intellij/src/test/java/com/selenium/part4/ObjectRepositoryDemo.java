//Enter details and login into Orange HRM and log out

package com.selenium.part4;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.basicRequirements.PathProperties;


public class ObjectRepositoryDemo {
	
	public static void main(String args[]) throws Exception
	{
		
		PathProperties pp = new PathProperties();
		System.setProperty("webdriver.chrome.driver",pp.obj.getProperty("chromeDriverLocation"));
		WebDriver driver = new ChromeDriver();
	
	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
			//User-name
			System.out.println("Username text: " + driver.findElement(By.cssSelector(pp.obj.getProperty("UsernameText"))).getText());
			driver.findElement(By.cssSelector(pp.obj.getProperty("Username"))).sendKeys("Admin");
			System.out.println("Username entered successfully");
			//Password
			driver.findElement(By.cssSelector(pp.obj.getProperty("Password"))).sendKeys("admin123");
			System.out.println("Password entered successfully");
			//Login Button
			driver.findElement(By.cssSelector(pp.obj.getProperty("Loginbutton"))).click();
			System.out.println("Login button clicked successfully");
			driver.navigate().refresh();
			Thread.sleep(3000);
			//Drop down menu for logout
			driver.findElement(By.cssSelector(pp.obj.getProperty("Dropdown"))).click();
			System.out.println("Drop down clicked successfully");
			Thread.sleep(3000);
			//Logout
			driver.findElement(By.cssSelector(pp.obj.getProperty("Logout"))).click();
			System.out.println("Logout option clicked successfully");

		Thread.sleep(3000);
		driver.close();
		System.out.println("Driver closed successfully");
		
	}


}
