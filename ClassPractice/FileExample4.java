import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileExample4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = null;
        try{
            fw = new FileWriter("D:/myfile.txt");
            System.out.println("What is your name?");
            String name = sc.nextLine();
            System.out.println("What is your address?");
            String addr = sc.nextLine();
            fw.write(name);
            fw.write("\n");
            fw.write(addr);
        }catch(IOException ex){
            System.out.println("Error while writing file");
        }finally{
            if(fw!=null){
                try{
                    fw.close();
                    System.out.println("File was saved successfully...");
                }catch(Exception e){
                    System.out.println("Error while closing the file...");
                }
            }
            sc.close();
        }
    }
}
