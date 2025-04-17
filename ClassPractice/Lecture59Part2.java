import java.io.*;

public class Lecture59Part2 {
    public static void main(String[] args) {
        //go create this file in the directory if it is not there already first for it to work
        File myfile = new File("D:/File/mysecrets.txt");
        System.out.println(myfile.getName() + " exists?: " + myfile.exists());        
        System.out.println(myfile.getName() + " size in bytes is: " + myfile.length() + " bytes");
        System.out.println(myfile.getName() + "is deleted?: " + myfile.delete());
        System.out.println(myfile.getName() + " exists now after deletion?: " + myfile.exists());
    }
}
