import java.util.TreeSet;
import java.util.Iterator;

class Book54 implements Comparable{
    private String bookname;
    private String author;
    private double price;

    public Book54(String bookname, String author, double price) {
        this.bookname = bookname;
        this.author = author;
        this.price = price;
    }
    //TreeSetdoes not have hashing, Hash prefix classes implement these classes.

    @Override
    public String toString() {
        return "Book54 [bookname=" + bookname + ", author=" + author + ", price=" + price + "]";
    }
    
    //b1 firstly added made it a BST root node
    //then b2 ws added then compareTo was called
    //comparing b1 and b2, then they werent swapped
    //then b2 compared to b3 and then it was added to the left cause
    //it was smaller than b2
    //just like a tree BST
    // and its not bigger, and its shorter and it went left.
    //it is bigger than b3 then went to right side.
    //trick to traverse bst in order traversal is
    //draw a line below each node and then draw a line to them left dont cross the stuff
    @Override
    public int compareTo(Object t){
        Book54 b = (Book54)t;
        if(this.price>b.price){
            return 1;
        }else if(this.price<b.price){
            return -1;
        }else{
            return 0;
        }
    }

}

public class Lecture54TreeSet {
    public static void main(String[] args) {
        TreeSet<Book54> books = new TreeSet<>();
        Book54 b1 = new Book54("Let Us C", "Kanetkar", 310);
        Book54 b2 = new Book54("Learning Java", "Patrick", 600);
        Book54 b3 = new Book54("Mastering C++", "Venugopal", 450);
        Book54 b4 = new Book54("Advance Java", "Cornell", 575);
        
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);

        for (Book54 b: books){
            System.out.println(b);
        }
        //thru iterator traversal
        System.out.println("Iterated with iterator: ");
        Iterator<Book54> it = books.iterator();
        while(it.hasNext()){
            Book54 b = it.next();
            System.out.println(b);
        }
    }
}

//NEXT CHALLENGE SORT BASED ON NAME OF THE BOOKS