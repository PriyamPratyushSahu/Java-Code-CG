package samplePractice;

public class Practice_3 {
    public static void main(String[] args) {
        String str="9-2-2025 7:01:44 \n" +
                "9-3-2025 7:07:56 \n" +
                "9-5-2025 6:57:48 \n" +
                "9-8-2025 6:59:42 \n";

        String str1[] = str.split("\n");
        for(int i =0; i< str1.length; i++){
            int pos = str1[i].indexOf(32);
            
            System.out.println(str1[i].substring(pos+1));
        }
    }
}
