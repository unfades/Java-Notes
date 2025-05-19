import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExample4b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = null;
        try{
            pw = new PrintWriter("D:/person.txt");

            for(int i = 0; i<2; i++){
                System.out.println("Enter name and phone: ");
                String name = sc.next();
                Long number = Long.valueOf(sc.next());
                pw.println(name + " " + number);
            }
        }catch(IOException ex){
            System.out.println("Error while writing file");
        }finally{
            if(pw!=null){
                try{
                    pw.close();
                    System.out.println("File was saved successfully...");
                }catch(Exception e){
                    System.out.println("Error while closing the file...");
                }
            }
            sc.close();
        }
    }
}