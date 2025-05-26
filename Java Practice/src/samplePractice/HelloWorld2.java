package samplePractice;

class Hello {
    void method1(){
        System.out.println("Parent class");
    }
}

public class HelloWorld2 extends  Hello{
    void method1(){
        System.out.println("Child class");
    }

    public static void main(String[] args) {
        Hello hh = new HelloWorld2();
        hh.method1();
    }
}


