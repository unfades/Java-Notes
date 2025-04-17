/*
Write a Java program to count the occurrences of a given

string in another given string.
 */
import java.util.Scanner;

public class StringAssignment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string: ");
        String s = String.valueOf(sc.nextLine());
        System.out.println("enter another string to check if it occurs in the prior string: ");
        String occurrences = String.valueOf(sc.nextLine());
        int count = 0;
        for(int i = 0; i < s.length()-occurrences.length()-1; i++){
            if(occurrences.equals(s.substring(i, i+occurrences.length()))){
                count++;
            }
        }
        System.out.println("string " + occurrences + " occurs " + count + " times in string " + s);
    }
}
