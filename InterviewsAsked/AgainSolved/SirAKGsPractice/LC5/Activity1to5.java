package SirAKGsPractice.LC5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Activity1to5 {
    public static void main(String[] args) {
        //1 rearrange arr elements in desc order print the arr to user
        int[] arr = {1,-1,100,99,81,78,89,999,77};
        ArrayList<Integer> al = new ArrayList<>();
        for(int i : arr){
            al.add(i);
        }
        Collections.sort(al, (a, b) -> {
            if(a>b) return 1;
            if(a<b) return -1;
            return 0;
        });
        System.out.println(al);
        int j = 0;
        for(int i: al){
            arr[j++] = i;
        }
        System.out.println("arr is reversed: " + java.util.Arrays.toString(arr));
        //2 order the arr, then remove duplicates and print
        int[] inputarr = {2,4,2,5,3,4,6,5,1,7};
        System.out.println(java.util.Arrays.toString(inputarr));
        java.util.Arrays.sort(inputarr);
        System.out.println(java.util.Arrays.toString(inputarr));
        HashSet<Integer> set = new HashSet<>();
        for(int i : inputarr){
            if(!set.contains(i)) set.add(i);
        }
        inputarr = new int[set.size()];
        j = 0;
        for(int i : set){
            inputarr[j++] = i;
        }
        System.out.println(java.util.Arrays.toString(inputarr));
        //3 get max its first and last occurrence
        int[] marr = {1,2,3,4,45,90,99,100,100,100,100,9,2};
        int max = Integer.MIN_VALUE;
        System.out.println(java.util.Arrays.toString(marr));
        for(int i : marr) if(max<i) max = i;
        System.out.println("max is: " + max);
        for(int i = 0; i<marr.length; i++) if(marr[i] == max){ System.out.println("first index of max: " + i); break;}
        for(int i = marr.length-1; i>0; i--) if(marr[i] == max){ System.out.println("last index of max: " + i); break;}
        //pos of x in arr if it exists... w/o i/p from user rn
        int[] arrpos = {1,2,3,4,45,90,99,100,100,100,100,9,2};
        System.out.println("enter number to search if it exists or not: ");
        Scanner sc = new Scanner(System.in);
        int search = sc.nextInt();
        for(int i = 0; i<arrpos.length; i++){
            if(arrpos[i] == search){System.out.println("found " + search + " at " + i); break;}
            if(i == arrpos.length-1 && arrpos[i]!=search) System.out.println("element doesnt exist inside the array");
        }
        //5 reverse sort then merge two arrays display the output...
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10,200,221};
        int[] arr2 = {-1,1,3,5,7,9,11,13,15,17,19};
        ArrayList<Integer> arrList1 = new ArrayList<>();
        ArrayList<Integer> arrList2 = new ArrayList<>();
        for(int i: arr1) arrList1.add(i);
        for(int i: arr2) arrList2.add(i);
        Collections.sort(arrList1, (a,b) -> {
            if(a>b) return -1;
            if(a<b) return 1;
            return 0;
        });
        Collections.sort(arrList2, (a,b) -> {
            if(a>b) return -1;
            if(a<b) return 1;
            return 0;
        });
        System.out.println(arrList1);
        System.out.println(arrList2);
        ArrayList<Integer> arrList3 = new ArrayList<>();
        int k = 0, l = 0;
        j = 0;
        for(int i = 0; i<(arrList1.size()+arrList2.size())-1; i++){
            if(j%2==0){ arrList3.add(arrList1.get(k++));}else{
                arrList3.add(arrList2.get(l++));
            }
            j++;
        }
        for(int i = j; j<arrList2.size(); i++){
            arrList3.add(i);
        }
        arrList3.add(arrList2.get(arrList2.size()-1));
        System.out.println(arrList3);
    }
}
