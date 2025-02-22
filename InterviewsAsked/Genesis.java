import java.util.Arrays;
public class Genesis
{
	public static void main(String[] args) {
		//1 WAP to find the second max element in an array
		int[] arr = {1,7,81,90,45,500};
		for(int j = 0; j<arr.length-1; j++){
		    for(int i = 0; i<arr.length-1; i++){
		        if(arr[i] > arr[i+1]){
		            int temp = arr[i];
		            arr[i] = arr[i+1];
		            arr[i+1] = temp;
		        }
		    }
		}
		System.out.println("The second largest element is: " + arr[arr.length-2]);
		//2 print this program
		/*
		12345
		1234
		123
		12
		1
		*/
		int n = 5;
		int number = n;
		for(int i = 0; i<n; i++){
		    for(int j = 1; j<=number; j++){
		        System.out.print(j);
		    }
		    number--;
		    System.out.println();
		}
		//3find the occurences of x number  inside an array of numbers
		int[] brr = {2,1,2,2,2,3,3,3,4};
		int x = 2;
		int count = 0;
		for(int i = 0; i<brr.length; i++){
		    if(brr[i]==x){
		        count++;
		    }
		}
		System.out.println(count);
		//4SQL LIMIT query
	}
}

//1. if in the array any addition of 2 numbers = x then return true
//else false

//2.String of '*' and '#', if equal return true, if not equal
//print how many stars or hash needed to make them equal and
//then return false.

//3. a1b3c5 String to -> abbbccccc a2b10c1 -> aabbbbbbbbbbc



