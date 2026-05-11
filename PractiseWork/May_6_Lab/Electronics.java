package May_6_Lab;

public class Electronics extends Item {  // Milestone A: Task 2
    private int warranty;   // Milestone A: Task 2

    public Electronics(String id, String name, double price, int quantity, int warranty) {
        super(id, name, price, quantity);
        this.warranty = warranty;
    }
}
