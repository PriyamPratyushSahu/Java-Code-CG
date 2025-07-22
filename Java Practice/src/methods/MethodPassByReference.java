package methods;

public class MethodPassByReference {

    public static void changeValue(int i[]){
        i[0] = 20;
        System.out.println("Inside calling method: " + i[0]);
    }

    public static void main(String args[]){
        int a[] = {10};
        System.out.println("Inside main method: " + a[0]);
        changeValue(a);
        System.out.println("Again inside main method: " + a[0]);
    }

}
