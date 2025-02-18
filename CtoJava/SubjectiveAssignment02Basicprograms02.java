import java.lang.Math; import java.util.Scanner;

public class SubjectiveAssignment02Basicprograms02 {
    public static void main(String[] args) {
        //1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        System.out.println("The square root of " + num + " = " + Math.sqrt(num));
        //2
        System.out.println("Enter the first angle: ");
        num = sc.nextInt();
        System.out.println("Enter the second angle: ");
        int num2 = sc.nextInt();
        System.out.println("The third angle of the triangle is: " + (180-(num+num2)));

        //3
        System.out.println("Enter the base: ");
        int base = sc.nextInt();
        System.out.println("Enter the height: ");
        int height = sc.nextInt();
        System.out.println("The area of the triangle is: " + (double)1/2*base*height);
        //4
        System.out.println("How long is one side of the equilateral triangle: ");
        int side = sc.nextInt();
        System.out.println("the area is: " + ((double)((Math.sqrt(3))/4)*Math.pow(side,2)));
        //5
        System.out.println("Enter the marks of 5 subjects: ");
        int sum  = 0;
        int marks = 0;
        marks = sc.nextInt();
        sum+=marks;
        marks =sc.nextInt();
        sum+=marks;
        marks = sc.nextInt();
        sum+=marks;
        marks = sc.nextInt();
        sum+=marks;
        marks = sc.nextInt();
        sum+=marks;
        System.out.println("The total marks is: " + sum + "\nAverage is: " + (float)sum/5 + "\nPercentage is: " + (float)sum/5);

        //6 i = prt
        System.out.println("Enter principle, time, rate");
        int principle = sc.nextInt();
        int time = sc.nextInt();
        double rate = sc.nextDouble();
        System.out.println("Simple interest is: "+ (principle*time*rate));

        //7compoundinterest = P(1+r/n)^nt
        System.out.println("how many times do you have to pay per time: ");
        rate = sc.nextDouble();
        System.out.println("And the compound interest is: " + principle*(Math.pow((1+rate/100*1),(1*time))));
        sc.close();
    }
}
