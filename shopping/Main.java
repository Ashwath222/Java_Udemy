package shopping;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem stockItem = new StockItem("Bread", 1, 100);
        stockList.addStock(stockItem);
        stockItem = new StockItem("Jam",5,50);
        stockList.addStock(stockItem);
        stockItem = new StockItem("Butter", 2, 25);
        stockList.addStock(stockItem);
        System.out.println(stockList);

        Basket myBasket = new Basket("Odysseus");
        sellItem(myBasket, "Bread", 2);
        sellItem(myBasket, "Jam", 1);
        sellItem(myBasket, "Butter", 1);
        System.out.println(myBasket);
        removeItem(myBasket,"Butter", 1);
        System.out.println(myBasket);

        checkOut(myBasket);
        System.out.println(myBasket);

    }

    public static int sellItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell this item.");
            return 0;
        }
        if(stockList.reserveStock(item, quantity) > 0) {
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("This item doesn't exist in your basket.");
            return 0;
        }
        if(basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unReserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkOut(Basket basket) {
        for (Map.Entry<StockItem, Integer> item : basket.itemMap().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}
