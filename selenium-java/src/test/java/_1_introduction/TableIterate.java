package _1_introduction;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableIterate {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\priyamps\\Downloads\\SELENIUM\\Drivers\\ChromeDriver\\chromedriver 108\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String htmlFilePath = System.getProperty("user.dir") + File.separator + "src" 
				+ File.separator + "test" + File.separator + "resources" +  File.separator + "htmlFiles"+  File.separator + "Table.html";
		System.out.println(htmlFilePath);
		driver.get(htmlFilePath);

		// Step 1: Locate the table
		WebElement TableId = driver.findElement(By.id("CompanyDetails"));

		// Step 2: Calculate the total number of rows and columns using XPath.
		int rowSize = driver.findElements(By.xpath("/html/body/center/table/tbody/tr")).size();
		int colSize = driver.findElements(By.xpath("//table[@id='CompanyDetails']/tbody/tr/th")).size();
		System.out.println("Row Size: " + rowSize);
		System.out.println("Column Size: " + colSize);

		// Step 3: Looping through table elements

		int choice = 2;
		// 1 -> Fixed value
		// 2 -> Dynamic value
		switch (choice) {
		case 1:
			// For fixed number of rows & columns
			for (int i = 2; i <= rowSize; i++) {
				for (int j = 1; j <= colSize; j++) {
					System.out.print(driver
							.findElement(By.xpath("//table[@id='CompanyDetails']/tbody/tr[" + i + "]/td[" + j + "]"))
							.getText() + " || \t");
				}
				System.out.println("");
			}
			break;
		case 2:
			// Dynamic number of rows and columns
			List<WebElement> rowVals = TableId.findElements(By.tagName("tr"));
			List<WebElement> colHeader = rowVals.get(0).findElements(By.tagName("th"));
			
			//To print each header text
			for(int i=0; i<colHeader.size(); i++){
				System.out.print(colHeader.get(i).getText() + " || ");
				}
			
			System.out.println("");
			//To print table contents 
			for(int i=1; i<rowSize; i++){
				List<WebElement> colVals = rowVals.get(i).findElements(By.tagName("td"));
				System.out.println(i);
				for(int j=0; j<colSize; j++){
						System.out.print(colVals.get(j).getText() + "|| ");
					}
				System.out.println("");
				}
			break;
		}

		driver.close();
	}

}
