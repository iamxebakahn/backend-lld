package May_6_Lab;

import java.util.Comparator;

public class QuantityComparator implements Comparator<Item> {
    @Override
    public int compare(Item item,Item other){
        if(item.getQuantity()<other.getQuantity())
            return -1;
        else if(item.getQuantity()>other.getQuantity())
            return 1;
        return 0;
    }
}
