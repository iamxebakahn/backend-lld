package May_6_Lab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Inventory <T extends Item>{

    private HashMap<String ,T> mapOfItems;

    public Inventory() {
        mapOfItems = new HashMap<>();
    }

    public void addItem(T item) //: Add an item to the inventory.
    {
        mapOfItems.put(item.getId(),item);
    }
    public void removeItem(String id) //: Remove an item by id.
    {
        mapOfItems.remove(id);
    }
    public T getItem(String id) //: Retrieve an item by id.
    {
        return mapOfItems.get(id);
    }
    public Collection<T> getAllItems()  //: Return all items as a Collection<T>.
    {
        return mapOfItems.values();
    }

    public ArrayList<T> filterbyPriceRange(double minPrice,double maxPrice){
        ArrayList<T> filteredItems = new ArrayList<>();
        for(T item:mapOfItems.values())
        {
            if((item.getPrice()>=minPrice) && (item.getPrice()<=maxPrice))
                filteredItems.add(item);
        }

        return filteredItems;
    }

    public ArrayList<T> filterbyAvailability(){
        ArrayList<T> availableItems = new ArrayList<>();
        for(T item:mapOfItems.values())
        {
            if(item.getQuantity()>0)
                availableItems.add(item);
        }

        return availableItems;
    }
}
