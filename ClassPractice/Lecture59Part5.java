import java.io.File;

public class Lecture59Part5 {
    public static void main(String[] args) {
        File f = new File("D:\\File");
        String[] arr = f.list();
        System.out.println("total members: " + arr.length);
        for(String i: arr){
            System.out.println(i);
        }
        
    }
}
