package MySolutions;

import java.util.Scanner;
public class Easy2 {
    public static void main(String[] args) {
        /*catch the mistakes in the series
        record first two nums, each step at which 
        res differs at the array, then you will
        increment count for needing change
        constraints start with 2 n' 1, then record mistake indices
        // o/p MUST be positive */
        Scanner sc = new Scanner(System.in);
        int change = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        //The first two elements are 1 and 2
        arr[0] = 2;
        arr[1] = 1;
        for(int i = 2; i<n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        int[] arr2 = new int[arr.length];
        for(int i = 0; i<arr2.length; i++){
            arr2[i] = sc.nextInt();
        }
        // System.out.println(java.util.Arrays.toString(arr));
        // System.out.println(java.util.Arrays.toString(arr2));
        for(int i = 0; i<arr2.length; i++){
            if(arr2[i]!=arr[i]) change++;
        }
        if(arr[0]!=2 || arr[1]!= 1) System.out.println("INVALID INPUT");
        else System.out.println(change);
    }
}
