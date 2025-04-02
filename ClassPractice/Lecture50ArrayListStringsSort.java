
import java.util.ArrayList;
import java.util.Collections;

public class Lecture50ArrayListStringsSort{
    public static void main(String[] args){
        ArrayList<String> months = new ArrayList<>();
        months.add("Jan");
        months.add("Feb");
        months.add("Mar");
        months.add("Apr");
        months.add("May");

        Collections.sort(months);
        System.out.println(months);
    }
}
