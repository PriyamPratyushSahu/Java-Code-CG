package _3_handlingDropDown;

import java.time.Duration;
import java.util.List;
//import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class _3_AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priyamps\\Downloads\\SELENIUM\\Drivers\\ChromeDriver\\chromedriver 108\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();	
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Ind");
		String parentCssSelector = "li[class='ui-menu-item']";
		String childCssSelector =" a";
		String completeCssSelector = parentCssSelector.concat(childCssSelector); //parentCssSelector + childCssSelector 
		List<WebElement> options = driver.findElements(By.cssSelector(completeCssSelector));
		
		for(WebElement i: options)
		{
			//For checking purpose Thread.sleep is used
			Thread.sleep(2000);
			
			if(i.getText().equalsIgnoreCase("India")) {
				i.click();
				break;
			}
		}
		Thread.sleep(2000);
		
		WebElement displaySelect = driver.findElement(By.xpath("//input[@id='autosuggest']"));
		System.out.println(displaySelect.getAttribute("value"));	
		Assert.assertTrue(displaySelect.getAttribute("value").equalsIgnoreCase("India"),"Text does not match");
		
		Thread.sleep(2000);
		driver.close();
	}
}