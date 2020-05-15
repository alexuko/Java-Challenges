package course.sortedcollections;

public class MainChallenge {
    private static StockList stockList = new StockList();
    public static void main(String[] args) {
        StockItem stockItem = new StockItem("Milk",1.45,50);
        stockList.addStock(stockItem);
        stockItem = new StockItem("Bread",0.45,50);
        stockList.addStock(stockItem);
        stockItem = new StockItem("eggs",2.75,50);
        stockList.addStock(stockItem);
        stockItem = new StockItem("Cereal",1.65,50);
        stockList.addStock(stockItem);

        System.out.println(stockList);


    }




}
