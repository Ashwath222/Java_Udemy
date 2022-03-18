package shopping;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {

    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    public int addStock(StockItem stockItem) {
        if(stockItem != null) {
            StockItem item = list.getOrDefault(stockItem.getName(), stockItem);
            if(item != stockItem) {
                item.adjustStock(item.availableQuantity());
            }
            list.put(item.getName(), item);
            return item.availableQuantity();
        }
        return 0;
    }

    public int sellStock(String item, int quantity) {
        StockItem stockItem = list.get(item);

        if((stockItem != null ) && (quantity > 0)) {
            return stockItem.finaliseStock(quantity);
        }
        return 0;
    }

    public int reserveStock(String item, int quantity) {
        StockItem stockItem = list.get(item);

        if((stockItem != null ) && (quantity > 0)) {
            return stockItem.reserveStock(quantity);
        }
        return 0;
    }

    public int unReserveStock(String item, int quantity) {
        StockItem stockItem = list.get(item);

        if((stockItem != null ) && (quantity > 0)) {
            return stockItem.unReserveStock(quantity);
        }
        return 0;
    }

    public StockItem get(String key) {
        return list.get(key);
    }

    public Map<String, Double> priceList() {
        Map<String, Double> prices = new LinkedHashMap<>();
        for(Map.Entry<String, StockItem> item : list.entrySet()) {
            prices.put(item.getKey(), item.getValue().getPrice());
        }
        return Collections.unmodifiableMap(prices);
    }

    public Map<String, StockItem> itemMap() {
        return  Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost = 0.0;
        for (Map.Entry<String, StockItem> item : list.entrySet()) {
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.availableQuantity();

            s = s + stockItem + ". There are " + stockItem.availableQuantity() + " in stock. Value of items: ";
            s = s + String.format("%.2f",itemValue) + "\n";
            totalCost += itemValue;
        }
        return s + "Total stock value " + totalCost;
    }
}
