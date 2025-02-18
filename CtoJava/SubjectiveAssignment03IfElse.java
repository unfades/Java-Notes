import java.util.Scanner;
import java.lang.Math;

public class SubjectiveAssignment03IfElse{
    public static void main(String[] args) {
        //1
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a character: ");
        char c = sc.next().charAt(0);
        if(c>='A' && c<='Z'){
            System.out.println("Uppercase alphabet");
        }else if(c>='a' && c<='z'){
            System.out.println("Lowercase alphabet");
        }else{
            System.out.println("Not an alphabet");
        }
        //2
        System.out.println("Enter the week number 1-7: ");
        int week = sc.nextInt();
        if(week == 1){
            System.out.println("Monday");
        }else if(week == 2){
            System.out.println("Tuesday");
        }else if(week == 3){
            System.out.println("Wednesday");
        }else if(week == 4){
            System.out.println("Thursday");
        }else if(week == 5){
            System.out.println("Friday");
        }else if(week == 6){
            System.out.println("Saturday");
        }else if(week == 7){
            System.out.println("Sunday");
        }
        //3
        System.out.println("Enter the month number 1-12: ");
        int month = sc.nextInt();
        if(month == 1){
            System.out.println("January");
        }else if(month == 2){
            System.out.println("February");
        }else if(month == 3){
            System.out.println("March");
        }else if(month == 4){
            System.out.println("April");
        }else if(month == 5){
            System.out.println("May");
        }else if(month == 6){
            System.out.println("June");
        }else if(month == 7){
            System.out.println("July");
        }else if(month == 8){
            System.out.println("August");
        }else if(month == 9){
            System.out.println("September");
        }else if(month == 10){
            System.out.println("October");
        }else if(month == 11){
            System.out.println("November");
        }else if(month == 12){
            System.out.println("December");
        }
        //4
        System.out.println("Enter 3 triangle angles: ");
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();
        if(angle1+angle2+angle3!=180){
            System.out.println("invalid triangle");
        }else{
            System.out.println("valid triangle");
        }
        //5
        System.out.println("Enter 3 sides of triangle: ");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if(side1==side2 && side2==side3){
            System.out.println("equilateral");
        }else if((side2==side3 && side1!=side3)||(side1==side2 && side2!=side3)){
            System.out.println("isoceles");
        }else if(side1!=side2 && side1!=side3 && side2!=side3){
            System.out.println("scalene");
        }
        //6
        System.out.println("Enter number to check div by 5&11: ");
        int number = sc.nextInt();
        if(number%11==0 && number%5==0){
            System.out.println("divisible by both 5 and 11");
        }else{
            System.out.println("not divisible by 5 and 11");
        }
        //7
        System.out.println("enter year: ");
        int year = sc.nextInt();
        if(year%4==0 && !(year%100==0 && year%400!=0)){
                System.out.println("leapyear");
        }else{
                System.out.println("not leap year");
        }
        //8
        System.out.println("enter char: ");
        c= sc.next().charAt(0);
        if(c>='A' && c<='Z'){
            System.out.println("Uppercase alphabet");
        }else if(c>='a' && c<='z'){
            System.out.println("Lowercase alphabet");
        }else{
            System.out.println("Not an alphabet");
        }
        //9
        System.out.println("enter char: ");
        c= sc.next().charAt(0);
        if("aeiouAEIOU".contains(Character.toString(c))){
            System.out.println("vowel");
        }else{
            System.out.println("Not a vowel");
        }
        //10
        System.out.println("enter char: ");
        c= sc.next().charAt(0);
        if("123456789".contains(Character.toString(c))){
            System.out.println("digit");
        }else if("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".contains(Character.toString(c))){
            System.out.println("alphabet");
        }else{
            System.out.println("special character");
        }
        sc.close();
    }
}