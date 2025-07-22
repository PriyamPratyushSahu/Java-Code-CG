// Sibling - Child to parent traverse

package _2_locatorPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators4 {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\priyamps\\Downloads\\SELENIUM\\Drivers\\ChromeDriver\\chromedriver 108\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

// Sibling - Child to parent traverse
//header/div/button[1]/following-sibling::button[1]

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());

        driver.close();

    }


}