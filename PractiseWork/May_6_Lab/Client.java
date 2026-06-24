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

        System.out.println("Task 1:Stream Basics and Map Transformation");
        Book b2 = new Book("B103", "Deep Work", 900, 12, "Cal Newport");
        Book b3 = new Book("B104", "Think Like Monk", 650, 8, "Jay Shetty");

        bookInventory.addItem(b2);
        bookInventory.addItem(b3);
        // Stream 1 : Print all IDs

        bookInventory.getAllItems().stream().map(item -> item.getId()).forEach(id -> System.out.println(id));

        System.out.println("----------------------------------------------");

        System.out.println("Printing all names in lowercase");

        List<String> lowercasenamelist= bookInventory.getAllItems().stream().map(item-> item.getName().toLowerCase()).toList();
        System.out.println(lowercasenamelist);

        // Stream 3 : Print name lengths

        List<Integer> namelengthlist =  bookInventory.getAllItems().stream().map(item -> item.getName().length()).toList();
        System.out.println(namelengthlist);

        //Task 2: Filtering and Matching
        bookInventory.getAllItems().stream().filter(book->book.getPrice()>1000).map(book -> book.getName()).forEach(bookname -> System.out.println(bookname));

          //Check if ANY item has quantity = 0

        boolean haszeroitem = bookInventory.getAllItems().stream().anyMatch(book -> book.getQuantity() == 0);
        System.out.println("Item with zero quantity"+haszeroitem);

        boolean nozeroitem = bookInventory.getAllItems().stream().allMatch(book -> book.getQuantity() > 0);
        System.out.println("All items have price >0 "+nozeroitem);

        boolean nonegativeitem = bookInventory.getAllItems().stream().noneMatch(book -> book.getQuantity() < 0);
        System.out.println("No item have price <0 "+nonegativeitem);

        //Task 3: Combined Stream Operations
        List<String> booklistwithcombinedstream= bookInventory.getAllItems().stream().filter(book -> book.getPrice() >0 && book.getQuantity()>0).map(book -> book.getName()).distinct().sorted().limit(5).toList();
        System.out.println(booklistwithcombinedstream);

        // Task 4: Reduce for Aggregation
        int totalQuantity = bookInventory.getAllItems().stream().map(book -> book.getQuantity()).reduce(0,(totalquantity,quantity) -> totalquantity + quantity);
        System.out.println("Total Quantity"+totalQuantity);

        //Find the most expensive item using reduce()
        double mostexpensivebook = bookInventory.getAllItems().stream().map(book -> book.getPrice()).reduce(0.0,(price1,price2) -> price1>price2 ? price1:price2);
        System.out.println("Maximum Price : " + mostexpensivebook);

        Book mostexpensivebook1 = bookInventory.getAllItems().stream().reduce((book11,book22) -> book11.getPrice() >book22.getPrice() ? book11 :book22).orElse(null);
        if(mostexpensivebook1!=null){
            System.out.println("Most Expensive book name:"+mostexpensivebook1.getName()+"Most Expensive book price:"+mostexpensivebook1.getPrice());
        }

        String concatenatedNames = bookInventory.getAllItems().stream().map(book -> book.getName()).reduce(" ",(finalconcatenatedbook,book2) -> finalconcatenatedbook.isEmpty() ? book2 : finalconcatenatedbook +","+ book2);
        System.out.println("All books together:"+concatenatedNames);
    }
}

