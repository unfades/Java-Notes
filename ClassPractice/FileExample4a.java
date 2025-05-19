import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExample4a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = null;
        try{
            fw = new FileWriter("D:/person.txt");

            for(int i = 0; i<2; i++){
                System.out.println("Enter name and phone: ");
                String name = sc.next();
                fw.write(name+ " ");
                long phone = sc.nextLong();
                fw.write(String.valueOf(phone));
                fw.write("\n");
            }
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
