public class Book {
 String title;
 String author;
 double price;


    public Book() {
        title = "LIFE STORY";
        author = "S R K";
        price = 15.0;
    }


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
      //  this.price = 15.0;
        }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void printBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book object1= new Book();
        Book object2= new Book("P","Q");
        Book object3= new Book("R","S",15);
object1.printBookDetails();
object2.printBookDetails();
object3.printBookDetails();
} }


