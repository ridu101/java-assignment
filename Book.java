public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;
    public Book() {
        this.title = "No Title";
        this.author = "No Author";
        this.yearPublished = 1900;
        this.price = 0.0;
    }   
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.yearPublished = 1900;
        this.price = 0.0;
    }   
    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    } 
    public void setTitle(String title) {
        this.title = title;
    }    
    public String getTitle() {
        return title;
    }    
    public void setAuthor(String author) {
        this.author = author;
    }    
    public String getAuthor() {
        return author;
    }    
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }    
    public int getYearPublished() {
        return yearPublished;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Price: $" + price);
    }
    public static void main(String[] args) {
        Book book1 = new Book(); // Default constructor
        Book book2 = new Book("Java Programming", "John Doe"); // Constructor with title and author
        Book book3 = new Book("Design Patterns", "Gang of Four", 1994, 45.99); // Constructor with all parameters        
        book1.setTitle("Clean Code");
        book1.setAuthor("Robert C. Martin");
        book1.setYearPublished(2008);
        book1.setPrice(35.50);
        System.out.println("Book 1 Information:");
        book1.displayBookInfo(); 
        System.out.println("\nBook 2 Information:");
        book2.displayBookInfo(); 
        System.out.println("\nBook 3 Information:");
        book3.displayBookInfo();
    }
}

