package inheritance_Practice.child_Class;

import inheritance_Practice.BaseClass;

public class child_1 extends BaseClass {
    public child_1(int a, int b) {
        super(a, b);
    }

    public static void main(String args[]){
        System.out.println("Hello World");
        child_1 ch = new child_1(10,20);
        //BaseClass ba = new BaseClass(10,20);
        ch.display();
    }
}
