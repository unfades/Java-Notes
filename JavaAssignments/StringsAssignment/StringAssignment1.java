//task removal of "b" and "ac" occurrences from the string

import java.util.Scanner;

public class StringAssignment1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(s + " before replacement");
        if(s.contains("b") || s.contains("ac")){
            s = s.replace("b","");
            s = s.replace("ac","");
        }
        System.out.println(s + " after replacement");
        sc.close();
    }
}
