import java.util.Scanner;
import java.io.IOException;
import java.sql.SQLException;

class UserInput{
    public void getInt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an int: ");
        int a = sc.nextInt();
        System.out.println("You inputted: " + a);
    }

    public void getChar() throws IOException{
        System.out.println("Enter a character: ");
        char ch = (char)System.in.read();
        System.out.println("The character you entered is: " + ch);
    }
}


public class Lecture46Example {
    //just to prove you can write multiple exceptions with throws
    //in case you want to put more exceptions to handle.
    //and you can handle some using try catch, and put some in throws.
    public static void main(String[] args)throws IOException, SQLException{
        UserInput obj = new UserInput();
        obj.getInt();
        obj.getChar(); //caller must use try catch or also use throws keyword as seen
    }
}


//Better to use try catch in main method as it avoids being a cutting corners type coder.

//throws tells the method caller to handle it from the method prototype.

//indirectly everyone's caller is main.

//You can write multiple Exceptions in throws
