/*
Write a Java program to return the sum of the digits present
in the given string. If there is no digits the sum return is 0.
 */
import java.util.Scanner;

public class StringsAssignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        int sum = 0;
        for(int i = 0; i<s.length(); i++){
            StringBuilder sb = new StringBuilder("");
            if("1234567890".contains(Character.toString(s.charAt(i)))){
                int j = i;
                while("1234567890".contains(Character.toString(s.charAt(j)))){
                    sb.append(Character.toString(s.charAt(j)));
                    if(j==s.length()-1) break;
                    j++;
                }
                sum+=Integer.parseInt(sb.toString());
                i=j;
            }
        }
        System.out.println(sum);
    }
}
