package May_6_Lab;

public class Item implements Comparable<Item> {   // Milestone A: Task 1   Milestone A: Task 3
    private String id ;//(unique identifier).   Milestone A: Task 1
    private String name ;//(name of the item).  Milestone A: Task 1

    private double price ;// (price of the item).  Milestone A: Task 1
    private int quantity ; //(quantity in stock).  Milestone A: Task 1

    public Item(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Milestone A: Task 3
    @Override
    public int compareTo(Item other){
        return this.getName().compareTo(other.getName());

//        if(this.getName().compareTo(other.getName()))
//            return -1;
//        else if(this.getName() > other.getName())
//            return 1;
//        else
//            return 0;
    }
}
