package assig1;

public abstract class Product {

    String productName;
    int barCode;
    int price;
    final int tax = 20;

    public Product(String productName, int barCode, int price) {
        this.productName = productName;
        this.barCode = barCode;
        this.price = price;
    }

    public double price() {
        return price + tax;
    }

    @Override
    public String toString() {
        return "Product: " + productName + "Bar Code: " + barCode + "Price: " + price + "Tax: " + tax;
    }
}
