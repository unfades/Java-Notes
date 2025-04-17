/*
Write a Java program to read a string and returns after
removing a specified character and its immediate left and
right characters.
Sample output: The given strings is: test#string
The new string is: testring
 */
import java.util.Scanner;

public class StringAssignment6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("String is: " + s);
        System.out.println("Enter the character to remove: ");
        char remove = sc.next().charAt(0);
        char[] arr = s.toCharArray();
        String removal = "";
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == remove){
                removal+=""+arr[i-1]+arr[i]+arr[i+1];
                break;
            }
        }
        System.out.println("before removal: " + s);
        s = s.replace(removal, "");
        System.out.println("after removal: " + s);
    }    
}
