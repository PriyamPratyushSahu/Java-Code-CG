package inheritance_Practice;
//Method Overriding example
class A{
    void display(){
        System.out.println(" Inside Class A");
    }
    int returnMethod()
    {
        System.out.println("Inside Class A");
        return 10;
    }
}
class B extends A{
    void display(){
        super.display(); //1. First to A class display()
        System.out.println(" Inside Class B"); //2. Then to B class display();
    }
    int returnMethod()
    {
        int A = super.returnMethod();
        System.out.println("Inside Class B");
        System.out.println("Return value from A: "+ A);
        return 20;
    }
}
public class SuperClass {
    public static void main(String args[]){

        B b= new B();
        b.display();

        int B = b.returnMethod();
        System.out.println("Return value from A: "+ B);
    }
}