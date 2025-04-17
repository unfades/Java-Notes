/*
Write a Java program to create a new string from a given
string swapping the last two characters of the given string.
The length of the given string must be two or more.
Sample output : The given strings is: string
The string after swap last two characters are: strign
 */
import java.util.Scanner;

public class StringAssignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder("");
        if(s.length() == 2){
            sb.append(""+s.charAt(s.length()-1));
            sb.append(""+s.charAt(0));
        }
        if(s.length()>2){
            sb.append(s.substring(0,s.length()-2));
            sb.append(""+s.charAt(s.length()-1));
            sb.append(""+s.charAt(s.length()-2));
        }
        System.out.println(sb.toString());
    }
}
