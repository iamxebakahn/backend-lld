package May_6_Lab;

import java.util.PriorityQueue;

public class Order implements Comparable<Order>{
    private String orderId;
    private boolean isExpress; //T for Express, F for Regular


    public Order(String orderId, boolean isExpress) {
        this.orderId = orderId;
        this.isExpress = isExpress;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }


    @Override
    public int compareTo(Order other){
        if(this.isExpress &&  !other.isExpress)
            return -1;
        else if(!this.isExpress && other.isExpress)
            return 1;
        return 0;
    }




}
