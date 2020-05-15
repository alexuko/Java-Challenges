package course.sortedcollections;
import java.util.Map;

public class Main {

    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem item = new StockItem("bread",0.75,5);
        stockList.addStock(item);
        item = new StockItem("sugar",1.5,5);
        stockList.addStock(item);
        item = new StockItem("milk",1.5,5);
        stockList.addStock(item);
        item = new StockItem("tomatoes",0.25,5);
        stockList.addStock(item);
        item = new StockItem("cucumber",2,5);
        stockList.addStock(item);
        item = new StockItem("almonds",0.55,5);
        stockList.addStock(item);
        System.out.println("=============  initial stock =============");
        System.out.println(stockList + "\n");


        //create a basket
        Basket alexBasket = new Basket("Alex");
        sellItem(alexBasket,"tomatoes",5);
        removeItem(alexBasket,"tomatoes",6);

        Basket sylwia = new Basket("Sylwia");
        sellItem(sylwia,"sugar",2);
        removeItem(sylwia,"sugar",1);
        checkOut(sylwia);
        checkOut(alexBasket);


        System.out.println(alexBasket);
        System.out.println(sylwia);




        System.out.println(stockList);

    }

    public static int sellItem(Basket basket, String item, int quantity) {
        // retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(stockList.reserveStock(item, quantity) != 0) {
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
        // retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unreserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkOut(Basket basket) {
        for (Map.Entry<StockItem, Integer> item : basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }

}
