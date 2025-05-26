package methods;

public class SumOfNumbersRecursion {

        public static int sumOfNumbers(int n){
            int add = n;
            System.out.println("n status: "+ n);
            if(n != 0)
            add += sumOfNumbers(n-1);
            int k = add - (n-1);
            int m = n-1;
            System.out.println("add status: " + k + " + " + m + "= " + add);
            return add;
        }

        public static void main(String args[]){
            int n = 10;
            System.out.println("Sum of numbers from 1 to " + n + ": " + sumOfNumbers(n));
        }
}
