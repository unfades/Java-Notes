import java.util.Scanner;

public class SubjectiveAssignment06Operators {
    public static void main(String[] args) {
        //1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        if(number/10==0){
            System.out.println("first and last is: " + number);
        }else{
            int lastDigit = number%10;
            while(number>0){
                if(number/10 == 0){
                    System.out.println("first digit: " + number);
                }
                number/=10;
            }
            System.out.println("last digit: " + lastDigit);
        }
        //2
        System.out.println("Enter a number: ");
        number = sc.nextInt();
        if(number/10==0){
            System.out.println("sum of first and last is: " + (number+number));
        }else{
            int lastDigit = number%10;
            while(number>0){
                if(number/10 == 0){
                    System.out.println("sum of first and last digit: " + (number+lastDigit));
                }
                number/=10;
            }
        }
        //3
        System.out.println("Enter a number: ");
        number = sc.nextInt();
        int sum = 0;
        while(number>0){
            sum+=number%10;
            number/=10;
        }
        System.out.println("Sum is: " + sum);
        //4
        System.out.println("Enter a number: ");
        number = sc.nextInt();
        sum = 1;
        while(number>0){
            sum*=number%10;
            number/=10;
        }
        System.out.println("Product is: " + sum);
        //5
        System.out.println("Enter a number: ");
        number = sc.nextInt();
        int reverse = 0;
        if(number/10==0){
            System.out.println("reverse is: " + number);
        }else{
            int copy = number;
            int count = 0;
            while(copy>0){
                count++;
                copy/=10;
            }
            while(number>0){
                System.out.println(number%10);
                reverse += number%10 * (int)Math.pow(10,count-1);
                
                count--;
                System.out.println(reverse);
                number/=10;
            }
        }
        System.out.println("Reverse is: " + reverse);
    }
}
