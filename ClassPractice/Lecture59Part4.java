import java.io.File;

public class Lecture59Part4 {
    public static void main(String[] args) {
        //initially all false since nothing is there,
        //then after replacing mkdir with mkdirs() then false, true true, cause the paths will be made
        //if not already present for the folder
        File f = new File("D:\\File\\City\\Address");
        System.out.println(f.getName() + " exists?: " + f.exists());
        System.out.println(f.getName() + " gotcreated?: " + f.mkdirs());
        System.out.println(f.getName() + " exists?: " + f.exists());
    }
}
