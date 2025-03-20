import java.util.Scanner;
import java.util.InputMismatchException;

class Answer44{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        System.out.println("Enter 2 numbers: ");
        try{
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println("Division of " + a + "/" + b + "=" + (a/b));
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }catch(InputMismatchException e){
            System.out.println("Please input integers only");
            System.exit(0);
        }
        System.out.println("Sum of " + a + "+" + b + "=" + (a+b));
    }
}

