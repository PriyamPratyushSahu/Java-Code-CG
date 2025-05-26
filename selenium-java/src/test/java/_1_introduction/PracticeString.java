package _1_introduction;

import java.util.Arrays;
import java.util.List;

public class PracticeString {
	
	public static void main(String args[])
	{
		String alphabets = "A B C D E F G H I J K L M N O P Q R E S T U V W X Y Z";
		String alphabetsSplit[] = alphabets.split(" ");
		
		List<String> alphabetList = Arrays.asList(alphabetsSplit);
		
		
		//For checking 
		String str = "A 3 ( & C % U";
		String strSplit[] = str.split(" ");
		List<String> strList = Arrays.asList(strSplit);
		
		System.out.println(strList);
		System.out.println(alphabetList);
		System.out.println("####################################### \nAlphabet match check");
		
		for(int i = 0; i < strList.size(); i++)
		{
			System.out.println(strList.get(i) + " : " + alphabetList.contains(strList.get(i)));
		}	
	
		
		//Extract email id out of the string
		String emailString = "Please send it to this email abc@gmail.com about the topic";
		String arr = "A B C D".split(" ")[6].trim();
		System.out.println(arr);
		System.out.println("\nEmail ID: " + emailString.split(" ")[6].trim());
	}
}
