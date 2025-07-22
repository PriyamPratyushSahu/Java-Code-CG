package _1_introduction;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandleAlert {
	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priyamps\\Downloads\\SELENIUM\\Drivers\\ChromeDriver\\chromedriver 108\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();

		String htmlFilePath = System.getProperty("user.dir") + File.separator + "src" 
		+ File.separator + "test" + File.separator + "resources" +  File.separator + "htmlFiles"+  File.separator + "HandleAlert.html";
		System.out.println(htmlFilePath);
		driver.get(htmlFilePath);
		
		System.out.println("Title: " + driver.getTitle());
		System.out.println("URL: " + driver.getCurrentUrl());
		
		WebElement alertButton = driver.findElement(By.xpath("//button[text()='Try it']"));
		
		//1. Accepting Alert
		alertButton.click();
		driver.switchTo().alert().accept();
		
		//2. Dismissing Alert
		alertButton.click();
		driver.switchTo().alert().dismiss();
		
		//3. Getting the text
		alertButton.click();
		System.out.println("Text from alert window: " + driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		//4. Sending text to alert
		WebElement sendName = driver.findElement(By.xpath("//button[text()='Enter Name']"));
		sendName.click();
		driver.switchTo().alert().sendKeys("Priyam Pratyush Sahu");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		driver.close();
		
		
		//driver.close();
		

	}

}
