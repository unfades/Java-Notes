package MySolutions;

//import java.util.Scanner;

public class Easy3 {
    // unperpetual max
    // that proves if each element
    // is bigger than the last
    // in O(1)
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }
        //int[] arr = {7,4,8,2,9};
        int[] arr = {3,4,5,8,9};
        int max = arr[0];
        int count = 1;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>max){ count++; max = arr[i];}
        }
        System.out.println(count);
    }
}
