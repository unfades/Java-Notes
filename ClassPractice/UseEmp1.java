class Emp1{

    public Emp1(){
        System.out.println("Constructor called");
    }

    static{
        System.out.println("Static block executed");
    }
}

class UseEmp1{
    public static void main(String[] args){
        System.out.println("Happy Navratri");
    }
}

//The output is Happy Navratri because the class Emp1 wasn't even used in main()

class Emp1{

    public Emp1(){
        System.out.println("Constructor called");
    }

    static{
        System.out.println("Static block executed");
    }
}

class UseEmp1{
    public static void main(String[] args){
        System.out.println("Happy Navratri");
        Emp1 E;
    }
}

//Still the output is Happy Navratri because an object was not made.
//Emp1 E is an object reference. No object was made yet.

class Emp1{

    public Emp1(){
        System.out.println("Constructor called");
    }

    static{
        System.out.println("Static block executed");
    }
}

class UseEmp1{
    public static void main(String[] args){
        System.out.println("Happy Navratri");
        Emp1 E = new Emp1();
    }
}

//Now we get output, because we made an object of Emp1
//output now is
//Happy Navratri
//static block executed
//constructor called

//since whenever an object of a class is made, or static variable is accessed of the class
//if it has a static block it is executed

class Emp1{

    public Emp1(){
        System.out.println("Constructor called");
    }

    static{
        System.out.println("Static block executed");
    }
}

class UseEmp1{
    public static void main(String[] args){
        System.out.println("Happy Navratri");
        Emp1 E = new Emp1();
        Emp1 F = new Emp1();
        Emp1 G = new Emp1();
    }
}
/*
Output is now:
Happy Navratri
static block executed 
constructor called 
constructor called 
constructor called
*/

class Emp1{

    static int PI = 3.14156;

    public Emp1(){
        System.out.println("Constructor called");
    }

    static{
        System.out.println("Static block executed");
    }
}

class UseEmp1{
    public static void main(String[] args){
        System.out.println(Emp1.PI);
    }
}

/*
The output is:
static block executed
3.14156
*/
//since PI is a static member of Emp1
//even PI comes after.
//what if PI is accessed twice?

class Emp1{

    static int PI = 3.14156;

    public Emp1(){
        System.out.println("Constructor called");
    }

    static{
        System.out.println("Static block executed");
    }
}

class UseEmp1{
    public static void main(String[] args){
        System.out.println(Emp1.PI);
        System.out.println(Emp1.PI);
    }
}
/*
The output is:
static block executed
3.14156
3.13156
 */

 Q.How many static blocks in a class?
 A. As many as you want, your choice.

 Q.In what order are multiple static blocks executed?
 A. They are executed in the order they are written top to bottom

 class Emp1{

    static int PI = 3.14156;

    public Emp1(){
        System.out.println("Constructor called");
    }

    static{
        System.out.println("Static block 2 executed");
    }

    static{
        System.out.println("Static block 1 executed");
     }
    
     static{
        System.out.println("Static block 3 executed");
     }
}

class UseEmp1{
    public static void main(String[] args){
        
        System.out.println(Emp1.PI);
        System.out.println(Emp1.PI);

    }
}

/*
Output is:
static block 2 executed
static block 3 executed
static block 1 executed
3.14156
4.14156
 */

 Q. Can static blocks be defined within the class methods?
 A. NO YOU ARE GONNA GET AN ERROR. IT IS NOT ALLOWED.

 class Emp1{

    static int PI;
    static{
        PI = 3.14;
    }
}

class UseEmp1{
    public static void main(String[] args){
        
        System.out.println(Emp1.PI);
    }
}

/*
Output is:
3.14
 */

 class Emp1{

    static int PI = 3.14;
    static{
        PI = 10;
    }
}

class UseEmp1{
    public static void main(String[] args){
        
        System.out.println(Emp1.PI);
    }
}
//Output is:
//10.0
//3.14 is overwritten and made to 10.0 as static block ran as soon as a static variable was accessed.


Q. can you write like this?
class A{
    private static{

    }
}

or 

class A{
    void static{

    }
}

or

static{
    private double PI = 20;
    break;
}

A. NO, these are blocks, like if blocks, etc.
Just like if statements do not return anything,
then static blocks also return nothing.
NO RETURN TYPE, NO ACCESS MODIFIER.
NO. You cannot write break outside switch or loop

meaning you need to have a switch statement or a loop inside the static block like this

static{
    switch(1){
        case 1:
            System.out.println("Now break works cause inside a switch inside a static block");
            break;
    }
}
======================================================
class Emp1{
    private double PI = 3.14156;
    static{
        System.out.println("Static block executed");
    }
    public Emp1(){
        int age = 25;
        String name = "Havi";
        System.out.println("Constructor executed");
    }
    public void show(){
        System.out.println("age = " + age + " name = " + name);
    }
}
class UseEmp1{
    public static void main(String[] args){
        Emp1 E = new Emp1();
        E.show();
    }
}

/*
Output:
Stati block executed
Constructor executed
age = 25 name = Havi
 */

 class Emp1{
    private double PI = 3.14156;
    static{
        System.out.println("Static block executed");
    }
    public Emp1(){
        int age = 25;
        String name = "Havi";
        System.out.println("Constructor executed");
    }
    public void show(){
        System.out.println("age = " + age + " name = " + name);
    }
}
class UseEmp1{
    public static void main(String[] args){
        Emp1 E = new Emp1();
        E.show();
    }
}

Q.Can static methods access nonstatic variables of a class?
A. No because static methods are not accessed via making objects,
so no instance variables for static methods. As they are called with class name.


Q. Can we access non static data like this?
class Emp1{
    private double PI = 3.14156;
    //can we do this?
    private int age = 25;
    private String name = "Havi";
    static{
        //can we do this?
        age = 25;
        name = "Havi";
        System.out.println("Static block executed");
    }
    public Emp1(){
        System.out.println("Constructor executed");
    }
    public void show(){
        System.out.println("age = " + age + " name = " + name);
    }
}
class UseEmp1{
    public static void main(String[] args){
        Emp1 E = new Emp1();
        E.show();
    }
}

A. NO WE CANNOT ACCESS NONSTATIC DATA from STATIC CONTEXT
e.show() uses the instance variables, however they cannot be initialized within the 
static block because it has no name. you cannot say obj.static 

Q. Ultimately What do static blocks do in Java?
A. One-time initialization and that too for static data.

Final conclusion regarding static blocks:

A static block is used by Java to initialize only static data of the class or 
execute a piece of code only once.

