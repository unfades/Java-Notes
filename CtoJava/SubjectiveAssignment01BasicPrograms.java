import java.util.Scanner;
import java.lang.Math;

public class SubjectiveAssignment01BasicPrograms{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.WAP to input 2nums from user and calc their sum.");
        System.out.print("Input the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Input the second number: ");
        int num2 = sc.nextInt();
        System.out.print("The sum is: " + (num1+num2));

        System.out.println("2.WAP to input 2num and perform all operations +-*\"%");

        System.out.print("Enter the first num: ");
        num1 = sc.nextInt();
        System.out.print("Enter the second num: ");
        num2 = sc.nextInt();
        System.out.println("The result of all operations is as follows:-");
        System.out.println(num1 + "+" + num2 + " = " + (num1+num2));
        System.out.println(num1 + "-" + num2 + " = " + (num1-num2));
        System.out.println(num1 + "*" + num2 + " = " + (num1*num2));
        System.out.println(num1 + "/" + num2 + " = " + (float)(num1/num2));
        System.out.println(num1 + "%" + num2 + " = " + (num1%num2));

        System.out.println("3.Enter length and width rectangle program.");

        System.out.println("Enter length: ");
        num1 = sc.nextInt();
        System.out.println("Enter width: ");
        num2 = sc.nextInt();
        System.out.println("The perimiter is: " + (2*num1+2*num2));

        System.out.println("4.Program for rectangle area: ");

        System.out.println("Enter length: ");
        num1 = sc.nextInt();
        System.out.println("Enter width: ");
        num2 = sc.nextInt();
        System.out.println("The area of the rectangle is: " + num1*num2);

        System.out.println("5. Diameter, Circumference, Area via radius program: ");
        System.out.println("enter the radius: ");
        num1 = sc.nextInt();
        System.out.println("The diameter of the circle is: " + 2*num1);
        System.out.println("The Circumference of the circle is: " + (double)(2*Math.PI*num1));
        System.out.println("The Area of the circle is: " + Math.PI * Math.pow(num1,2));

        System.out.println("6. Program to convert length cm input to kilometer output");
        //1km = 1000m
        //1m = 100cm
        //so times 100,000

        System.out.println("Enter the length in centimeters: ");
        num1 = sc.nextInt();
        System.out.println("The length in kilometers is: " + (float)(num1/100_000));

        System.out.println("7.temperature in celcius to fahrenheit");
        System.out.println("Enter the temp in celcius: ");
        double num = sc.nextDouble();
        System.out.println("The temperature in fahrenheit is" + (9.0/5*num + 32));

        System.out.println("8. Fahrenheit to celcius: ");
        System.out.println("Enter the temp in fahrenheit: ");
        num = sc.nextDouble();
        System.out.println("The temp in celcius is: " + ((num-32)*5.0/9));

        System.out.println("9. days to year(s),week(s),day(s)");
        System.out.println("Enter the amount of days: ");
        num1 = sc.nextInt();
        System.out.print(num1 + "days = ");
        int years = 0, weeks = 0, days = 0;
        while(num1>365){
            num1-=365;
            years++;
        }
        while(num1>7){
            num1-=7;
            weeks++;
        }
        while(num1>=1){
            num1--;
            days++;
        }
        System.out.println(years + "year(s)" + weeks + "week(s)" + days + "day(s)");
        
        System.out.println("10. Power of numbers x y using pow:");

        System.out.println("Enter the first no: ");
        num1= sc.nextInt();
        System.out.println("Enter the second no: ");
        num2= sc.nextInt();
        System.out.println(num1 + " to the power of " + num2 + " is " + Math.pow(num1,num2));

        sc.close();
    }
}