package May_6_Lab;

public class Clothing extends Item {  // Milestone A: Task 2
    private String size;   // Milestone A: Task 2

    public Clothing(String id, String name, double price, int quantity, String size) {
        super(id, name, price, quantity);
        this.size = size;
    }
}
