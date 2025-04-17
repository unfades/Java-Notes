/*
Write a Java program to check whether the first two
characters present at the end of a given string.
Sample output: The given strings is: educated
The first two characters appear in the last is: true
 */
import java.util.Scanner;

public class StringAssignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.charAt(0) == s.charAt(s.length()-2) && s.charAt(1) == s.charAt(s.length()-1)){
            System.out.println("The given string is: " + s);
            System.out.println("The first two characters appear in the last is true");
        }else{
            System.out.println("The given string is: " + s);
            System.out.println("The first two characters appear in the last is false");
        }
        sc.close();
    }    
}
