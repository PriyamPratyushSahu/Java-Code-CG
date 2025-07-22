package samplePractice;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelloWorld {
    public static void main(String[] args) {
        String str = "HelloAbchellowqwq";
        System.out.println(str);
        StringBuilder newStr = new StringBuilder();
        int i, j;
        //Reverse
        /*for(int i = str.length()-1; i >=0; i--)
            newStr.append(str.charAt(i));
        newStr.toString();
        System.out.println(newStr);*/
        //Palindrome
        /*
        for(i =0, j = str.length()-1; i<=j;i++,j--){
            if(str.charAt(i) != str.charAt(j))
                break;
        }
        if(i>j)
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");*/
        //Anagram
       /* HashMap<Character, Integer> countChar = new HashMap<>();
        String str1 = "abcdefabcde";
        String str2 = "abcdefabcdef";
        int updateValue;
        for (i = 0; i < str1.length(); i++)
            if (countChar.containsKey(str1.charAt(i))) {
                updateValue = countChar.get(str1.charAt(i));
                updateValue++;
                countChar.put(str1.charAt(i), updateValue);
            } else countChar.put(str1.charAt(i), 1);
        System.out.println(countChar);

        for (i = 0; i < str2.length(); i++)
            if (countChar.containsKey(str2.charAt(i))) {
                updateValue = countChar.get(str2.charAt(i));
                updateValue--;
                countChar.put(str2.charAt(i), updateValue);
            }
        System.out.println(countChar);
        for (int checkVal : countChar.values())
            if (checkVal != 0) {
                System.out.println("Not an anagram ");
                break;
            }
*/
        //Merge 2 sorted array into 1
/*
        int arr1[] = {1, 3, 6, 10, 17, 45, 90};
        int arr2[] = {5, 8, 12, 16, 36, 100};
        int arrSize = arr1.length + arr2.length;
        int arr3[] = new int[arrSize];
        int k = 0;
        for (i = 0, j = 0; k < arrSize;) {
            if (i < arr1.length && j < arr2.length) {
                if (arr1[i] < arr2[j]) {
                    arr3[k] = arr1[i];
                    k++;
                    i++;
                }
                if (arr1[i] > arr2[j]) {
                    arr3[k] = arr2[j];
                    k++;
                    j++;
                } else {
                    arr3[k] = arr1[i];
                    k++;
                    i++;
                    arr3[k] = arr2[j];
                    k++;
                    j++;

                }
            }
            else if(i < arr1.length && j >= arr2.length){
                arr3[k]= arr1[i];
                k++;
                i++;
            }
            else if(i >= arr1.length && j < arr2.length){
                arr3[k]= arr2[j];
                k++;
                j++;
            }

        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
*/

        //Pattern & Matcher
        String str1 = "abdegfavabdiopab detyuabgeiu";
        String search = "ab";
        Pattern pType = Pattern.compile(search);
        Matcher mType = pType.matcher(str1);
        i = 0;
        while(mType.find())
            i++;
        System.out.println(i);

        String ss = "abc eg -12";
        System.out.println(Character.isWhitespace(ss.charAt(3)));
        StringBuffer sbs = new StringBuffer();
        sbs.append("ab");
        sbs.append("ab");
        sbs.append("ab");
        sbs.append("ab");
        sbs.append(1);
        //sbs.reverse();
        String s2 = String.valueOf(sbs);
        System.out.println("abc".compareTo("abe"));
        //sbs.toString();
        System.out.println(sbs);

        HashMap<Integer,Integer> hp = new HashMap<>();
        hp.put(1,10);
        hp.put(2,10);
        hp.put(3,10);
        hp.put(4,10);
        hp.put(5,10);
        for(Map.Entry<Integer,Integer> h : hp.entrySet()){
            System.out.println(h.getKey() + " : " + h.getValue());
            for(int ii: hp.keySet())
                System.out.println(ii);
        }


    }
}

