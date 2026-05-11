package May_6_Lab;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.*;
import java.util.Collections;


public class Client { // Milestone A: Task 4
    public static void main(String[] args) { // Milestone A: Task 4

        List<Item> items = new ArrayList<>(); // Milestone A: Task 4
        items.add(new Electronics("E101","Laptop",50000,5,2)); // Milestone A: Task 4
        items.add(new Clothing("C101","TShirt", 1200, 10, "M")); // Milestone A: Task 4
        items.add(new Book("B101", "Atomic Habits", 700, 15, "James Clear")); // Milestone A: Task 4
        items.add(new Electronics("E102", "Phone", 40000, 8, 1)); // Milestone A: Task 4
        System.out.println("Before sorting");

        // Milestone A: Task 4
        for(Item item:items)
        {
            System.out.println(item.getId()+" "+item.getName()+" "+item.getPrice()+" "+item.getQuantity());
        }
        Collections.sort(items) ;
        System.out.println("----------------------------------------------");

        System.out.println("After sorting");
        for(Item item:items)
        {
            System.out.println(item.getId()+" "+item.getName()+" "+item.getPrice()+" "+item.getQuantity());
        }

        System.out.println("----------------------------------------------");

        Collections.sort(items, new PriceComparator());

        System.out.println("----------------------------------------------");


        Collections.sort(items, new QuantityComparator());

        System.out.println("----------------------------------------------");

        Inventory<Book> bookInventory = new Inventory<>();
        Book b1 = new Book("B102", "Atomic Tender", 500, 20, "Wasim Khan");
        bookInventory.addItem(b1);
        Book fetchedBook = bookInventory.getItem(b1.getId());

        Inventory<Electronics> electronicsInventory = new Inventory<>();

        Electronics e1 = new Electronics("E101", "Laptop", 70000, 5, 2);
        electronicsInventory.addItem(e1);

        Inventory<Clothing> clothingInventory = new Inventory<>();

        Clothing c1 = new Clothing("C101", "TShirt", 1500, 20, "M");
        clothingInventory.addItem(c1);

        for(Book book : bookInventory.getAllItems())
        {
            System.out.println(book.getId() + " " + book.getName());
        }

        bookInventory.removeItem(b1.getId());

        for(Book book : bookInventory.getAllItems())
        {
            System.out.println(book.getId() + " " + book.getName());
        }
        System.out.println("----------------------------------------------");

        RecentlyViewedItems tracker = new RecentlyViewedItems();
        tracker.addRecentlyViewedItem(b1);
        tracker.addRecentlyViewedItem(e1);
        tracker.addRecentlyViewedItem(c1);
        tracker.printRecentlyItems();


        Order o1 = new Order("O101", false);
        Order o2 = new Order("O102", false);
        Order o3 = new Order("O103", true);
        OrderProcessor processor = new OrderProcessor();
        processor.addOrder(o1);
        processor.addOrder(o2);
        processor.addOrder(o3);

        System.out.println((processor.processOrder().getOrderId()));
        System.out.println((processor.processOrder().getOrderId()));
        System.out.println((processor.processOrder().getOrderId()));

        System.out.println("----------------------------------------------");

        ArrayList<Book> availablebooks= bookInventory.filterbyAvailability();
        for(Book book:availablebooks)
        {
            System.out.println(book.getId()+book.getName());
        }

        System.out.println("----------------------------------------------");
        ArrayList<Book> filteredbooks=bookInventory.filterbyPriceRange(200,600);
        for(Book book:filteredbooks)
        {
            System.out.println(book.getId()+book.getName());
        }
    }
}

