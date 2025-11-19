package SirAKGsPractice.LC2;

public class Activity1to5 {
    public static void main(String[] args) {
        //1 count dig of a number
        int num = 1234510;
        System.out.println("The length of num is : " + (""+num).length());
        //2 sum of all dig of a number
        int num2 = 999435;
        int sum = 0;
        while(num2>0){sum+=num2%10; num2/=10;}
        System.out.println("The sum of all numdigits is: " + sum);
        //3decimal integer to binary representation
        int dec = 93;
        System.out.println(Integer.toBinaryString(dec));
        //4 binary to integer
        String bin = "101";
        System.out.println(Integer.valueOf(bin, 2));
        //5find smallest divisor besides 1
        int find = 99;
        int found = 2;
        while(found<find){
            if(find%found == 0){ System.out.println("found: " + found); break;}
            found++;
        }
        
    }
}
