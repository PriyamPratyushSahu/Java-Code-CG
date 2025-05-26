// Sibling - Sibling traverse

package _2_locatorPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators3 {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\priyamps\\Downloads\\SELENIUM\\Drivers\\ChromeDriver\\chromedriver 136\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        System.out.print("From parent to child: ");
        //Practice button
        System.out.print(driver.findElement(By.xpath("//header/div/button[1]")).getText());
        System.out.println("\nFrom sibling  to sibling: ");
        //Login button
        System.out.println("Sibling 1: " + driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
        //Signup button
        System.out.println("Sibling 2: " + driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[2]")).getText());


        System.out.println("\nFrom sibling  to sibling to sibling : ");
        //From practice button to Login button to Signup button

        System.out.println("Sibling : " + driver.findElement(By.xpath("//header//div/button[1]/following-sibling::button[1]/following-sibling::button[1]")).getText());

        driver.close();

    }


}