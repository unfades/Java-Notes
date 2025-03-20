import java.util.InputMismatchException;
import java.util.Scanner;

class DivideAndSum{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 integers: ");
        int a = 0;
        int b = 0;
        try{
        a = sc.nextInt();
        b = sc.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Hey, you entered a wrong type, it's gotta be an int type");
            System.out.println("Now enter that in integer form, no decimals: ");
            //b = sc.nextInt();
        }
        //System.out.println(b);
        int c = 5050;
        int d = 6004;
        try{
        c= a/b;
        d = a+b;
        }catch(ArithmeticException e){
            System.out.println("Hey, you can't divide by zero, choose an interger other than 0");
            //System.exit(0); // in case I want to end the program here.
        }catch(InputMismatchException e){
            System.out.println("So you entered a wrong type, it's gotta be an int type");
        }
        
        System.out.println("Div is " + c);
        try{
        System.out.println(a + "/" + b + "=" + a/b);
        }catch(ArithmeticException e){
            try{
                System.out.println("before the val of b: " + b);
                b = sc.nextInt();
                System.out.println("After the val of b: " + b);
            }catch(InputMismatchException f){
                System.out.println("Invalid types");
            }catch(ArithmeticException g){
                System.out.println("cannot divide by zero");
            }
        }
        System.out.println("Sum is " + d);
    }
}