import java.lang.Math;
import java.util.Scanner;

public class CAssignments_Whileloop {
    public static void main(String[] args) {
        System.out.println("Part 1:\n X to the Power Y:");
        int x,y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of X: ");
        x = scan.nextInt();
        System.out.println();
        System.out.println("Enter the value of X: ");
        y = scan.nextInt();
        System.out.println(Math.pow(x,y));

        
        
        
        
        System.out.println("Part 2: Times Table\nEnter the number for times table: ");
        int number;
        number = scan.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(number + " x " + i + " = " + number*i);
        }






        System.out.println("Part 3: Positive Negative Prints:\n Enter the Number: ");
        number = scan.nextInt();
        if(number>0){
            int i = 1;
            while(i<=number){
                System.out.print(i + " ");
                i++;
            }
        }else if(number<0){
            while(number>0){
                System.out.println(number + " ");
                number++;
            }
        }
        System.out.println();




        System.out.println("Part 4: Sum and Average of All Even and Odd numbers upto num:\n Enter the number: ");

        number = scan.nextInt();
        int evenSum = 0, oddSum = 0, evenCount = 0, oddCount = 0;
        for(int i = 1; i<=number; i++){
            if(i%2==0){
                evenSum+=i;
                evenCount++;
            }else{
                oddSum+=i;
                oddCount++;
            }
        }
        System.out.println("Average of All Even Numbers: " + evenSum);
        System.out.println("Average of All Odd Numbers: " + oddSum);
        System.out.println("Average of All Even Numbers: " + (float)evenSum/evenCount);
        System.out.println("Average of All Odd Numbers: " + (float)oddSum/oddCount);

        System.out.println("First 10 terms of a Fibonacci Series Program: ");
        int firstNo = 0, secondNo = 1;
        
        for(int i = 1; i<=5; i++){
            System.out.print(firstNo + " " + secondNo + " ");
            firstNo = firstNo + secondNo;
            secondNo = secondNo + firstNo;
        }
        scan.close();
    }
}
