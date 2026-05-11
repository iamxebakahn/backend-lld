package May_6_Lab;

import java.util.PriorityQueue;

public class OrderProcessor {
    private PriorityQueue<Order> orderPriorityQueue;

    public OrderProcessor() {
        orderPriorityQueue = new PriorityQueue<>();
    }

    public void addOrder(Order order){
        orderPriorityQueue.add(order);
    }


    public Order processOrder(){
        return orderPriorityQueue.poll();
    }


}
