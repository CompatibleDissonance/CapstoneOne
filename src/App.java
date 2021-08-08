import Product.ProductTemplate;
import Product.Products;
import menu.MenuSelect;


import java.awt.*;
import java.util.Scanner;

public class App {
    static boolean ordering = true;

    public static void done(double total) {
        boolean ordering = false;

        System.out.println("Debug Deez nuts");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the noise hole");
        System.out.println("Menu items include: ");


        for (ProductTemplate productTemplate : Products.productList) {
            productTemplate.printProductInfo();
        }

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

            default:
                System.out.println(purchaseInput + " " + "Is an invalid selection");
        }


        System.out.println("please enter your email: ");

        String emailInput = input.next();
        System.out.println("Your order will be delivered to: " + emailInput);

        System.out.println("Please enter the following payment details!");

        System.out.println("Name on card: ");
        String cardName = input.next();

        System.out.println("Card number: ");
        Long cardNumber = input.nextLong();

        System.out.println("Card expiry date: ");
        int cardExpDate = input.nextInt();

        System.out.println("Card security code (3(Three) digits on the back): ");
        int cardSecCode = input.nextInt();

        System.out.println("Thank you for your purchase! please check your email (" + emailInput + ") for your download link!");

    }

}
