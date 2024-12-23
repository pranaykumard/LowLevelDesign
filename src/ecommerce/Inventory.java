package ecommerce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory<T extends Item> {
    private HashMap<String,T> items;
    public void addItem(T item){
        items.put(item.getId(),item);
    }
    public Inventory() {
        this.items = new HashMap<>(); // Initialize the HashMap
    }
    public void removeItem(T item){
        items.remove(item.getId());
    }
    public T getItem(String id){
        return items.get(id);
    }
    public List<T> getAllItems(){
        return new ArrayList<T>(items.values());
    }

}
