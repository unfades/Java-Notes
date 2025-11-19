package MySolutions;
import java.util.HashSet;
public class Easy4 {
    public static void main(String[] args) {
        //product of 2 DISTINCT(means different) numbers.
        HashSet<Integer> set = new HashSet<>();
        int n = 36;
        int count = 0;
        for(int i = 1; i<n/2; i++){
            if(n%i==0 && i!=n/i && !set.contains(n/i)){
                set.add(i);
                count++;
                System.out.println(n/i +"*"+ i + " is "+ n);
            }
        }
        System.out.println(count);
    }
}
