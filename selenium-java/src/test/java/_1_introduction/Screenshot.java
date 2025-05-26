package _1_introduction;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Screenshot {
	
	public static void main(String[] args) throws IOException {

		String chromeDriverPath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
				+ File.separator + "resources" + File.separator + "ChromeDriver" + File.separator + "chromedriver.exe";
		System.out.println(chromeDriverPath);
		
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		System.out.println("Title: " + driver.getTitle());
		System.out.println("URL: " + driver.getCurrentUrl());
		 SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss");  
		 Date date = new Date();
		 String dateVal = formatter.format(date);
		
		//Step 1: Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		
		//Step 2: Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		
		//Step3: Set path to store the screenshot
		String imagePath = "Screenshots" + File.separator + dateVal +  File.separator +driver.getTitle()+ ".png";
		System.out.println(imagePath);
		//Step4: Save the file
		FileUtils.copyFile(SrcFile, new File(imagePath));
	}
}
