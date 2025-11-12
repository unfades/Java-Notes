package MySolutions;

import java.util.Scanner;
import java.util.Arrays;
public class Med2 {
    public static void main(String[] args) {
        //Ria's game
        //get value of N as int,
        //convert to str, sort str, rev, convert to num, return
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        String s = ""+n;

        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String ans = new String(arr);
        StringBuilder rev = new StringBuilder(ans);
        rev = rev.reverse();
        System.out.println(Integer.parseInt(rev.toString()));
    }
}
