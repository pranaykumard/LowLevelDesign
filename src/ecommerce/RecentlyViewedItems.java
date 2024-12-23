package ecommerce;

import java.util.LinkedList;

public class RecentlyViewedItems {
    LinkedList<Item> recentlyViewedItems;
    static int MAX_SIZE = 3;
    public RecentlyViewedItems() {
        this.recentlyViewedItems = new LinkedList<Item>();
    }
    public LinkedList<Item> getRecentlyViewedItems() {
        return recentlyViewedItems;
    }
    public void setRecentlyViewedItems(Item item) {
        recentlyViewedItems.remove(item);
        recentlyViewedItems.addFirst(item);
        if (recentlyViewedItems.size() > MAX_SIZE) {
            recentlyViewedItems.removeLast();
        }

    }

}
