package com.selenium.part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.basicRequirements.PathProperties;


public class HandlingFrames {
	
	public static void main(String args[]) throws Exception
	{
		
		PathProperties pp = new PathProperties();
		System.setProperty("webdriver.chrome.driver",pp.obj.getProperty("chromeDriverLocation"));
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.switchTo().frame("a077aa5e");
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/a/img")).click();
		System.out.println("********Switched to the iframe*******");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(4000);
		
		driver.close();
		
		
	}

}

