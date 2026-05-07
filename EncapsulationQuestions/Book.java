package EncapsulationQuestions;

public class Book {
    private String title;
    private String author;
    private final String isbn;
    private int pages;
    private boolean isAvailable;


    public Book(String title, String author, String isbn, int pages) {
        setTitle(title);
        setAuthor(author);
        this.isbn = isbn;
        setPages(pages);
        setAvailable();
    }




    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setAvailable() {
        isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPages() {
        return pages;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void borrowBook(){
        boolean b = getIsAvailable();
        if (b){
            System.out.println("Book is not available:");
        }
        else{
            System.out.println("Book is available:");
        }
    }

    public void returnBook(){
        boolean r = getIsAvailable();
        if (r){
            System.out.println("Book is available:");
        }
        else{
            System.out.println("Book is not available:");
        }
    }


    public String toString(){
        return "Title is: "+ title + " Author is: "+ author+" ISBN is: "+ isbn+ " Pages are "+ pages;
    }

    static void main(String[] args) {
        Book b = new Book("The black Shadow", "Dostoveky ", "293929" , 98);
        b.borrowBook();
        b.returnBook();
        System.out.println(b.toString());
    }
}




//● Private fields: title (String), author (String), isbn (String), pages (int),
//isAvailable (boolean)
//● Constructor with title, author, isbn, pages (book starts as available)
//● Getter methods for all fields
//● borrowBook() method - sets isAvailable to false if currently available
//● returnBook() method - sets isAvailable to true if currently borrowed
//● getBookInfo() method - returns formatted string with book details
//● ISBN should not be changeable after creation




//public class Book {
//
//    private String title;
//    private String author;
//    private final String isbn;   // cannot change
//    private int pages;
//    private boolean isAvailable;
//
//    public Book(String title, String author, String isbn, int pages) {
//
//        setTitle(title);
//        setAuthor(author);
//        this.isbn = isbn;       // ISBN set once
//        setPages(pages);
//
//        isAvailable = true;     // book starts available
//
//        // automatic execution
//        System.out.println(getBookInfo());
//        borrowBook();
//        returnBook();
//    }
//
//    // setters
//    public void setTitle(String title){
//        this.title = title;
//    }
//
//    public void setAuthor(String author){
//        this.author = author;
//    }
//
//    public void setPages(int pages){
//        this.pages = pages;
//    }
//
//    // getters
//    public String getTitle(){
//        return title;
//    }
//
//    public String getAuthor(){
//        return author;
//    }
//
//    public String getIsbn(){
//        return isbn;
//    }
//
//    public int getPages(){
//        return pages;
//    }
//
//    public boolean getIsAvailable(){
//        return isAvailable;
//    }
//
//    // borrow method
//    public void borrowBook(){
//
//        if(getIsAvailable()){
//            isAvailable = false;
//            System.out.println("Book borrowed successfully");
//        }
//        else{
//            System.out.println("Book is not available");
//        }
//    }
//
//    // return method
//    public void returnBook(){
//
//        if(!getIsAvailable()){
//            isAvailable = true;
//            System.out.println("Book returned successfully");
//        }
//        else{
//            System.out.println("Book already available");
//        }
//    }
//
//    // book info method
//    public String getBookInfo(){
//
//        return "Title: " + getTitle() +
//                ", Author: " + getAuthor() +
//                ", ISBN: " + getIsbn() +
//                ", Pages: " + getPages() +
//                ", Available: " + getIsAvailable();
//    }
//
//    public static void main(String[] args) {
//
//        // sirf object create
//        Book b = new Book("The Black Shadow", "Dostoevsky", "293929", 98);
//
//    }
//}