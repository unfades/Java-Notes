//THIS IS HOW TO MAKE A CUSTOM EXCEPTION...

import java.util.Scanner;

class NegativeNumberException extends Exception{
    public NegativeNumberException(String msg){
        super(msg); // goes to parent constructor that is Exception class.
    }
}

public class CustomException {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter 2 int: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a<=0){
                NegativeNumberException obj = new NegativeNumberException("Numerator should be positive");
                throw obj;
            }
            System.out.println("Div is " + a/b);
        }catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }catch(NegativeNumberException ex){
            System.out.println(ex.getMessage());
        }
    }
}
