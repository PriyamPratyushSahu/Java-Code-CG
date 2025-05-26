package _1_introduction;

import java.util.ArrayList;

public class PracticeArrayList {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        ArrayList<Integer> i = new ArrayList<Integer>();
        i.add(1);
        i.add(2);
        i.add(3);
        i.add(4);
        i.add(5);

        //Display all the elements present in the ArrayList
        System.out.print("ArrayList elements: ");
        for (int ii = 0; ii < i.size(); ii++)
            System.out.print(i.get(ii)+" ");
        System.out.println();

        //To remove the element 3 from the arrayList if present
        for (int ii = 0; ii < i.size(); ii++){
            if (i.get(ii) == 3){
                i.remove(ii);
                break;
            }
        }
        System.out.println("Index position of 3 in the ArrayList: "+ i.indexOf(3));

        System.out.println("5 is present in the ArrayList: "+ i.contains(5));
        System.out.println("Index position of 5 in the ArrayList: "+ i.indexOf(5));


        System.out.println("Complete ArrayList "+i);

        //To remove 5
        if (i.contains(5))
            i.remove(i.indexOf(5));
        System.out.println(i);
        System.out.println("5 is present in the ArrayList: "+ i.contains(5));

    }
}