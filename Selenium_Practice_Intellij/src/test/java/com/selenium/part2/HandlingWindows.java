package com.selenium.part2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.basicRequirements.PathProperties;



public class HandlingWindows {

	public static void main(String args[]) throws Exception
	{
		
		PathProperties pp = new PathProperties();
		System.setProperty("webdriver.chrome.driver",pp.obj.getProperty("chromeDriverLocation"));
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		String mainwindow = driver.getWindowHandle();
		Set <String> windows = driver.getWindowHandles();
		Iterator <String> str = windows.iterator();
		
		while(str.hasNext())
		{
			String childwindow = str.next();
			
			if(!mainwindow.equals(childwindow))
			{
				Thread.sleep(2000);
				driver.switchTo().window(childwindow);
				Thread.sleep(2000);
				System.out.println("Child Window title : " + driver.switchTo().window(childwindow).getTitle());
				driver.navigate().refresh();
				driver.close();
			}
		}
		driver.switchTo().window(mainwindow);
		System.out.println("Main Window title: " + driver.switchTo().window(mainwindow).getTitle());
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
