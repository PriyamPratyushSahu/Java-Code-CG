package samplePractice;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterviewAssignment {
    public static void main(String[] args) {
        String str1 = "2024.01.22 10.11.12.111566"; //2024.01.22
        String search = "\\d{4}.\\d{2}.\\d{2}";
        Pattern pType = Pattern.compile(search);
        Matcher mType = pType.matcher(str1);
        while(mType.find())
            System.out.println(mType.group());

        str1 = "Java is a programming language";
        String str2[] = str1.split(" ");
        System.out.println(Arrays.toString(str2));

    }
}
