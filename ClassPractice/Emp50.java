import java.util.ArrayList;
import java.util.Scanner;


public class Emp50{

    int age;
    String name;
    int sal;
    
    public Emp50(int age, String name, int sal){
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

}

class UseEmp50{
    public static void main(String[] args){

        ArrayList<Emp50> employees = new ArrayList<>();
        System.out.println("\n");
        System.out.println("program start");
        Emp50 Hav = new Emp50(22, "Hav", 1000_000);
        employees.add(Hav);
        Emp50 Ayuj = new Emp50(29, "Ayuj", 95_000);
        employees.add(Ayuj);
        Emp50 Abadon = new Emp50(35, "Abadon", 100_000);
        employees.add(Abadon);
        Emp50 Owen = new Emp50(24, "Owen", 90_000);
        employees.add(Owen);
        
        //show employees
        for(Emp50 i: employees){
            i.show();
        }

        System.out.println("\n\n\n");

        /* 
        System.out.println("Before removing Abadon");
        System.out.println(employees);
        //remove one
        employees.remove(2);
        System.out.println("After removing Abadon");
        System.out.println(employees);
        */
        //ASK FROM THE USER WHO TO REMOVE:

        System.out.println("User, tell me who to remove from the List: ");
        for(Emp50 i: employees){
            i.show();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the User's Name, Age, Sal to Remove(ex: Hav 22 100000): ");
        String rem = sc.next();
        int age = sc.nextInt();
        int sal = sc.nextInt();

        for(int i = 0; i<employees.size(); i++){
            if(employees.get(i).get() == sal && employees.get(i).getName().equals(rem) && employees.get(i).getAge() == age){
                System.out.println("Found employee " + rem + " at " + i);
                employees.remove(i);
                System.out.println(employees);
                break;
            }
        }

        System.out.println("\n\n\n");
        
        System.out.println("Sorting the list based on Income Ascending");
        
        for(int i = 0; i<employees.size(); i++){
            for(int j = 0; j<employees.size(); j++){
                if(i==j) continue;
                if(employees.get(i).get()<employees.get(j).get()){
                    System.out.println("At i is "+ i+": ");
                    Emp50 temp = new Emp50(0,"s",0);
                    temp = employees.get(i);
                    //SOMETIMES IT IS MORE SIMPLE THAN YOU EVER REALIZE
                    //ADD FIRST, REMOVE LATER, SKIPPING THE HASSLE OF 
                    //REMOVING FIRST, ADDING LATER.
                    employees.add(i,employees.get(j));
                    employees.remove(i+1);
                    employees.add(j,temp);
                    employees.remove(j+1);
                    
                }
            }
        }
        System.out.println(employees);
        
    }
}

//TOBE CONTINUED TOMORROW