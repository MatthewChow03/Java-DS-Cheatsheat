package ListOfObjects;

public class Stock {
    protected String ticker;
    protected double price;

    public Stock(String ticker, double price) {
        this.ticker = ticker;
        this.price = price;
    }

    public void increaseStockPrice(double valIncrease) {
        this.price = this.price + valIncrease;
    }

    public void printPrice() {
        System.out.println(this.price);
    }

}
