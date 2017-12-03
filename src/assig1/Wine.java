package assig1;

public class Wine extends Product {

    int bottleDisplacement;
    final int wineTax = 10;

    public Wine(String productName, int barCode, int price, int bottleDisplacement) {
        super(productName, barCode, price);
        this.bottleDisplacement = bottleDisplacement;

    }

    @Override
    public double price() {
        return price + tax + wineTax;
    }

    @Override
    public String toString() {
        return "Product: " + productName + "\nBar Code: " + barCode + "\nPrice: " + price + " forints" +"\nBottle displacement: " + bottleDisplacement + " ml" + "\nTax: " + tax + " forints" + "\nExtra tax for wine: " + wineTax + " forints";
    }
}
