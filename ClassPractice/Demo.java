class Demo{
    public void doubler(int[] brr){
        for(int i = 0; i<brr.length; i++){
            brr[i] = 2*brr[i];
        }
    }
}

class UseDemo{
    public static void main(String [] args){
        int[] arr = {10,20,30,40,50};
        System.out.println("Before doubling:");
        for(int i: arr){
            System.out.println(i);
        }
        Demo obj = new Demo();
        obj.doubler(arr);
        System.out.println("After doubling:");
        for(int i: arr){
            System.out.println(i);
        }
    }
}
//Challenge WAP to create a class called ArraySum, having a method called
//sum, This method should accept an integer array as argument.
//and should return the sum of all the elements of that array.
//Then define the driver class called as UseArraySum, containing method main()
//WIthin the main() method create an integer array of size 5 taking user input in the array elements
//using the method sum() calculate the sum of all the array elements and display it

