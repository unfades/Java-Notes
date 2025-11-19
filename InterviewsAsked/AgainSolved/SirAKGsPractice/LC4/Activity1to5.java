package SirAKGsPractice.LC4;

import java.util.HashMap;

public class Activity1to5 {
    public static void main(String[] args) {
        //1rev string and display it
        String s = "Hello, have a nice day!";
        System.out.println((new StringBuilder(s).reverse().toString()));
        //2 replace all vowels with z, if no vowels display no vowels present
        String vowely = "Old Macdonald had a farm e i e i o";
        String res = vowely.replaceAll("[aeiou]","").length()<vowely.length()? vowely.replaceAll("[aeiou]",""):"no vowels present";
        System.out.println(res);
        //3 count of all letters of the string
        s = "hello world";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        System.out.println(map);
        for(Character i : map.keySet()){
            System.out.println(i + "-" + map.get(i));
        }
        //5 rev second string concat and print result string
        String s1 = "Hello", s2 = "World";
        System.out.println(s1 + (new StringBuilder(s2).reverse().toString()));
    }   
}
