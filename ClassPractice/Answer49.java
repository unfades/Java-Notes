import java.util.ArrayList;
import java.util.Scanner;

public class Answer49 {
    public static void main(String[] args) {

        ArrayList<String> months = new ArrayList<>();

        months.add("Jan");
        months.add("Feb");
        months.add("Mar");
        months.add("Apr");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month name in 3 letters TO REMOVE,first cap[ex: Jun,Feb]: ");
        String m = sc.nextLine();

        if(months.contains(m)){
            months.remove(m);
            System.out.println(m + " removed");
        }else{
            System.out.println(m + " month not present in the ArrayList");
        }
        System.out.println(months);
    }    
}
