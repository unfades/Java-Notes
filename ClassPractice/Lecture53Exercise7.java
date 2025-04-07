import java.util.HashSet;

class Book{
    private String name;
    private String author;
    private Double price;

    public Book(String name, String author, Double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }

    

    @Override
    public String toString(){
        return this.name + "," + this.author + ","  + this.price;
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + ((price == null) ? 0 : price.hashCode());
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
        Book other = (Book) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (author == null) {
            if (other.author != null)
                return false;
        } else if (!author.equals(other.author))
            return false;
        if (price == null) {
            if (other.price != null)
                return false;
        } else if (!price.equals(other.price))
            return false;
        return true;
    }

}

class Library{

    HashSet<Book> set = new HashSet<>();

    public void addBook(Book b1){
        set.add(b1);
    }

    public int getBookCount(){
        return set.size();
    }

    public void getAllBooks(){
        //System.out.println(set);
        for(Book b: set){
            System.out.println(b);
        }
    }
}


public class Lecture53Exercise7 {
    public static void main(String[] args) {
        Book b1 = new Book("The Deathly Hallows", "J.K. Rowling", 20.0);
        Book b2 = new Book("Fantastic Beasts and Where to Find Them", "J.K. Rowling", 15.0);
        Book b3 = new Book("1984", "George Orwell", 25.0);
        Book b4 = new Book("Demon Slayer", "Koyoharu Gotouge", 30.0);

        Library myLibrary = new Library();
        myLibrary.addBook(b1);
        myLibrary.addBook(b2);
        myLibrary.addBook(b3);
        myLibrary.addBook(b4);

        System.out.println("The Library Contains The Following Books: ");
        System.out.println("Here they are for you to gloriously checkout: ");
        myLibrary.getAllBooks();
    }
}


//THIS IS A HAS A RELATION IN OOPS IT IS CALLED COMPOSITION RELATION

//BECAUSE LIBRARY HAS BOOKS

//NOT LIBRARY IS A BOOK