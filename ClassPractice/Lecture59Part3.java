import java.io.*;
import java.util.Date;

public class Lecture59Part3 {
    public static void main(String[] args) {
        //go create this file in the directory if it is not there already first for it to work
        File myfile = new File("D:/File/mysecrets.txt");
        System.out.println(myfile.getName() + " exists?: " + myfile.exists());        
        System.out.println(myfile.getName() + " was last modified " + myfile.lastModified());
        Date d = new Date(myfile.lastModified());
        System.out.println("the above time is: " + d);
    }
}