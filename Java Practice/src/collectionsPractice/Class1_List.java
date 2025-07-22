package collectionsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Class1_List {
    void lineBreak(){
        System.out.println("\n------------------------------------------\n");
    }
    public static void main(String[] args) {
        Class1_List ll =  new Class1_List();
        List<String> fruitList = new ArrayList<>();
//        1. add(E element)
        System.out.println("#1. add(E element)");
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Cherry");
        System.out.println(fruitList);
        ll.lineBreak();
//        2. add(int index, E element)
        System.out.println("#2. add(int index, E element)");
        fruitList.add(1,"Papaya");
        System.out.println(fruitList);
        ll.lineBreak();
//        3. addAll(Collection<? extends E> c)
        System.out.println("#3. addAll(Collection<? extends E> c)");
        List<String> moreFruits = Arrays.asList("orange", "watermelon");
        fruitList.addAll(moreFruits);
        System.out.println(fruitList);
        ll.lineBreak();
//        4. addAll(int index, Collection<? extends E> c)
        System.out.println("#4. addAll(int index, Collection<? extends E> c)");
        moreFruits = Arrays.asList("Guava","Muskmelon");
        fruitList.addAll(1,moreFruits);
        System.out.println(fruitList);
//        5. get(int index)
        System.out.println("#5. get(int index)");
        System.out.println(fruitList.get(1));
        ll.lineBreak();
//        6. set(int index, E element)
        System.out.println("#6. set(int index, E element)");
        fruitList.set(1,"Mango");
        System.out.println(fruitList);
        ll.lineBreak();
//        7. remove(int index)
        System.out.println("#7. remove(int index)");
        fruitList.remove(2);
        System.out.println(fruitList);
        ll.lineBreak();
//        8. size()
        System.out.println("#8. size()");
        System.out.println(fruitList.size());
        ll.lineBreak();
//        9. isEmpty()
        System.out.println("#9. isEmpty()");
        System.out.println(fruitList.isEmpty());
        ll.lineBreak();
//        10. contains(Object obj)
        System.out.println("#10. contains(Object obj)");
        System.out.println(fruitList.contains("Apple"));
        System.out.println(fruitList.contains("Muskmelon"));
        ll.lineBreak();
//        11. indexOf(Object obj)
        System.out.println("#11. indexOf(Object obj)");
        System.out.println(fruitList.indexOf("Papaya"));
        System.out.println(fruitList.indexOf("Muskmelon"));
        ll.lineBreak();
//        12. clear()
        System.out.println("#12. clear()");
        fruitList.clear();
        System.out.println(fruitList);
        ll.lineBreak();
//        13. toArray()
        System.out.println("#13. toArray()");

//        14. subList(int fromIndex, int toIndex)
//        15. iterator()
//        16. sort(Comparator<? super E> c)
//        17. replaceAll(UnaryOperator<E> operator)
//        18. forEach(Consumer<? super E> action)
//        19. remove(Object obj)
//        20. removeAll(Collection<?> c)
//        21. retainAll(Collection<?> c)
//        22. containsAll(Collection<?> c)
//        23. lastIndexOf(Object obj)
//        24. equals(Object obj)
//        25. toArray(T[] a)
//        26. trimToSize()
//        27. replaceAll(UnaryOperator<E> operator)
//        28. sort(Comparator<? super E> c)

    }
}
