import java.util.Scanner;
import java.util.ArrayList;

public class Lecture49Answer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> countries = new ArrayList<>();

        countries.add("America");
        countries.add("India");
        countries.add("Brazil");
        countries.add("Russia");
        countries.add("France");

        System.out.println("Enter a country to check if it is \n one of the top affected by Covid 19:");
        String country = sc.next();

        if(countries.contains(country)){
            System.out.println("Your country ranks no. " + (countries.indexOf(country)+1) +" most affected by Covid19");
        }else{
            System.out.println("Country not found among the top 5 affected by Covid19");
        }
    }
}
