import java.util.Scanner;

public class SubjectiveAssignment04Switch {
    public static void main(String[] args) {
        //1
        Scanner mine = new Scanner(System.in);
        System.out.println("Please enter the day of the week 1-7: ");
        int week = mine.nextInt();
        switch(week){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a valid day");
        }
        //2
        System.out.println("Please enter the month number(1-12): ");
        int month = mine.nextInt(); int day;
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12://clubbing
            day = 31;
                System.out.println("This month has " + day + " days");
                break;
            case 2:
                System.out.println("28 days if Not A Leap Year, 29 if A Leap Year");
                break;
            case 4:
            case 6:
            case 11: //clubbing grouping together cases
            day = 30;
                System.out.println("This month has" + day + " days");
                break;
            default:
                System.out.println("Enter a valid month(1-12)");
        }
        //3
        System.out.println("Enter a character, either a vowel or consonant: ");
        char c = mine.next().charAt(0);
        switch(c){
            //you can write cases like this too yeah
            case 'a': case 'e': case 'i': case 'o': case 'u':
            case 'A': case 'E': case 'I': case 'O': case 'U':
            System.out.println("vowel");
            break;
            default:
                //used some method chaining here
                if("bcdfghjklmnpqrstvwxyz".contains(Character.toString(c)) || "bcdfghjklmnpqrstvwxyz".toUpperCase().contains(Character.toString(c))){
                    System.out.println("consonant");
                }else{
                    System.out.println("please enter vowel or consonant...");
                }
        }
        //4
        /*
        System.out.println("Enter a number: ");
        int num = mine.nextInt();
        System.out.println("Enter another number: ");
        int num2 = mine.nextInt();
        int result = num-num2;
        switch(result){
            case result:
        }
            */
            //normally the answer is no
        //This is how to force check max using switch in Java as a trick via chatGPT
        System.out.println("Enter a number: ");
        int num = mine.nextInt();
        System.out.println("Enter another number: ");
        int num2 = mine.nextInt();
        switch(Integer.compare(num, num2)){
            case 1:
                System.out.println(num +" is bigger");
                break;
            case -1:
                System.out.println(num2 +" is bigger");
                break;
            case 0:
                System.out.println("Both are equal");
            default:
                System.out.println("Enter valid numbers...");
        }//forced it

        //5
        //Even or odd can be checked using num%2 it will always output 0 or 1 because even/2 is 0 and
        //odd/2 is always gonna give a remainder of 1
        System.out.println("Enter a number: ");
        num2 = mine.nextInt();
        switch(num2%2){
            /* 
            case 1:
                System.out.println(num2 +" is Odd");
                break;
            case -1:
                System.out.println(num2 +" is Odd");
                break;
                */
            case  1:
            case -1: //clubbing smarter
                System.out.println(num2 +" is Odd");
                break;
            case  0:
                System.out.println(num2 + " is Even");
            /* 
                default:
                System.out.println("Enter valid numbers...");
            */ //default was useless because it's never gonna come using these conditions.
        }
        //6 use Integer.compare(a,b) hint
        System.out.println("Enter a number: ");
        num = mine.nextInt();
        switch(Integer.compare(num, 0)){
            case 0:
                System.out.println(num+" is zero");
                break;
            case 1:
                System.out.println(num+ " is positive");
                break;
            case -1:
                System.out.println(num+" is negative");
                break;
        }
        //7
        /*
         * Hint for Java

        For a quadratic equation ax² + bx + c = 0, the discriminant determines the nature of the roots:
        D=b2−4ac
        D=b2−4ac

        Use switch with:

        Integer.signum(D)

        which returns:

        1 if D > 0 (two real roots)
        0 if D == 0 (one real root)
        -1 if D < 0 (complex roots)
         */
        System.out.println("Enter a quadratic equation value a, b and c for equation ax² + bx + c = 0");
        int a = mine.nextInt();
        int b = mine.nextInt();
        int c1 = mine.nextInt();
        int discriminant = (int)(Math.pow(b,2)- 4*a*c1);
        switch(Integer.signum(discriminant)){
            case 1: // Two real roots
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.printf("Root1: %.2f\nRoot2: %.2f\n", root1, root2);
                break;
                
            case 0: // One real root (D == 0)
                double root = -b / (2 * a);
                System.out.printf("Root: %.2f\n", root);
                break;
                
            case -1: // Complex roots (D < 0)
                double realPart = -b / (2 * a);
                double imagPart = Math.sqrt(-discriminant) / (2 * a);
                System.out.printf("Root1: %.2f + %.2fi\nRoot2: %.2f - %.2fi\n", realPart, imagPart, realPart, imagPart);
                break;
        }
        //8
        //menu driven calculator
        /*
        public class Calculator{
	        public static void main(String[] args){
		        switch(args[1]){
		            case("+"):
			            System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[2]));
			            break;
		            case("-"):
			            System.out.println(Integer.parseInt(args[0]) - Integer.parseInt(args[2]));
			            break;
		            case("/"):
			            System.out.println(Double.parseDouble(args[0]) / Double.parseDouble(args[2]));
			            break;
		            case("*")://the problem is for this one, must find out why though
			            System.out.println(Integer.parseInt(args[0]) * Integer.parseInt(args[2]));
			            break;
		            case("%"):
			            System.out.println(Integer.parseInt(args[0]) % Integer.parseInt(args[2]));
			            break;
		            default:
			            System.out.println("Wrong format Try again using this method -> operand operator operand");
			            break;
		        }	
	    }
}
         */
        //9
        System.out.println("Enter 3 sides of triangle: ");
        int side1 = mine.nextInt();
        int side2 = mine.nextInt();
        int side3 = mine.nextInt();

        if(side1==side2 && side2==side3){
            System.out.println("equilateral");
        }else if((side2==side3 && side1!=side3)||(side1==side2 && side2!=side3)){
            System.out.println("isoceles");
        }else if(side1!=side2 && side1!=side3 && side2!=side3){
            System.out.println("scalene");
        }
        //10
        Scanner sc = new Scanner(System.in);
        
        // Input values
        System.out.print("Input a: ");
        double a2 = sc.nextDouble();
        System.out.print("Input b: ");
        double b2 = sc.nextDouble();
        System.out.print("Input c: ");
        double c2 = sc.nextDouble();
        sc.close();

        // Calculate discriminant
        double D = b2 * b2 - 4 * a2 * c2;

        if (D > 0) { // Two real roots
            double root1 = (-b2 + Math.sqrt(D)) / (2 * a2);
            double root2 = (-b2 - Math.sqrt(D)) / (2 * a2);
            System.out.printf("Root1: %.2f\nRoot2: %.2f\n", root1, root2);
        } else if (D == 0) { // One real root
            double root = -b2 / (2 * a2);
            System.out.printf("Root: %.2f\n", root);
        } else { // Complex roots
            double realPart = -b2 / (2 * a2);
            double imagPart = Math.sqrt(-D) / (2 * a2);
            System.out.printf("Root1: %.2f + %.2fi\nRoot2: %.2f - %.2fi\n", realPart, imagPart, realPart, imagPart);
        }
    }
}
