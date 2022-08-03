/**
 *
 * Topic:
 *
 * Objects with lists as a part of the object
 * References vs primitives (notice how changing the Stock price affects the one in the Market ArrayList)
 *
 */
package ListOfObjects;

public class Main {
    public static void main(String[] args) {
        Market nasdaq = new Market("nasdaq");

        Stock tesla = new Stock("Tesla", 800.99);
        Stock apple = new Stock("Apple", 125.70);
        Stock meta = new Stock("Meta", 279.45);

        nasdaq.addStock(tesla );
        nasdaq.addStock(apple );
        nasdaq.addStock(meta );

        tesla.increaseStockPrice(199.01);   // since the Market ArrayList stores a pointer to the stock, the value will change

        nasdaq.listMarket();

        System.out.print("The highest valued stock out of " + nasdaq.totalStocks + " stocks is $");
        nasdaq.highestValueStock().printPrice();

    }
}
