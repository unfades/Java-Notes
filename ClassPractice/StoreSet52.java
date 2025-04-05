/* 
import java.util.HashSet;

class StoreSet52{
    public static void main(String[] args){
        HashSet<String> months = new HashSet<>();
        months.add("Jan");
        months.add("Feb");
        months.add("Mar");
        months.add("Apr");
        for(String i: months){
            System.out.println(i);
        }
        //Or
        System.out.println(months.toString());
    }
}
*/
import java.util.HashSet;
import java.util.Iterator;

class StoreSet52{
    public static void main(String[] args){
        HashSet<String> months = new HashSet<>();
        months.add("Jan");
        months.add("Feb");
        months.add("Mar");
        months.add("Apr");

        Iterator<String> it = months.iterator();

        while(it.hasNext()){ // if instead of it.hasNext() it were true, then we would see NoSuchElementException
            //at the end when there was no element and the loop traversed.
            String s = it.next(); //Iterator<String> makes it typesafe. So it tells java
            //only strings are going to come through it.next()
            System.out.println(s);
        }
    }
}