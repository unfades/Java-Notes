package MySolutions;
import java.util.Scanner;
public class Easy1 {
    //without hashmap
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int w = sc.nextInt();
        float tw = (4*v-w)/2;
        System.out.println(tw);
        System.out.println(v-tw);
        if((int)(2*tw) + (int)(4*(v-tw)) == w) System.out.println("TW = " + (int)tw + " FW = " + (int)(v-tw));
        else System.out.println("INVALID INPUT");
    }
}