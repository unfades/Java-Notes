import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class FileExample3a{
    public static void main(String[] args) {

        FileReader fr = null;
        try{
            fr = new FileReader("D:/AboutJava.txt");
            int count = 0;
            File f = new File("D:/AboutJava.txt");
            char[] arr = new char[(int)f.length()];
            count = fr.read(arr);
            String s = new String(arr);
            System.out.println(s);
            System.out.println("\nTotal characters read: "+count);
        }catch(FileNotFoundException fnf){
            System.out.println("Cannot open the file: "+ fnf.getMessage());
        }catch(IOException io){
            System.out.println("Error while reading file");
        }finally{
            //must happen, as long as fr is not null, then close it up, its try catch in finally again because
            //close also throws IOException
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
//The BufferedReader class is the recommended way to do stuff not this
/*Because the FileReader uses read() and it gets it from the disk,
 meaning its called again and again making the performance slower...
 Better to use BufferedReader instead.
Because Buffer is in RAM.

 BufferedReader gets the data from the file and BufferedReader is faster.

 BufferedReader is the fastest class of Reader class speed wise, reading is super fast.
 */

 