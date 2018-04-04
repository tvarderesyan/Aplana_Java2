import Construcror.*;

/**
 * Created by MY on 04.04.2018.
 */
public class task4_newYearGift {


    public static void main(String[] args) {
        System.out.println("New Year Gift box composition: ");
        Biscuit biscuit1 = new Biscuit("Choco", 100.2, 15.3, "yellow");
        Candy candy1 = new Candy("Candy", 29.0, 50.3, "whitechocolate");
        Jellybean jelly1 = new Jellybean("Jellybean", 120.30, 300.8, "BearJelly");
        Waffles waffles1 = new Waffles("Waffles", 55.50, 200.5, "MilkCow");

        Staff[] gift = {biscuit1, candy1, jelly1, waffles1};
        for (Staff somestaff : gift) {
            System.out.println(somestaff.toString());
        }
        System.out.print("\nTotal cost of New Year Gift: ");
        System.out.println(biscuit1.price + candy1.price + jelly1.price + waffles1.price);
        System.out.print("Total Weight of New Year Gift: ");
        System.out.println(biscuit1.weight + candy1.weight + jelly1.weight + waffles1.weight);
    }
}
