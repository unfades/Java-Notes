/*
Write a Java program to remove a specified character from a given string.
 */

import java.util.Scanner;
public class StringAssignment8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string: ");
        String s = sc.nextLine();
        System.out.println("enter a character to remove from string " + s);
        char remove = sc.next().charAt(0);
        s = s.replace(Character.toString(remove), "");
        System.out.println("after removing that it is: " + s);
        sc.close();
    }
}
