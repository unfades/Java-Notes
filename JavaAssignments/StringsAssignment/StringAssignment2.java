//task is to print all duplicates of the string along with their counts

import java.util.Scanner;
import java.util.HashMap;

public class StringAssignment2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean onlyone = true;
        String s = sc.nextLine();
        if(s.length() == 1){
            System.out.println(s + " with count: " + 1);
        }

        if(s.length()>1){
            char[] arr = s.toCharArray();
            HashMap<Character, Integer> map = new HashMap<>();
            for(char i : arr){
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
            
            for(char i: map.keySet()){
                if(map.get(i)> 1){
                    onlyone = false;
                    System.out.println(i + " with count: " + map.get(i));
                }
            }
        }
        if(onlyone){
            System.out.println("there are no multiple elements in the string");
        }
        sc.close();
    }
}
