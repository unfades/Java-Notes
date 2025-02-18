import java.util.Scanner;

public class SortNumbers{
    public static void main(String[] args){
        int n = args.length-1;
        int[] arr = new int[n];
        Scanner sc = new Scanner(System.in);
        char c;
        c = args[0].charAt(0);
        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(args[i+1]);
        }
        System.out.println("Unsorted, it is: ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    if(c == 'D'){
        for(int i  = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(arr[i] > arr[j] && i!=j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted in descending order its: ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    if(c == 'A'){
        for(int i  = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(arr[i] < arr[j] && i!=j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted in ascending order its: ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
        
    }
}