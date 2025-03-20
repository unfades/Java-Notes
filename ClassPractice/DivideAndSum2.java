import java.util.InputMismatchException;
import java.util.Scanner;

class DivideAndSum2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 integers: ");
        int a = 0;
        int b = 0;
        try{
            a = sc.nextInt();
            b = sc.nextInt();
            int c= a/b;
            System.out.println("Div is " + c);
        }catch(ArithmeticException e){
            System.out.println("Denominator should not be 0");
        }catch(InputMismatchException e){
            System.out.println("The value entered must be integer");
        }
        int d = a+b;
        System.out.println("Sum is " + a + "+" + b + "=" + d);
    }
}
