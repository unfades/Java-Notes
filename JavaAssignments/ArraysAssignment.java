package JavaAssignments;

import java.util.Scanner;
import java.util.Arrays;

public class ArraysAssignment {
    public static void main(String[] args){
        //1
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i<arr.length; i++){
            System.out.println("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Give a number to check if the array has it or not: ");
        int num = sc.nextInt();
        //binary search
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int start = arr[0];
        int end = arr[arr.length-1];
        int index = start + (end - start)/2;

        while(start<=end){
            index = start + (end-start)/2;
            if(index == num){ System.out.println("found"+ num); break;}
            if(index > num){ end = index+1;}
            if(index < num){ start = index-1;}
            
        }

        //2
        
    }
}
