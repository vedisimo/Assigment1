package assig1;

public class Chocolate extends Product {

    int weight;

    public Chocolate(String productName, int barCode, int price, int weight) {
        super(productName, barCode, price);

        this.weight = weight;
    }

    @Override
    public double price() {
        return price + tax;
    }

    @Override
    public String toString() {
        return "Product: " + productName + "\nBar Code: " + barCode + "\nPrice: " 
                + price + " forints" + "\nWeight: " + weight + " grams" + "\nTax: " + tax + " forints" +"\n"
                +"------------------------------------------------------------------------------------------";
        
    }
}
