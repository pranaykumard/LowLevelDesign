package ecommerce;

import java.util.PriorityQueue;
import java.util.Queue;

public class Order implements Comparable<Order> {
    private String orderID;
    private boolean isExpress;
    private int totalAmount;

    public Order(String orderID, boolean isExpress,int totalAmount) {
        this.orderID = orderID;
        this.isExpress = isExpress;
        this.totalAmount = totalAmount;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }

    @Override
    public int compareTo(Order o) {
        if(this.isExpress == o.isExpress) {
            return this.orderID.compareTo(o.orderID);//negative means added first
        }
        else if(this.isExpress)
            return -1;
        else
            return 1;
    }
}
