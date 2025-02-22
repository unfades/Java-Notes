import java.util.Scanner;

public class AssignmentLecture30 {
/*
Assignments Assignments that were pending:

Argument Passing assignment:
WAP to create a class called Counter having a method called count(). This method should
receive an integer array and an integer x as argument and should count and return how
many numbers in the array are greater than x, how many numbers are smaller than x,
and how many numbers are equal to x. Finally it should return this count to the method main().

In the main() method create an integer array of size 10, accept values from user into the array.
And again ask the user to input another number. Now pass this array and the number given by the user
to the method count() of Counter class and print back the result.
*/
/*
Assignment related to static keyword:

WAP to create a class called Emp with the following members:
1. ename(String): Stores employee's name.
2. age(int): Stores the age of the employee.
3. id(int): Stores the id of the employee.

Methods:

1. Parameterized constructor: Should accept 2 arguments and should initialize name and age with it.
2. show(): Should display employee id, age, name.
3. showNextId(): should display the id of the next employee to be recruited.
So now how will id be initialized? That is the twist.

Points to remember:
1. id must be generated automatically.
2. id generation must start from 1.
3. means the id of subsequent employees must be incremented by 1.
4.No gaps should be there in id.
5. id must be unique for every employee.
there is no static keyword usage being used here it seems.
its given 3 data, we need to keep 4 data elements
the 4th element must be static, it's current value should go into id.**** important
4th element is counter, or nextId and should count nextId ****important    
*/
}

//Answer assignment 1:
class Counter{
    public void count(int[] arr, int x){
        int greater = 0, lesser = 0, equal = 0;
        for(int y: arr){
            if(y>x)
                greater++;
            if(y<x)
                lesser++;
            if(y==x)
                equal++;
        }
        System.out.println("There are " + greater + "numbers greater than " + x);
        System.out.println("  There are " + lesser + "numbers lesser than " + x);
        System.out.println(" There are " + equal + "numbers equivalent to " + x);
    }
}

class UseCounter{
    public static void main(String[] args){
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<arr.length; i++){
            System.out.println("Enter number for array index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number to see greater, lesser, equal for array terms: ");
        int a = sc.nextInt();
        Counter myObj = new Counter();
        myObj.count(arr, a);
        sc.close();

    }
}

class Emp{
    //should make em private, yeh.
    private String ename;
    private int age;
    private int id;
    private static int current = 0;
    Emp(int x, String y){
        age = x;
        ename = y;
        current++;
        id = current;
    }
    public static void showNextId(){
        System.out.println("The id of the next employee to be recruited is: " + (current + 1));
    }
    public void show(){
        System.out.println("Employee name: " + ename);
        System.out.println("Employee  age: " + age);
        System.out.println("Employee   id: " + id);
    }
}

class UseEmp{
    public static void main(String[] args){
        /* Ask how to ask employees dynamically...
        Scanner sc = new Scanner(System.in);
        int age = 0;
        String name = "";
        int n = 0;
        System.out.println("How many employees does your company want?: ");
        n = sc.nextInt();
        for(int i = 0; i<n; i++){
            System.out.println("Employee " + (i+1) +" enter your age: ");
            age = sc.nextInt();
            System.out.println("Employee " + (i+1) +" enter your name: ");
            name = sc.next();
            Emp myEmployee = new Emp(age, name);
        }
        */
        Emp myEmployee = new Emp(64, "Larson");
        Emp myEmployee2 = new Emp(80, "Haiden");

        myEmployee.show();
        myEmployee2.show();

        Emp.showNextId();
    }
}

/*
Sir's solution:

class Emp{
    private String ename;
    private int age;
    private int id;
    private static int nextId = 1;
    Emp(int x, String y){
        age = x;
        ename = y;
        id = nextId++; //smart 
    }
    public static void showNextId(){
        System.out.println("The id of the next employee to be recruited is: " + (nextId + 1));
    }
    public void show(){
        System.out.println("Employee name: " + ename);
        System.out.println("Employee  age: " + age);
        System.out.println("Employee   id: " + id);
    }
}

class UseEmp{
    public static void main(String[] args){
        Emp myEmployee = new Emp(64, "Larson");
        Emp myEmployee2 = new Emp(80, "Haiden");

        myEmployee.show();
        myEmployee2.show();

        Emp.showNextId();
    }
}
 */