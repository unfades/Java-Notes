import java.util.ArrayList;
import java.util.Scanner;

public class Lecture49Answer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Pear");
        fruits.add("Pomegranite");
        fruits.add("Kiwi");

        System.out.println("Enter a fruit name to remove: ");
        String f = sc.nextLine();

        if(fruits.contains(f)){
            fruits.remove(f);
            System.out.println(f + " was removed from the list of fruits");
        }else{
            System.out.println(f + " was not found in the list of fruits");
        }
        System.out.println(fruits);
    }
}
