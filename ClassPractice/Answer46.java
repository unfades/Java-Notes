import java.util.Scanner;

class Answer46{

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
        }finally{ //now it will run in any case, it will have to run.
        System.out.println("Have a good day");
        }
    }
}

