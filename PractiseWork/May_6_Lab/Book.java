package May_6_Lab;

public class Book extends Item {   // Milestone A: Task 2
    private String author;  // Milestone A: Task 2

    public Book(String id, String name, double price, int quantity,String author) {
        super(id, name, price, quantity);
        this.author = author;
    }

}
