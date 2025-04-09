import java.util.HashMap;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
class Lecture55HashMap {
    public static void main(String[] args) {
        HashMap<String, Long> teamSCA = new HashMap<>();
        teamSCA.put("Sachin",70000897L);
        teamSCA.put("Afroz",10005897L);
        teamSCA.put("Shivam",90080897L);
        teamSCA.put("Faizaan",80060897L);

        Set<Map.Entry<String,Long>> all = teamSCA.entrySet();
        for(Map.Entry<String,Long> i : all){ //all contains Entry members Map.Entry cause Entry is nested in Map
            //now we are printing Map.Entry types k v pairs String and Long in all that is of type Map.Entry
            System.out.println(i); //gives the Map.Entry
            System.out.println(i.getKey()); // gives the Key
            System.out.println(i.getValue()); //gives the Value
        }
    }    
}
