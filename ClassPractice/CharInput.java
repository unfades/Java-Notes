import java.util.Scanner;

class CharInput{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        char ch;
        String str;
        System.out.println("Enter a character: ");
        ch = kb.next().charAt(0); //this is called chaining
        System.out.println(ch);
    }
}