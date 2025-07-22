package inheritance_Practice;

public class BaseClass {

    public BaseClass(int a, int b){
        this.a = a;
        this.b = b;
    }
    int a;
    int b;
    public void display()
    {
        System.out.println("Inside Parent class:");
        System.out.println("a :" + a);
        System.out.println("b :" + b);
    }
}
