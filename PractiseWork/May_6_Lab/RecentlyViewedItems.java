package May_6_Lab;

import java.util.LinkedList;

public class RecentlyViewedItems {
    private LinkedList<Item> recentItems;

    public RecentlyViewedItems() {
        recentItems = new LinkedList<>();
    }

    public void addRecentlyViewedItem(Item item){
        if(recentItems.size()==10)
        {
            recentItems.removeFirst();
        }

        recentItems.addLast(item);
    }

    public void printRecentlyItems(){
        for(Item item:recentItems)
        {
            System.out.println(item.getId()+" "+item.getName());
        }
    }
}
