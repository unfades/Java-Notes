import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    //1 wap check if a number is perfect or not
	    /*A perfect number is a positive integer that is equal to the 
	    sum of all its positive divisors, excluding the number itself.
	    For example, 6 is a perfect number because 1 + 2 + 3 = 6*/
		System.out.println("Enter a number to check Perfect Or Not: ");
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i<num; i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            System.out.println("It's A Perfect Number");
        }else{
            System.out.println("It's Not A Perfect Number");
        }
        
        System.out.println("Enter a number to check Perfect Or Not upto Number: ");
        //2 Now WAP to find all perfect numbers from 1 to n
        num = sc.nextInt();
        for(int i = 1; i<=num; i++){
            sum = 0;
            for(int j = 1; j<i; j++){
                if(i%j==0){
                    sum+=j;
                }
            }
            if(sum == i){
                System.out.print(i + " ");
            }
        }
        //3 A number is called strong number 
        //if sum of the factorial of its digit is equal to number itself. So, 145 is a Strong number.
        //1!+4!+5!
        System.out.println("Enter a number to check Factorial Or Not: ");
        num = sc.nextInt();
        int fact = 0;
        //System.out.println("for " + i);
        for(int j = num; j>0; j/=10){
            int doFact = 1;
            for(int k = 1; k<=j%10; k++){
                doFact*=k;
            }
            fact+=doFact;
        }
        if(fact == num){
            System.out.print(num + " is factorial");
        }else{
            System.out.println(num + " is not factorial");
        }
        //System.out.println();
        
        //4 Now strong number 1 to n.
        System.out.println("Enter a number to check Factorial Or Not upto Number: ");
        num = sc.nextInt();
        for(int i = 1; i<=num; i++){
                fact = 0;
            //System.out.println("for " + i);
            for(int j = i; j>0; j/=10){
                int doFact = 1;
                for(int k = 1; k<=j%10; k++){
                    doFact*=k;
                }
                fact+=doFact;
            }
            if(fact == i){
                System.out.print(i + " ");
            }
            //System.out.println();
        }
	}
}
