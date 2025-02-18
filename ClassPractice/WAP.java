public class WAP {
    public static void main(String[] args) {
        System.out.println("Enter amount of numbers: ");
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        int num = 0;
        if(n<2){
            System.out.println("please enter at least 2 numbers...");
        }else{
            System.out.println("Now enter" + n + " numbers: ");
            for(int i = 0; i<n; i++){
                System.out.println("Enter element "+ i + ": ");
                num = Integer.parseInt(args[i]);
                sum+=num;
            }
        }
        System.out.println(sum);
    }
}
