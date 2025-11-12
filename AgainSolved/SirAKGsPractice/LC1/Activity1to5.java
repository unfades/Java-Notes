package SirAKGsPractice.LC1;

import java.util.Scanner;

public class Activity1to5{
    public static void main(String[] args) {
        //1 the task is move a to b, b to c, c to a
        int a = 10, b = 20, c = 30;
        System.out.println("a="+ a + " b=" + b + " c=" + c);
        a = a^b; b = a^b; a = a^b;
        a = a^c; c = a^c; a = a^c;
        System.out.println("a="+ a + " b=" + b + " c=" + c);
        //2 students passed or failed count how many passed
        int st1 = 30, st2 = 45, st3 = 90, count = 0;
        if(st1>=35) count++; if(st2>=35) count++; if(st3>=35) count++;        
        System.out.println("The amount of students that passed is: " + count);
        //3 count + and - numbers, 0 is pos here
        int[] arr = {1,-2,3,3,-4,5,100,-90,-99, 0};
        int pos = 0, neg = 0;
        for(int i : arr){ if(i>=0) pos++; else neg++;}
        System.out.println("pos numbers: " + pos + " neg numbers: " + neg);
        //4 even odd or 0
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int eveoddzero = Integer.valueOf(sc.nextLine());
        String res = eveoddzero == 0? "zero": eveoddzero%2==0? "even":"odd";
        System.out.println("Your entered number is " + res);
        //5 return sum of 3 nums
        System.out.println("Enter 3 numbers:");
        int one = sc.nextInt();
        int two = sc.nextInt();
        int thr = sc.nextInt();
        System.out.println(one + " + " + two + " + " + thr +": " + (one+two+thr));
        sc.close();
    }
}