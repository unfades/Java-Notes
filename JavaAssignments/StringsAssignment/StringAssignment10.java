/*
Write a Java program to concatenate a given string with itself
of a given number of times.
 */
import java.util.Scanner;

public class StringAssignment10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("How many times do you want s to concatenate with itself?: ");
        int concat = sc.nextInt();
        s = s.repeat(concat);
        System.out.println("after concatenating it is: ");
        System.out.println(s);
        sc.close();
    }
}
