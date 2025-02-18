import java.util.Scanner;

class WhileDemo{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
	String yes;
	        
	do{
		System.out.println("Enter 2 Integers: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Sum is " + (a+b));
		System.out.println("Do you want to continue? Type \"Yes\" if you do without any quotes: ");
		yes = scan.nextLine();
	}while(yes.equals("Yes"));
    }
}