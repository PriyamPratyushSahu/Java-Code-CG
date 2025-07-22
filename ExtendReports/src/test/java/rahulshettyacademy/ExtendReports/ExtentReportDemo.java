package rahulshettyacademy.ExtendReports;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
	
	ExtentReports extent;
	
	@BeforeTest
	public void config() {
		
		//Two classes required to build report -> 1. ExtentReports, 2. ExtentSparkReporter(Helper class)
		String reportPath = System.getProperty("user.dir") + File.separator + "Reports" + File.separator + "index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath); //It is responsible for creating report
		
		reporter.config().setReportName("Practice Report Generation");
		reporter.config().setDocumentTitle("Test Results");
		
		extent = new ExtentReports(); //This will drive all reporting execution
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Priyam");
		
		
		
	}
	
	@Test
	public void initialDemo() {
		String chromeDriverPath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
				+ File.separator + "resources" + File.separator + "ChromeDriver" + File.separator + "chromedriver.exe";
		
		extent.createTest("Initial Demo");

		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println("Title: "+ driver.getTitle());
		
		driver.close();
		extent.flush();
	}

}
