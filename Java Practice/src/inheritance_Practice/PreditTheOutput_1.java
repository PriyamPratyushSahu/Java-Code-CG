package inheritance_Practice;


class X{
    int a = 10;
}

class Y extends X{
    int a = 20;
}


public class PreditTheOutput_1 {
    public static void main(String args[]){
        X x = new Y();
        System.out.println(x.a);

    }
}
