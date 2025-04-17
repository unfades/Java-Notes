/*
Write a Java program to append two given strings such that,
if the concatenation creates a double characters then omit
one of the characters.
Sample output: The given strings are: food and door
The string after concatenation are: foodoor
 */

import java.util.Scanner;

public class StringAssignment3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = String.valueOf(sc.nextLine());
        String s2 = String.valueOf(sc.nextLine());

        System.out.println("string 1 is : " + s);
        System.out.println("string 2 is : " + s2);
        
        if(s.endsWith(Character.toString(s2.charAt(0)))){
            System.out.println(s.substring(0,s.length()-1) + s2);
        }else{
            System.out.println(s + s2);
        }
        sc.close();
    }
}
