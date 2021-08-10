package menu;

import Product.Products;

import java.util.Scanner;

public class MenuSelect<purchaseInput> {
    public static void addToCart() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the item number you wish to purchase: ");
        int purchaseInput = input.nextInt();

        switch (purchaseInput) {
            case 1:
                System.out.println(Products.Glitches.getSongName() + " added to cart");
                break;

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
    }

}
