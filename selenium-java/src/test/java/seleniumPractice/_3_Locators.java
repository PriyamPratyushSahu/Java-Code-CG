package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.LocalTime;
import java.util.List;

public class _3_Locators {
    void methodWaitRequest(int timeSecond) {
        System.out.println("Wait request: " + timeSecond);
        LocalTime startTime = LocalTime.now();
        LocalTime endTime = startTime.plusSeconds(timeSecond);
        do {
            // Do nothing, just wait
        } while (LocalTime.now().isBefore(endTime));
    }

    public static void main(String[] args) throws InterruptedException {
        _2_WebElementMethods WM = new _2_WebElementMethods();

        String chromeDriverPath = System.getProperty("user.dir") + File.separator + "resources" + File.separator + "ChromeDriver" + File.separator + "chromedriver.exe";
        System.out.println(chromeDriverPath);

        String site = System.getProperty("user.dir") + File.separator + "resources" + File.separator + "HTML" + File.separator + "ListOfGroceries.html";
        // System.out.printf(site);
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.get(site);
        driver.manage().window().maximize();
       // System.out.println("System: " + System.getProperty("user.dir"));
        _3_Locators ll = new _3_Locators();
        ll.methodWaitRequest(2);



//        1. child
// To display fruits name from the list of fruits

//        2. parent
//        3. descendant
//        4. ancestor
//        5. following-sibling
//        6. preceding-sibling



        driver.quit();

    }

}
