import Product.ProductTemplate;
import Product.Products;
import menu.MenuSelect;
import paymentUI.CheckOut;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Welcome to the noise hole");
        System.out.println("Menu items include: ");


        for (ProductTemplate productTemplate : Products.productList) {
            productTemplate.printProductInfo();
        }

        Scanner inputTwo = new Scanner(System.in);
        String test = "No";

        boolean ordering = true;
        while (ordering) {
            System.out.println("Please input the item number you wish to purchase: ");
            MenuSelect.addToCart();
            System.out.println("Checkout yes no ");
            test = inputTwo.next();
            if (test.equalsIgnoreCase("Yes")) {
                ordering = false;
                CheckOut.CheckOut();
            } else {
                System.out.println("Returning to selection input");
            }

        }

    }

}
