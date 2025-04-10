class Lecture35{

}

class Emp4{
    private int age;
    private String name;
    private double sal;

    public void setEmp4(int a, String s, double amt){
        age = a;
        name = s;
        sal = amt;
    }
    public void showEmp4(){
        System.out.println(age+" "+name+" "+sal);
    }
}

class UseEmp4{
    public static void main(String[] args){
        Emp4 e = new Emp4();
        Emp4 f = new Emp4();

        e.setEmp4(21,"Karan",35000);
        f.setEmp4(24,"Neeraj",40000);

        e.showEmp4();
        f.showEmp4();
    }
}

//JAVA BEST PRACTICES NOT FOLLOWED HERE.
//COMPANIES WANT THIS SO OUR COLLEAGUES CAN TRACE OUR CODE EASILY.
//UNIFORMITY OF CODE SHOULD BE MAINTAINED AND IT SHOULD BE EASY TO DEBUG.

Whenever you have a method in Java where you are initializing the parameters,
it should be best that the paremeter names are the same as the instance variables

class Emp4{
    private int age; // instance variables
    private String name;
    private double salary;

    public void setEmp4(int age, String name, double salary){ //local variables
        age = age; //local variable age is on both sides.
        //this is like saying name = name. which is just nothing lol like x = x.
        //so the default value goes inside so it's gonna be default which is 0
        //same for the below.
        //we can use this keyword in order to specify the instance variable of 
        //the object is being initialized.
        name = name;
        salary = salary;
    }
    public void showEmp4(){
        System.out.println(age+" "+name+" "+sal);
    }
}

class UseEmp4{
    public static void main(String[] args){
        Emp4 e = new Emp4();

        e.setEmp4(21,"Fardeen",35000);

        e.showEmp4();
        //the output will be 0, null, 0.0
        //the compiler will prefer local variables over instance variables.
    }
}

============================================================================
Resolving overlapping using this keyword: 

class Emp4{
    private int age; // instance variables
    private String name;
    private double salary;

    public void setEmp4(int age, String name, double salary){ //local variables
        this.age = age;
        //we can use this keyword in order to specify the instance variable of 
        //the object is being initialized.
        this.name = name;
        this.salary = salary;
    }
    public void showEmp4(){
        System.out.println(age+" "+name+" "+sal);
    }
}

class UseEmp4{
    public static void main(String[] args){
        Emp4 e = new Emp4();

        e.setEmp4(21,"Fardeen",35000);

        e.showEmp4();
        //the output will be 21, Fardeen, 35000
        //the compiler will now know it is the instance variables of the object
        //since we used this.
    }
}

//The same rule applies to constructors.

Q. When we could in the parameters of the method give other names,
then why did we use the same name of instance variables and also
of the local variables? and used this?

A. because it is best practices.
If you want netbeans to make a constructor by default,
then it can do so. 
And netbeans will make it that way as well.


=======================================================================

this keyword example 2:

class Box{
    private int l,b,h;

    public Box(){
        l=b=h=0;
    }
    public Box(int side){
        l=b=h=side;
    }
    public Box(int length, int breadth, int height){
        l=length;
        b = breadth;
        h = height;
    }

    public Box(Box P){
        l=P.l;
        b = P.b;
        h = P.h;
    }
}

class UseBox{
    public static void main(String[] args) {
        Box B1 = new Box();
        Box B2 = new Box(10);
        Box B3 = new Box(10,10,20); //all Box constructors are similar to B3
        //so we will leave the other constructor bodies empty, and just write code in B3's body.
        //and using the this keyword, we will call the constructor
        Box B4 = new Box(B3);
        
        B1.show();
        B2.show();
        B3.show();
        B4.show();
    }
}

demonstrated:
=============

class Box{
    private int l,b,h;

    public Box(){
        this(0,0,0);
    }
    public Box(int side){
        this(side,side,side);
    }
    public Box(int length, int breadth, int height){
        l=length;
        b = breadth;
        h = height;
    }

    public Box(Box P){
        this(P.l,P.b,P.h);
    }
}

class UseBox{
    public static void main(String[] args) {
        Box B1 = new Box();
        Box B2 = new Box(10);
        Box B3 = new Box(10,10,20);
        Box B4 = new Box(B3);
        //same functionality, however saved our typing efforts.
        //multiple constructors are called, this() inside other constructors
        //calls the B3's constructor..
        //for B3, just one constructor is called since B3 is the master constructor.
        //this is called constructor chaining!
        B1.show();
        B2.show();
        B3.show();
        B4.show();
    }
}

So now the concept of Constructor chaining is clear, it helps us save out typing efforts.
Execution time is increased however our typing efforts are saved.
And just 1 function call is not making a huge difference to performance anyways,
and coding is easier, readability is easier. 
This is also a best practice.

For constructor chaining there are 2 conditions:

CONSTRUCTOR CHAINING:
=====================
Q.WHat is constructor chaining?
A.Constructor chaining is the concept of calling constructor of a class from another constructor of the same class.

Q.How is constructor chaining possible?
A. it is done by using "this". 
"this" functionality is to send the message of ours from one constructor to another constructor.

Q.What are the prerequisites for constructor chaining?
A. Constructor chaining can only be done with constructors.
Meaning this() with parenthesis is only possible to execute that way in a constructor.

1. Only a constructor can call another constructor of the SAME class using this().

2.While calling another constructor from the current constructor, this() must be the first statement.

ex:

public Box(){
    this(0,0,0);
    System.out.println("Hello"); //works in the above code
}

public Box(){
    System.out.println("Hello");
    this(0,0,0); //does not work in the above code, this() must be the first statement in the constructor body
}

//H.W. for next lecture, see the basics of inheritance in Java/C++