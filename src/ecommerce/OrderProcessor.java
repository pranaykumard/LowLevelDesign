package ecommerce;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class OrderProcessor {
    private Queue<Order> pq;
    public OrderProcessor() {
        pq = new PriorityQueue<>();
    }
    public void addOrder(Order order) {
        pq.offer(order);
    }
    public Order processOrder() {
        return pq.poll();
    }
}
