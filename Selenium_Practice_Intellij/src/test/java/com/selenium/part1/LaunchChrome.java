package com.selenium.part1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.basicRequirements.PathProperties;

public class LaunchChrome {
	
	public static void main(String args[]) throws Exception
	{
		
		PathProperties pp = new PathProperties();
		System.setProperty("webdriver.chrome.driver",pp.obj.getProperty("chromeDriverLocation"));
		System.out.println(System.getProperty("webdriver.chrome.driver"));
		System.out.println(System.getProperty("user.dir"));
		
//		Properties obj = new Properties();
//		FileInputStream objfile = new FileInputStream("src\\test\\resources\\Properties\\ObjectRepositiry.properties");
//		obj.load(objfile);
//		
//		//System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Drivers\\ChromeDriver\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver",obj.getProperty("chromeDriverLocation"));
//		System.out.println(obj.getProperty("chromeDriverLocation"));
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Navigate successful");
		driver.manage().window().maximize();
		String givenTitle = "OrangeHRM";
		String expectedTitle = driver.getTitle();
		System.out.println("Website Title: " + expectedTitle);
		System.out.println("Title Matched: " + givenTitle.equals(expectedTitle));
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
		System.out.println("Driver closed successfully");
	}

}
