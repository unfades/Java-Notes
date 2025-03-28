import java.util.Scanner;

public class Lecture46_UserException {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int one = 0;
        int two = 0;
        try{
            one = sc.nextInt();
            two = sc.nextInt();
            if(one <= 0){
                ArithmeticException e = new ArithmeticException("Numerator should be positive");
                throw e;
            }
            if(two==0){
            System.out.println(one/two);
            }
        }catch(ArithmeticException e){
            System.out.println("Exception generated: "+e.getMessage());
            System.exit(0);
        }
        System.out.println(one/two);
    }
}