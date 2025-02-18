import java.util.Scanner;
public class TwoDimArr {
    public static void main(String[] args){
        int [][]arr;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the rows and columns: ");

int r = sc.nextInt();
int c = sc.nextInt();
arr = new int[r][c];

for(int i =0; i<r;i++){
    for(int j = 0; j<c; j++){
        System.out.println("Enter a number: ");
        arr[i][j] = sc.nextInt();
    }
}

int sum = 0;

for(int i =0; i<r;i++){
    for(int j = 0; j<c; j++){
        System.out.println(arr[i][j] + " + ");
        sum += arr[i][j];
    }
    System.out.println();
}
System.out.println("Sum is " + sum);
System.out.println("Avg is " + (float)sum/(r*c));
    }
}

