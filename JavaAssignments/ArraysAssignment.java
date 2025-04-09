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
        arr = new int[10];
        int i = 0;
        while(i<arr.length){
            System.out.println("(for minmaxdifference-Enter element["+i+"]: ");
            arr[i] = sc.nextInt();
            i++;
        }
        Arrays.sort(arr);
        System.out.println("minimum difference elements are: "+ arr[0] + "," + arr[1]);
        System.out.println("maximum difference elements are: "+ arr[0] + "," + arr[arr.length-1]);
        */
        //8
        /*
        int i = 0;
        int[] arr1 = {30,30,30,25,40,32,31,35,50,62,30,30,30,25,40,32,31,35,50,62};
        int[] arr2 = {1,2,3,4,7,49,30,25,40,32,31,35,50,60};
        int[] check = {30,25,40,32,31,35};
        System.out.println("Checking subarray for " + Arrays.toString(arr1));
        
        for(i = 0; i<arr1.length-check.length; i++){
            if(arr1[i] == check[0] && arr1[i+check.length-1] == check[check.length-1]){
                int b = i;
                int c = 0;
                while(arr1[b] == check[c] ){
                    if(arr1[b] == check[c] && c == check.length-1){
                        System.out.println("subarray lies between indexes " + i + " and " + b);
                        break;
                    }
                    b++;
                    c++;
                }
            }
        }

        System.out.println("Checking subarray for " + Arrays.toString(arr2));
        for(i = 0; i<arr2.length-check.length; i++){
            if(arr2[i] == check[0]){
                int b = i;
                int c = 0;
                while(arr2[b] == check[c]){
                    if(arr2[b] == check[c] && c == check.length-1){
                        System.out.println("subarray lies between indexes " + i + " and " + b);
                        break;
                    }
                    b++;
                    c++;
                }
            }
        }

        //9
        //find highest split into next highest+remsum return array

        Scanner sc = new Scanner(System.in);
        int[] arr;
        System.out.println("Enter the amount of elements you want:");
        int amt = sc.nextInt();
        arr = new int[amt];
        i = 0;
        while(i<arr.length){
            System.out.println("Enter element number["+i+"]: ");
            arr[i] = sc.nextInt();
            i++;
        }
        arr1 = arr.clone();
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        int secmax =arr[arr.length-2];
        System.out.println("The highest element found is: " + max);
        System.out.println("The second maximum found was: " + secmax);
        System.out.println("The highest max is seperated into: " + (max-secmax) + secmax);
        arr = arr1.clone();
        arr1 = new int[arr.length+1];
        int maxinterval = 0;
        for(i = 0; i<arr.length; i++){
            if(arr[i] == max){
                maxinterval = i;
                break;
            }
        }
        System.out.println("maxinterval is: " + maxinterval);
        for(i = 0; i<maxinterval; i++){
            arr1[i] = arr[i];
        }
        System.out.println("arr[1] is " + Arrays.toString(arr1));
        arr1[maxinterval] = secmax;
        arr1[maxinterval+1] = max-secmax;
        for(i = maxinterval+2; i<arr1.length; i++){
            arr1[i] = arr[maxinterval+1];
            maxinterval++;
        }
        System.out.println("arr[1] is " + Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr1));
    }
}
        /*


        //10
        //circular shift array right n times
        //CIRCLE SHIFT RIGHT OR LEFT
        int[] arr;
        arr = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        int k = 3;
        int rotate = 0;
        while(k>0){
            rotate++;
            if(rotate == arr.length-1) rotate = 0;
            k--;
        }
        System.out.println("The value of rotate is: " + rotate);
        int[] arr2 = new int[arr.length-rotate];
        int j = 0;
        for(int i = rotate; i<arr.length; i++){
            arr2[j] = arr[i];
            j++;
        }
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = new int[rotate];
        j = 0;
        for(int i = 0; i<rotate; i++){
            arr3[j] = arr[i];
            j++;
        }
        System.out.println(Arrays.toString(arr3));
        for(int i = 0; i<arr2.length-rotate; i++){
            arr[i] = arr2[i];
        }
        j = 0;
        for(int i = arr.length-rotate; i<arr.length; i++){
            arr[i] = arr3[j];
            j++;
        }
        System.out.println(Arrays.toString(arr));
        j = 0;
        for(int i = 0; i<arr.length-rotate; i++){
            arr[i] = arr2[j];
            j++;
        }
        System.out.println(Arrays.toString(arr));
        */

        //11
        System.out.println();
        //2D array of 3*3 matrx check if the matrix i symmetric or not.
        //meaning A = A transpose.

        //12
        
    }
}
