import java.util.Scanner;

class Student{
    private int roll;
    private char grade;
    private String name;
    private double per;

    //need to make setStudent() parameterized to take input from main() method.
    //much better so no memory wastage.
    public void setStudent(int r, char c, String n, double p){
        roll = r;
        grade = c;
        name = n;
        per = p;
    }

    public void showStudent(){
        System.out.println("Name =" +name+"\nRoll =" +roll+"\nGrade ="+grade+"\nper ="+per);
    }
}



class UseStudent{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll no,grade,name, and per:");
        int rollNumber = sc.nextInt();
        char grade = sc.next().charAt(0);
        String name = sc.next();
        double percentage = sc.nextDouble();
        Student S = new Student();
        //only a single scanner does the job more efficiently and fine.
        //you can loop it to take input 1000 times, but still no memory wasted.
        S.setStudent(rollNumber, grade, name, percentage);
        S.showStudent();
    }
}