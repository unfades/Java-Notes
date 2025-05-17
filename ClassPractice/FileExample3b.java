import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class FileExample3b{
    public static void main(String[] args) {
        FileReader fr = null;
        try{
            fr = new FileReader("D:/AboutJava.txt");
            BufferedReader br = new BufferedReader(fr);
            String str;
            int count = 0; 
            while((str=br.readLine())!=null){
                System.out.println(str);
                count = count+str.length();
            }
            System.out.println("\nTotal characters read: "+count);
        }catch(FileNotFoundException fnf){
            System.out.println("Cannot open the file: "+ fnf.getMessage());
        }catch(IOException io){
            System.out.println("Error while reading file");
        }finally{
            if(fr!=null){
                try{
                    fr.close();
                }catch(Exception ex){
                    System.out.println("Error while closing the file");
                }
            }
        }
    }
}
