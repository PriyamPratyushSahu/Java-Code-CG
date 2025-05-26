package _1_introduction;

import java.io.File;

public class FileProperty {
	
	public static void main(String args[]) {
		System.out.println(System.getProperty("user.dir") + File.separator);
		
	}

}


/*Output:
 C:\Users\priyamps\Downloads\Eclipse\Eclipse-Workspace\Selenium Udemy Rahul Shetty\selenium-java\
	1.System.getProperty("user.dir") -> C:\Users\priyamps\Downloads\Eclipse\Eclipse-Workspace\Selenium Udemy Rahul Shetty\selenium-java
	2. File.separator -> \

 */