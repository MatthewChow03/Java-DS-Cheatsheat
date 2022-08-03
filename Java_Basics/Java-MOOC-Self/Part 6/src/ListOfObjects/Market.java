package ListOfObjects;

import java.util.*;

public class Market {
    private String name;
    public int totalStocks;
    private ArrayList<Stock> stockList;

    public Market(String name) {
        this.name = name;
        this.stockList = new ArrayList<>();
    }

    public void addStock(Stock stock) {
        stockList.add(stock);
        totalStocks++;
    }

    // returns the Stock object of the highest priced Stock in the Market
    public Stock highestValueStock() {
        int indexOfHighest = 0;
        for (int i = 0; i < stockList.size(); i++) {
            if (stockList.get(i).price > stockList.get(indexOfHighest).price) {
                indexOfHighest = i;
            }
        }
        return stockList.get(indexOfHighest);
    }

    public void listMarket() {
        for (Stock s : stockList) {
            System.out.println(s.ticker + "\t$" + s.price);
        }
    }
}
