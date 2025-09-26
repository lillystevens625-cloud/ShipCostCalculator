//Prompt user for item price
// If price >= 100, shipping = 0
// Else, shipping = 2% of price
// Output shipping and total cost

import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the price of the item: ");
        double price;
        double shipping;

        if (in.hasNextDouble()) {
            price = in.nextDouble();
            in.nextLine();

            if (price >= 100) {
                shipping = 0;
            } else {
                shipping = price * 0.02;
            }

            double total = price + shipping;
            System.out.println("Shipping cost: $" + shipping);
            System.out.println("Total cost: $" + total);

        } else {
            String trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
        }
    }
}
