package assig1;

public class Test {

    public static void main(String[] args) {

        Chocolate chocolate = new Chocolate("Milka", 56789101, 200, 100);
        System.out.println(chocolate);
        System.out.println("Total price: " + chocolate.price() + " forints");

        System.out.println("-------------------------------------------------");

        Wine wine = new Wine("Red Wine", 67891017, 200, 500);
        System.out.println(wine);
        System.out.println("Total price: " + wine.price() + " forints");
        
        System.out.println("Vedad napravio jednu promjenu!!");
            
        System.out.println("Neka promjena 2");
    }

}
