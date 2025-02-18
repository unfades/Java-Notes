import java.lang.Math;
import java.util.Scanner;

public class CIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first no: ");
        int first = scan.nextInt();
        System.out.println("Enter second no: ");
        int second = scan.nextInt();
        int max = (first>second) ? first:second;
        //or
        System.out.println("max of 2 is: " + Math.max(first,second) + " or the old way" + max);
        //2 11 and 5
        System.out.println("Enter the number to see divisible by 5 & 11 or nah: ");
        int number = scan.nextInt();
        System.out.println((number%11 == 0 && number%5 == 0) ? "Yeah it's divisible by both 5 & 11":"No it's not divisible by both 5 & 11");
        //3
        System.out.println("Enter the 3 numbers: ");
        first = scan.nextInt();
        second = scan.nextInt();
        int third = scan.nextInt();
        System.out.println("Max between three numbers is: " + Math.max(Math.max(first,second), third));
        //4
        System.out.println("Enter the year: ");
        int year = scan.nextInt();
        System.out.println(((year%4==0) && !(year%100 == 0 && year%400!=0))?"leap year":"not a leap year");
        //5
        System.out.println("Enter a character: ");
        char c = scan.next().charAt(0);
        System.out.println(((c>='a' && c<='z') || (c>='A' && c<='Z')) ? "alphabet":"not alphabet");
        //6
        System.out.println("enter character: ");
        c = scan.next().charAt(0);
        System.out.println(("aeiou".contains(Character.toString(c)) || "AEIOU".contains(Character.toString(c)))? "vowel":"not vowel");
        //7
        System.out.println("Enter a week number 1-7");
        int week = scan.nextInt();
        System.out.println((week == 1)? "Monday":(week == 2)?"Tuesday":(week ==3)?"Wednesday":(week==4)?"Thursday":(week==5)?"Friday":(week==6)?"Saturday":(week==7)?"Sunday":"Enter a valid day 1-7");
        //8
        //what is it asking idk ask

        //9
        System.out.println("Enter the 3 angles of the triangle:");
        double angle1 = scan.nextDouble();
        double angle2 = scan.nextDouble();
        double angle3 = scan.nextDouble();
        System.out.println((angle1+angle2+angle3 == 180 ? "triangle": "not triangle"));
        //10
        System.out.println("bought item for: ");
        int item = scan.nextInt();
        System.out.println("Sold item for: ");
        int item2 = scan.nextInt();
        System.out.println("profit/loss was: " + (item2 - item));
        //11
        System.out.println("Enter age: ");
        int age = scan.nextInt();
        System.out.println(age>=18?"can vote":"can't vote");
        //12
        System.out.println("Enter height in feet and inches(ex: 5ft11in is 5.11): ");
        float height = scan.nextFloat();
        System.out.println((height<5)? "Not adult": "Adult");
        //13
        //new idea leaerned triangle inequality theorem, sum of any 2 sides of a triangle is 
        //always bigger than the third side of the triangle.
        System.out.println("Enter the first side length: ");
        first = scan.nextInt();
        System.out.println("Enter the second side lenth: ");
        second = scan.nextInt();
        System.out.println("Enter the third side length: ");
        third = scan.nextInt();
        //using triangle side inequality theorem
        System.out.println((first+second>third && first+third>second && second+third>first)?"valid triangle":"triangle not valid for these lengths");
        //14
        System.out.println("Enter base: ");
        int base = scan.nextInt();
        System.out.println("Enter height");
        height = scan.nextInt();
        System.out.println("area triangle is: " + ((float)1/2*base*height));
        //15neg pos or 0
        System.out.println("Enter the number: ");
        number = scan.nextInt();
        System.out.println((number>0)?"positive":(number<0)?"negative":"zero");
        //16
        System.out.println("Enter number: ");
        number = scan.nextInt();
        System.out.println((number%2==0)?"Even":"Odd");
        //17
        //int physics,chemistry,biology,math,computer;
        //physics = scan.nextInt();
        //chemistry = scan.nextInt();
        //biology = scan.nextInt();
        //math = scan.nextInt();
        //computer = scan.nextInt();
        //better
        System.out.println("Enter marks for phys, chem, bio, math, comp: ");
        int sum = 0;
        number = scan.nextInt();
        sum+=number;
        number = scan.nextInt();
        sum+=number;
        number = scan.nextInt();
        sum+=number;
        number = scan.nextInt();
        sum+=number;
        number = scan.nextInt();
        sum+=number;
        float avg = (float)sum/5;
        System.out.println((avg>=90)?"A":(avg>=80 && avg<90)?"B":(avg>=70 && avg<80)?"C":(avg>=60 && avg<70)?"D":(avg>=50 && avg<60)?"E":"F");
        //18
        System.out.println("What is your salary?: ");
        //idk program what is HRA DA
        //19 electric bill

        //20
        System.out.println("Enter character: ");
        c = scan.next().charAt(0);
        System.out.println((c>='A' && c<='Z')?"Uppercase":(c>='A' && c<='Z')?"Lowercase":"Wronginput");
        scan.close();
    }
}
