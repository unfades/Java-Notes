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
            //clear the buffer before trying to scan b because of the exception,
            //Java stores this value inside it and you have to again clear it
            //in order to take in a new value....!
        }
        //System.out.println(b);
        int c = 5050;
        int d = 6004;
        try{
        c= a/b;
        d = a+b;
        }catch(ArithmeticException e){
            System.out.println("Hey, you can't divide by zero, choose an integer other than 0");
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
                b = sc.nextInt(); //Here, the value is already there inside for b in the
                //buffer, you gotta clear it out and then you can take input or else
                //you will run into another exception.
                System.out.println("After the val of b: " + b);
            }catch(InputMismatchException f){
                System.out.println("Invalid types");
                sc.nextLine(); //CLEAR THE BUFFER AND THEN EVERYTHING WILL BE FINE GET IT?
                b = sc.nextInt();
                System.out.println("After the val of b: " + b);
            }catch(ArithmeticException f){
                System.out.println("cannot divide by zero");
            }
        }
        System.out.println("Sum is " + d);
    }
}