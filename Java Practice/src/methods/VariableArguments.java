package methods;

public class VariableArguments {
    public static void variableMethod(int ...x){
        System.out.println("\nNumber of value(s) passed: "+ x.length + "\nValue(s) are: ");
        for(int i:x) System.out.print(i + " ");
        System.out.println("\n****************");
    }

    public static void main(String ...args){ //works as args[]
        variableMethod(10);
        variableMethod(10,20,30);
        variableMethod(10,20,30,40,50);
        variableMethod(10,20,30,40,50,60,70);
        int arr[] = {3,5,19,65,41};
        variableMethod(arr);
    }
}
