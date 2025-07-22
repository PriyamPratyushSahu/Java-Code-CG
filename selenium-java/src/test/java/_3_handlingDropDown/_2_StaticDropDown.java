//Handling currency dropdown-parent child concept

package _3_handlingDropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _2_StaticDropDown {
	
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priyamps\\Downloads\\SELENIUM\\Drivers\\ChromeDriver\\chromedriver 108\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		//Selecting value using parent-child concept
		String parentXpath = "//select[@id='ctl00_mainContent_DropDownListCurrency']";
		//For value USD
		String childXpath ="//option[@value='USD']";
		String completeXpath = parentXpath.concat(childXpath); //parentXpath + childXpath 
		
		//It will select the exact option whose address is given in the childXpath
		//Implementing using xpath
		driver.findElement(By.xpath(completeXpath)).click();
		
		//Implementing same in cssSelector
//		driver.findElement(By.cssSelector("select[id='ctl00_mainContent_DropDownListCurrency'] option[value='USD']")).click();
		
		WebElement displaySelect = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(displaySelect);
		System.out.println("Selected option: " + dropdown.getFirstSelectedOption().getText());

		Thread.sleep(2000);
		driver.close();
	}
}
