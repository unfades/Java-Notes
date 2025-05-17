import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExample3{
    public static void main(String[] args) {

        //in case the file is not present, then in the try, there is a FileNotFoundException.
        //user gets the message System cannot find the file etc..

        //finally runs. and then if is false. because the file wasnt opened, its null,
        //then there would be a NullPointerException,
        //to be saved from that NullPointerException, then we use if(fr!=null)

        FileReader fr = null;
        try{
            fr = new FileReader("D:/AboutJava.txt"); //filepath to read via FileReader object, cause Reader is Abstract. FileReader is its child.
            /*throws FileNotFound Exception check prototype, checked exception,
            must use try catch or use throws in main()*/
            int ch; //int because read() returns unicode of the current char() being read, then moves to the next char.
            int count = 0; //to count the characters.
            while((ch=fr.read())!=-1){
                System.out.print((char)ch);
                ++count;
            }
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