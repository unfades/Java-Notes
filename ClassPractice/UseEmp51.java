import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Objects;

class Emp51 implements Comparable<Object>{

    int age;
    String name;
    int sal;

    @Override
    public int hashCode(){
        int hash = 3;
        return hash;
    }

    
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null) return false;
        
        if(getClass()!=obj.getClass()) return false;
        final Emp51 other = (Emp51)obj;
        if(this.age!=other.age) return false;
        if(Double.doubleToLongBits(this.sal)!=Double.doubleToLongBits(other.sal)) return false;
        if(!Objects.equals(this.name, other.name)) return false;
        return true;
    }

    public Emp51(int age, String name, int sal){
        this.age = age;
        this.name = name;
        this.sal = sal;
    }

    public void setSal(int sal){
        this.sal = sal;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void show(){
        System.out.println("Age = " + this.age + " Name = " + this.name + " Salary = " + this.sal);
    }

    @Override
    public String toString(){
        return "[ Age = " + this.age + " Name = " + this.name + " Salary = " + this.sal +"]";
    }

    public int get(){
        return this.sal;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    //o cannot access as parent reference cannot access child methods
    public int compareTo(Object t){
        Emp51 temp = (Emp51)t;
        //sort in Collections.sort says if it gets 1 then it will Swapping
        //if sort gets -1 or 0, then it will not Swap
        //this is compareTo()'s inner works, if pos, then swap, else do not swap
        if(this.age>temp.age){
            return -1;
        }else if(temp.age>this.age){
            return 1;
        }else{
            if(this.sal>temp.sal){
                return 1;
            }else if(temp.sal>this.sal){
                return -1;
            }else{
                return 0;
            }
        }
        //You can do all that in a one liner
        //But you gotta make the primitives declared and redeclare as Objects.
        //ex int to Integer, double to Double as seen above in the instance variables of the class.
        //AS WE ARE CALLING THE PREDEFINED COMPARETO in the Wrapper classes.
        //int result = this.age.compareTo(temp.age); return result;
    }

}

public class UseEmp51{
    public static void main(String[] args){

        ArrayList<Emp51> employees = new ArrayList<>();
        System.out.println("\n");
        System.out.println("program start");
        Emp51 Hav = new Emp51(22, "Hav", 1000_000);
        employees.add(Hav);
        Emp51 Ayuj = new Emp51(22, "Ayuj", 95_000);
        employees.add(Ayuj);
        Emp51 Abadon = new Emp51(35, "Abadon", 100_000);
        employees.add(Abadon);
        Emp51 Owen = new Emp51(24, "Owen", 90_000);
        employees.add(Owen);
        
        System.out.println("Before Sorting: ");
        for(Emp51 i: employees){
            i.show();
        }

        Collections.sort(employees); // WHY DOES THIS GIVE ERROR AND HOW TO REMOVE IT?

        System.out.println("After Sorting: ");
        for(Emp51 i: employees){
            i.show();
        }
    }
}

The new rule we learned is that

3. If we are adding objects of our own class in an ArrayList, and we wanna sort the ArrayList on the 
basis of some data member of our object using the method Collections.sort() then:

a. we must implement the interface Comparable in our class. It is from java.lang.
b. this interface has an abstract method called compareTo()
c. So we must override this method in our class.
d. Because when we call Collections.sort() then it internally calls compareTo() inside it.

Similar to how contains,remove,indexOf calls equals()

e. While overriding compareTo() we must remember that it must return >0 or <0 or 0.

f. If compareTo() returns pos then method sort() swaps the calling object and the object passed as arg.
g. If compareTo() returns neg or zero then no swapping will happen.