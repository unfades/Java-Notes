/* 
class ArraySum{
    private int summer;
    public void sum(int[] brr){
        for(int i = 0; i<brr.length; i++){
            summer+=brr[i];
        }
        System.out.println("The sum of all elements is:" + summer);
    }
}
/*
Sir's method
class ArraySum{
    public int sum(int[] brr){
        int total = 0;
        for(int x:brr){
        total+=x;
        }
        return total;
    }
}

class UseArraySum{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        ArraySum obj = new ArraySum();
        obj.sum(arr);
    }
}

Sir's UseArraySum
import java.util.Scanner;
class UseArraySum{
    public static void main(String[] args){
        int[] arr = new int[5];
        ArraySum obj = new ArraySum();
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        obj.sum(arr);
    }
}
 

//Modify the previous code so that thefunction returns both Sum and Average rename the method
//to calcSumAndAverage()
//How will the calcSumAndAverage return 2 things at once? No idea?
//Solution, we can return an array from our method calcSumAndAverage()
//and the array will return Sum and Average
*/

import java.util.Scanner;

class ArraySum{
    public float[] calcSumAndAverage(int[] brr){
        float[] sumAvg = new float[2];
        int total = 0;
        for(int x:brr){
        total+=x;
        }
        float avg = (float)total/brr.length;
        sumAvg[0] = total;
        sumAvg[1] = avg;
        
        return sumAvg;
    }
}
/*Sir's version

class ArraySum{
    public double[] calculate(int[] brr){
        double [] ans = new double[2];
        int sum = 0;
        for(int x: brr){
        sum+=x;}
        }
        ans[0] = sum;
        ans[1] = (double)sum/brr.length;
        return ans;
    }
}
//SMART CHECK IT^
 */
class UseArraySum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        ArraySum obj = new ArraySum();
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //sir's 
        //obj.calculate(arr);
        float[] result;
        //need to go into result
        result = obj.calcSumAndAverage(arr);
        //obj.calcSumAndAverage(arr);

        System.out.println("Sum is " + result[0]);
        System.out.println("Average is " + result[1]);
        
    }
}

//Next Challenge