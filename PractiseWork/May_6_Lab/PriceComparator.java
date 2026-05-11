package May_6_Lab;

import java.util.Comparator;

public class PriceComparator implements Comparator<Item> {
    @Override
    public int compare(Item item,Item other){
        if(item.getPrice()<other.getPrice())
            return -1;
        else if(item.getPrice()>other.getPrice())
            return 1;
        return 0;
    }
}
