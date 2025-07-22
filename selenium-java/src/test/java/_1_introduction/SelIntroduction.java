package _1_introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priyamps\\Downloads\\SELENIUM\\Drivers\\ChromeDriver\\chromedriver 108\\chromedriver.exe");
		//ChromeDriver driver =  new ChromeDriver();
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com");
		
		
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println("Title: " + driver.getTitle());
		System.out.println("URL: " + driver.getCurrentUrl());
		
		driver.close();

	}

}
 