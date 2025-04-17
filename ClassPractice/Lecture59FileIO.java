import java.io.*;
public class Lecture59FileIO{
    public static void main(String[] args){
        File myfile = new File("D:/File/TestWord.docx");
        if(myfile.exists()){
            System.out.println(myfile.getName() + " is present.");
        }else{
            System.out.println("File is not present");
            System.exit(0);
        }

        if(myfile.isFile()){
            System.out.println(myfile.getName() + " is a file" + " and its size is " + myfile.length());
        }else{
            System.out.println(myfile.getName() + " is a directory");
        }

        if(myfile.isHidden()){
            System.out.println(myfile.getName() + " is hidden!");
        }else{
            System.out.println(myfile.getName()  + " is not hidden...");
        }

        if(myfile.canWrite()){
            System.out.println(myfile.getName() + " allows writing");
        }else{
            System.out.println(myfile.getName() + " doesnt allow writing");
        }
    }
}
