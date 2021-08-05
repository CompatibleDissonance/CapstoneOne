import Product.ProductTemplate;
import Product.Products;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the noise hole");
        System.out.println("Menu items include: ");


        for (ProductTemplate productTemplate : Products.productList) {
            productTemplate.printProductInfo();
        }

        //System.out.println("Song Name: " + Products.Glitches.getSongName() + " " + "Price: $" + Products.Glitches.getPrice()+ " AUD");
        //System.out.println("Song Name " + Products.NYCompression.getSongName() + " " + "Price: $" + Products.NYCompression.getPrice() +" AUD");
        //System.out.println("Song Name: " + Products.BadMood.getSongName() + " " + "Price: $" + Products.NYCompression.getPrice() + " AUD");


        Scanner input = new Scanner(System.in);
        String purchaseInput = "";

        while (true) {
            System.out.println("Please enter the NAME of the song you want to purchase: ");
            purchaseInput = input.next();

            if (purchaseInput.equalsIgnoreCase(Products.Glitches.getSongName())) {
                break;

            } else {
                System.out.println(purchaseInput + " Is not an available product");
                   }
            }
            System.out.println("You have selected: " + purchaseInput);
            input.close();

            if(purchaseInput.equalsIgnoreCase(Products.Glitches.songName)) {
                System.out.println(Products.Glitches.getPrice());
            }
    }
}
