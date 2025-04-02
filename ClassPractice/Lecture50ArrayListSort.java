import java.util.ArrayList;
import java.util.Collections;

public class Lecture50ArrayListSort{
    public static void main(String[] args){
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(50);
        marks.add(25);
        marks.add(70);
        marks.add(90);
        marks.add(15);

        Collections.sort(marks);
        System.out.println(marks);
    }
}
