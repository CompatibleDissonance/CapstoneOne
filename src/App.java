import Product.ProductTemplate;
import Product.Products;
import menu.MenuSelect;
import paymentUI.CheckOut;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // welcome message
        System.out.println("Welcome to the Derelict Beat Cafe");
        System.out.println("Menu items include: ");

        // loop through the ArrayList items and print
        for (ProductTemplate productTemplate : Products.productList) {
            productTemplate.printProductInfo();
        }
        // Scanner for checkout
        Scanner inputTwo = new Scanner(System.in);

        // Not actually redundant without this i can't use line 30
        String test = "";

        // ordering control to prevent loop feedback after "Checkout" is activated
        boolean ordering = true;
        while (ordering) {
            System.out.println("Please input the item number you wish to purchase: ");
            MenuSelect.addToCart();
            System.out.println("Checkout yes no ");
            test = inputTwo.nextLine();
            if (test.equalsIgnoreCase("Yes")) {
                ordering = false;
                CheckOut.CheckOut();
            } else {
                // returns to start of while loop.
                System.out.println("Returning to selection input");
            }
        }

    }

}
