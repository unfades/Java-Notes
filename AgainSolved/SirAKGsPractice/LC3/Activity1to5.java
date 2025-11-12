package SirAKGsPractice.LC3;

import java.util.Scanner;

public class Activity1to5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1 arr size 10 accpt input, print sum
        int[] arr = new int[10]; int sum = 0;
        System.out.println("Enter 10 array elements: ");
        for(int i = 0; i<arr.length; i++){ arr[i] = sc.nextInt(); sum+= arr[i];}
        System.out.println("The sum of all elements is: " + sum);
        //2 top 3 max of arr top 3 min of arr (no sorting allowed)
        int max1 = Integer.MIN_VALUE, max3; int max2 = max3 = max1;
        int min1 = Integer.MAX_VALUE, min3; int min2 = min3 = min1;
        for(int i : arr){ if(i>max1) max1 = i; if(i<min1) min1 = i;}
        for(int i : arr){ if(i>max2 && i<max1) max2 = i; if(i<min2 && i>min1) min2 = i;}
        for(int i : arr){ if(i>max3 && i<max1 && i<max2) max3 = i; if(i<min3 && i>min1 && i>min2) min3 = i;}
        if(min2 == Integer.MAX_VALUE) min2 = min1;
        if(max2 == Integer.MIN_VALUE) max2 = max1;
        if(min3 == Integer.MAX_VALUE) min3 = min2;
        if(max3 == Integer.MIN_VALUE) max3 = max2;
        System.out.println("max1: " + max1);
        System.out.println("max2: " + max2);
        System.out.println("max3: " + max3);
        System.out.println("min1: " + min1);
        System.out.println("min2: " + min2);
        System.out.println("min3: " + min3);
        //3 rev arr elements
        int[] torev = {1,2,3,4,5};
        for(int i = 0; i<torev.length/2; i++){
            torev[i] = torev[i]^torev[torev.length-i-1];
            torev[torev.length-i-1] = torev[i]^torev[torev.length-i-1];
            torev[i] = torev[i]^torev[torev.length-i-1];
        }
        System.out.println(java.util.Arrays.toString(torev));
        /*4 Design algo that accepts a set of N(set N as 30) students
        exam marks(ranging 0-100) then make a count of number of students that
        obtained each mark, like how many got 0, 1, got 2, got 3, .. got 99, got 100,
        then print out how many got these numbers also...*/
        int[] marks = {0,21,33,45,45,66,77,88,99,100,91,92,93,94,95,
                       0,21,33,45,45,66,77,88,99,100,91,92,93,94,95,100};
        int[] markstorage = new int[102];
        for(int i = 0; i<marks.length; i++){
            markstorage[marks[i]]++;
        }
        int start = 1, end = 10, n = 10;
        while(n>0){
        int count = 0;
        for(int i = 0; i<marks.length; i++){
            if(marks[i]>=start && marks[i]<=end) count++;
        }
        System.out.println("score in range " + start + " to " + end + ",students: " + count);
        start+=10; end+=10; n--;
        }
    }
}
