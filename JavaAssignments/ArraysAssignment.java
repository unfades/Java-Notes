package JavaAssignments;

import java.util.Scanner;
import java.util.Arrays;

public class ArraysAssignment {
    public static void main(String[] args){
        /*
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
            if(arr[arr.length-1] == num){System.out.println("found num"); break;}
        }

        //2
        int[] arr2 = new int[20];
        System.out.println("Enter 20 integers: ");
        int pos = 0, neg = 0, even = 0, odd = 0, zero = 0;
        for(int i = 0; i<20; i++){
            arr2[i] = sc.nextInt();
            if(arr2[i]>0) pos++;
            if(arr2[i]<0) neg++;
            if(arr2[i]%2==0) even++;
            if(arr2[i]%2!=0) odd++;
            if(arr2[i] == 0) zero++;
        }
        System.out.println("pos: " + pos);
        System.out.println("neg: " + neg);
        System.out.println("even: " + even);
        System.out.println("odd: " + odd);
        System.out.println("zero: " + zero);
        */
        //3
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] arrcpy = new int[arr.length];
        int j = arrcpy.length-1;
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            arrcpy[j] = arr[i];
            j--;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrcpy));

        //4 //5
        int sum = 0, prod = 1, large = Integer.MIN_VALUE, small = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            sum+=arr[i]; prod*=arr[i];
            if(arr[i]> large) large = arr[i];
            if(arr[i]< small) small = arr[i];
            if(i == arr.length-1){ 
                System.out.println("Sum is: " + sum + " Prod is: " + prod);
                System.out.println("Largest is: " + large + " Smallest is: " + small);
            }
        }
        //6
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            if(arr[start]!=arr[end]){ System.out.println("Array is not a palindrome..."); break;}
            else if((start == end || start+1  == end) && (arr[start] == arr[end])){ System.out.println("Array is a palindrome..."); break;}
            else if(arr[start] == arr[end]){ start++; end--;}
        }
        //7
        //minmax difference elements returner

        //8

        //9
        //find highest split into next highest+remsum return array

        //10
        //circular shift array right n times

        //11
        //2D array of 3*3 matrx check if the matrix i symmetric or not.
        //meaning A = A transpose.

        //12
        
    }
}
