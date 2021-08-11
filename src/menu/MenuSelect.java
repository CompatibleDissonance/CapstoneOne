package menu;

import Product.ProductTemplate;
import Product.Products;

import java.util.Scanner;

public class MenuSelect<purchaseInput> {

    public static double addToCart() {
        double total = 0;
        Scanner input = new Scanner(System.in);
        // user input scanner
        int purchaseInput = input.nextInt();

        // switch statement for selections
        switch (purchaseInput) {
            case 1:
                System.out.println(Products.Glitches.getSongName() + " added to cart");
                return Products.Glitches.getPrice();

            case 2:
                System.out.println(Products.NYCompression.getSongName() + " added to cart");
                break;

            case 3:
                System.out.println(Products.BadMood.getSongName() + " added to cart");
                break;

            case 4:
                System.out.println(Products.Sleuth.getSongName() + " added to cart");
                break;

            default:
                System.out.println(purchaseInput + " " + "Is an invalid selection");
        }
        return total;
    }

}
