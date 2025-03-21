/*
class Person{

    private int age;
    private String name;

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }
}

class Lecture45UsePerson{

    public static void main(String[] args){
        System.out.println();
        Person p = new Person(25, "Havi");
        System.out.println(p); //address of p is 6000
        String p2 = new String("Sachin");
        System.out.println(p2);
    }
}
*/

class Person{

    private int age;
    private String name;

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return age+ "," + name;
    }
}

class Lecture45UsePerson{

    public static void main(String[] args){
        System.out.println();
        //recommended to override toString() of object
        //in our user defined classes
        //now its fixed
        Person p = new Person(25, "Havi");
        System.out.println(p); //address of p is 6000
        String p2 = new String("Sachin");
        System.out.println(p2);
    }
}
