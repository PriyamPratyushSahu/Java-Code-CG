package inheritance_Practice;

class P{
    P(){
        System.out.println("Class P Constructor");
    }
    P(int a){
        System.out.println("Class P Parameterised Constructor");
        System.out.println("Value from child: " + a);
    }
}

class Q extends P{
    Q(){
        System.out.println("Class Q Constructor");
    }
    Q(int a){
        super(a);
        System.out.println("Class Q Parameterised Constructor");
    }
}

public class ConstructorPractice {

    public static void main(String args[]){
        Q q = new Q();

        Q q2 = new Q(10);
    }
}
