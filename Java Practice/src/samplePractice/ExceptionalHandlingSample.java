package samplePractice;

public class ExceptionalHandlingSample{
    static void validate(int age){
        try {
            if(age<18)
                throw new ArithmeticException("NOT Eligible to Vote");
            else
                System.out.println("Eligible to Vote");
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("rest of the code...");
        }
    }
    public static void main(String args[]){
        validate(13);

    }
}