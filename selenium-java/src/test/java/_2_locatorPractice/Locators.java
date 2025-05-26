//Sign in page
//Forgot Password

package _2_locatorPractice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priyamps\\Downloads\\SELENIUM\\Drivers\\ChromeDriver\\chromedriver 108\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.manage().window().maximize();
		System.out.println("Title: " + driver.getTitle());
		System.out.println("URL: " + driver.getCurrentUrl());
		
		driver.findElement(By.id("inputUsername")).sendKeys("Priyam");
		driver.findElement(By.name("inputPassword")).sendKeys("Priyam");
		driver.findElement(By.className("signInBtn")).click();
		
		System.out.println("Error Message: "+ driver.findElement(By.cssSelector("p.error")).getText());
		
		//Forgot Password
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//Forgot Password Page
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Priyam Pratyush Sahu"); //Name
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("priyam"); //Email
		/* 
		 * Also can be implemented using
		 * -> By.cssSelector("input[type='text']:nth-child(3)")
		 * -> By.xpath("//input[@type='text'][2]")
		 * */
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234567890"); //Phone Number
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); //Reset Button
		System.out.println(driver.findElement(By.cssSelector("form p")).getText()); //Info - Please use temporary password 'rahulshettyacademy' to Login.
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click(); //Login Button
		//Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		//Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		//Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Sign In']")));
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='chkboxOne']")).click();
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		//Thread.sleep(3000);
		driver.close();

	}

}
 