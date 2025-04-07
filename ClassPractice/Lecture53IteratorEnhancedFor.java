import java.util.ArrayList;
import java.util.Iterator;

public class Lecture53IteratorEnhancedFor {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Jan");
        list.add("Feb");
        list.add("Mar");
        list.add("Apr");
        list.add("May");
        list.add("Jun");

        //foreach style removal of F starting element
        /* 
        for(String i: list){
            if(i.startsWith("F")){
                list.remove(i);
            }
        }
            */
            //Enhanced for is only for ACCESSING COLLECTION DATA
            //NOT MODIFYING IT
            //Otherwise it will throw ConcurrentModificationException Exception.
            //Enhanced for is not applicable for modification of Collection data.
        
            //iterator also has a remove() method.
            //it.remove() do not pass the data inside, just remove() alone.
            //Iterator works for all Collections.
            //Iterator is a method of Collection. Then all Collection classes use it.
            //Use iterator for traversing and changes during it.
            
            Iterator<String> it = list.iterator();
            System.out.println(list);
            while(it.hasNext()){
                String s = it.next();
                if(s.startsWith("F")){
                    it.remove();
                }
            }
            System.out.println(list);
    }
}
