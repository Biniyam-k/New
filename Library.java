public class Main {
    public static void main(String[] args) {

        Book Book1 = new Book();
        Book1.bookName();
        Book1.author();
        Book1.dateBorrowed();
        Book1.dateReturned();


    }
}



public class Book {
    String bookName;
    String author;
    String edition;
    String dateBorrowed;
    String dateReturned;

    public String bookName() {
        return bookName;
    }
    public String author() {
        return author;
    }
    public String edition(){
        return edition;
    }
    public String dateBorrowed(){
        return dateBorrowed;
    }
    public String dateReturned(){
        return dateReturned;
    }
}
