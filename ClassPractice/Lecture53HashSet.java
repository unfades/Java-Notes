import java.util.HashSet;

class Student53{
    private String name;
    int roll;
    double per;
    public Student53(String name, int roll, double per){
        this.name = name;
        this.roll = roll;
        this.per = per;
    }
    public String toString(){
        return name;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + roll;
        long temp;
        temp = Double.doubleToLongBits(per);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student53 other = (Student53) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (roll != other.roll)
            return false;
        if (Double.doubleToLongBits(per) != Double.doubleToLongBits(other.per))
            return false;
        return true;
    }
    
    //then regenerate the hashCode() and equals() via Ctrl + .
    //and then you will get the logic that pertains to it.

    
    
}

public class Lecture53HashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String str1 = new String("Aman");
        System.out.println("hashCode for str1:" + str1.hashCode());
        set.add(str1);
        
        String str2 = new String("Suman");
        System.out.println("hashCode for str2:" + str2.hashCode());
        set.add(str2);

        String str3 = new String("Aman");
        System.out.println("hashCode for str3:" + str3.hashCode());
        set.add(str3);
        System.out.println("Size of the set is: " + set.size());
        System.out.println(set); //2 Aman and Suman

        //hashCodes are the same because String class overided the hashCode() method.
        HashSet<Student53> set2 = new HashSet<>();
        Student53 s1 = new Student53("Aman",101, 75.0);
        System.out.println("hashCode for s1:" + s1.hashCode());
        set2.add(s1);
        Student53 s2 = new Student53("Suman",111,45.0);
        System.out.println("hashCode for s2:" + s2.hashCode());
        set2.add(s2);
        Student53 s3 = new Student53("Aman",102,80.0);
        System.out.println("hashCode for s3:" + s3.hashCode());
        set2.add(s3);
        System.out.println("Size of the set is: " + set2.size());
        System.out.println(set2); 
    }
}
