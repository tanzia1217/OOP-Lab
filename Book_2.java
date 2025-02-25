public class Book_2 {
    String title;
    double price;

    Author author;

    public Book_2(String title,double price,Author author)
    {
        this.title=title;
        this.price=price;
        this.author=author;


    }

    void display()
    {
        System.out.println("Title: "+title+ " "+"Price: "+price);
        System.out.println("Author: "+author.name+" "+"Fiction Name: "+ author.Fiction_name);
    }

    public static void main(String[] args) {
        Author author=new Author("Sinthia","Suspense");

        Book_2 book_2=new Book_2("Amazon",590.5,author);
        book_2.display();



    }
}


class Author{
    String name;
    String Fiction_name;

    public Author(String name,String Fiction_name)
    {
        this.name=name;
        this.Fiction_name=Fiction_name;

    }

    void display(){
        System.out.println("Name: "+name+" "+"Fiction Name: "+Fiction_name);
    }

}
